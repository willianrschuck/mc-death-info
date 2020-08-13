package com.blogspot.tragacafe.spigot;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.World.Environment;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class DeathListener implements Listener {

	@EventHandler
	public void onPlayerDie(PlayerDeathEvent event) {
		
		Location playerDeathLocalization = event.getEntity().getLocation();
		Environment environment = playerDeathLocalization.getWorld().getEnvironment();
		int x = playerDeathLocalization.getBlockX();
		int z = playerDeathLocalization.getBlockZ();
		
		String msg = ChatColor.DARK_RED + "Você morreu em x: " + x + " z: " + z;
		
		if (environment != Environment.NORMAL) {
			msg += " no " + getDimensionName(environment); 
		}
		
		event.getEntity().sendMessage(msg);
		
	}

	private String getDimensionName(Environment environment) {

		switch (environment) {
		case NETHER:
			return "Nether";
		case THE_END:	
			return "The End";
		default:
			return "Overworld";
		}
		
	}
	
}
