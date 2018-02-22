package discord.api;

import com.Cardinal.OCSL.Obj.Config;

import sx.blah.discord.handle.obj.IChannel;
import sx.blah.discord.util.EmbedBuilder;
import sx.blah.discord.util.RequestBuffer;

public class commandWorks {
	
	static final Config config = new Config("data");
	static EmbedBuilder builder = new EmbedBuilder();
	
	public static void help(IChannel channel) {
		
		builder.appendField("j.","``Jeff``",true);
		builder.appendField("j.jeff", "``Dis me Nam!``", false);
		builder.appendField("j.name", "``Mi Nam Jeff!``", true);
		builder.appendField("**j.guilds**", "``Prints a list of all Servers the bot is connected to + Membercounts``",false);
		channel.sendMessage(builder.build());
		builder.clearFields();
		
	}
	
	public static void say(String[] command, IChannel channel) {
		
		 command[0] = "";
		 String text = String.join(" ", command);
		 RequestBuffer.request(()-> channel.sendMessage(text));
		
	}
/*
	public static void getGuilds(IMessage message, IChannel channel) {
			
			IGuild guild;
		
			for(int x = botMain.bot.getGuilds().size();x>0;x--) {
				guild = botMain.bot.getGuilds().get(x-1);
				String invite = "Missing ``Manage Server`` Permission ! ";
				String guildname = guild.getName();
				int guildsize = guild.getTotalMemberCount();
				if (message.getAuthor().getLongID()==159405432236933120L) {
					int invitesize;
					try {
						guild.getTotalMemberCount();
					    invitesize = guild.getExtendedInvites().size();
						if (invitesize!=0) {
							invite = guild.getExtendedInvites().get(0).toString();
						}
						} catch (MissingPermissionsException e) {
							
						
						}
					builder.appendField(guildname,"Membercount: "+guildsize+"  Invite: "+invite,false);
				}else {
					builder.appendField(guildname,"Membercount: "+guildsize,false);
				}
					
			
			
			}
			
				
			
			RequestBuffer.request(()->{
			channel.sendMessage(builder.build());
			builder.clearFields();
			});
		
			
		
		
	}*/
	


}