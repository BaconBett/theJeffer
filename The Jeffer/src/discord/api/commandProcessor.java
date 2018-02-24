package discord.api;






import sx.blah.discord.handle.impl.obj.ReactionEmoji;
import sx.blah.discord.handle.obj.IChannel;

import sx.blah.discord.handle.obj.IMessage;

import sx.blah.discord.util.RequestBuffer;


public class commandProcessor {
	
	public static void processCommand(IMessage message, String prefix) {	
		
		
		
		IChannel channel  = message.getChannel();
		
		String[] command = message.getContent().toLowerCase().replaceFirst(prefix, "").split(" ");
		String debug1 = message.getAuthor().getName()+"#"+message.getAuthor().getDiscriminator()+" used \""+String.join(" ", command) + "\"in: "+message.getGuild().getName();
		if(command[0].equals("jeff")) {
			channel.sendMessage("Dis me Nam!");
			System.out.println(debug1);
		}else if (command[0].equals("name")) {
			channel.sendMessage("Mi Nam Jeff!");
			System.out.println(debug1);
		}else if (command[0].equals("")) {
			channel.sendMessage("Jeff");
			System.out.println(debug1);
		}else if (command[0].equals("help")) {
			commandWorks.help(channel);
			System.out.println(debug1);
		}else if (command[0].equals("say")) {
			commandWorks.say(command, channel);
			System.out.println(debug1);
		}else if (command[0].equals("guilds")) {
			//commandWorks.getGuilds(message, channel);
			channel.sendMessage("Out of Order");
			System.out.println(debug1);
		}
		
		
		
	}//end of processCommand
	
	public static void jeffContained(IMessage message) {
	
		 RequestBuffer.request(() -> message.addReaction(ReactionEmoji.of("jeff1", 416328510890704896L)));
		 try {
			 Thread.sleep(50);
		 }catch(InterruptedException e) {
			 e.printStackTrace();
		 }
		 RequestBuffer.request(() ->message.addReaction(ReactionEmoji.of("jeff2", 416328523733663746L)));
		 
	}


	public static void noCommand(IMessage message) {
		
		// RequestBuffer.request(()->botMain.bot.changePlayingText("with " + Integer.toString(botMain.bot2.getUsers().size()) + " Jeffs | WIP"));
		
	}
	
}//end of class
