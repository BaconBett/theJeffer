package discord.main;

import discord.main.botListener;
import sx.blah.discord.api.ClientBuilder;
import sx.blah.discord.api.IDiscordClient;
import sx.blah.discord.api.events.EventDispatcher;
import sx.blah.discord.util.DiscordException;

public class botMain {
	
	
	 //public static final IDiscordClient bot = createClient("NDEyMDIwOTAzNjA2NzQ3MTQ3.DWEL8w.IXPFabAVbA4NDyEajUiXHJIrZpc", true);
	
	 public static void main(String args[]) {
		 
		 if (args.length<1) {
			 System.out.println("you need to provide your bot token ! ");
			 System.out.println("java -jar theJeffer [Your Token here]");
			 return;
		 }
		 IDiscordClient bot = createClient(args[0], true);
		 EventDispatcher dis = bot.getDispatcher();
		 dis.registerListener(new botListener());
		 
	 }
	 
	 public static IDiscordClient createClient(String token, boolean login){
		 
	        ClientBuilder clientBuilder = new ClientBuilder();
	        clientBuilder.withToken(token);
	        try
	        {
	            if (login)
	            {
	            	
	            	return clientBuilder.login();
	              
	            }
	            else
	            {
	                return clientBuilder.build();
	            }
	        }
	        catch (DiscordException e)
	        {
	            e.printStackTrace();
	            return null;
	        }
	       
	    }
	
}
