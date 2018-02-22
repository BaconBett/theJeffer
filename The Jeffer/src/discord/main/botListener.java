package discord.main;

import discord.api.commandProcessor;
import sx.blah.discord.api.events.EventSubscriber;
import sx.blah.discord.handle.impl.events.guild.channel.message.MessageReceivedEvent;

public class botListener {

	public static String prefix = new String("j.");
	
	@EventSubscriber
	public void onMessageEvent(MessageReceivedEvent event) {
		
		if(event.getMessage().getContent().toLowerCase().startsWith(prefix)) {
			commandProcessor.processCommand(event.getMessage(), prefix);
			
		}else if (event.getMessage().getContent().toLowerCase().contains("jeff") ) {
			commandProcessor.jeffContained(event.getMessage());
		}else {
			commandProcessor.noCommand(event.getMessage());
		}
		
	}
	
}
