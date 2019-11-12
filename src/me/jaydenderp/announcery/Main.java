package me.jaydenderp.announcery;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import net.md_5.bungee.api.ChatColor;

public class Main extends JavaPlugin implements CommandExecutor {
	
	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if(command.getName().equalsIgnoreCase("announce")){
			if (sender instanceof Player) {
				Player player = (Player) sender;
				if(args.length < 1) {
					player.sendMessage(ChatColor.DARK_RED + "Usage: /announce <text>");
					return true;
				} else if(args.length >= 1) {
					String preLog = String.join(" ", args);
					String logToConsole = ChatColor.translateAlternateColorCodes('&', preLog);
					Bukkit.broadcastMessage("[" + ChatColor.GOLD + "Broadcast" + ChatColor.WHITE + "] " + ChatColor.GREEN + logToConsole);
				}
				
			}
		}
		return true;
	}
}
