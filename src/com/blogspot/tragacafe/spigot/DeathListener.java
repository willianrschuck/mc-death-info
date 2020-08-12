package com.blogspot.tragacafe.spigot;

import org.bukkit.Color;
import org.bukkit.Location;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class DeathListener implements Listener {

	@EventHandler
	public void onPlayerDie(PlayerDeathEvent event) {
		
		Location playerDeathLocalization = event.getEntity().getLocation();
		int x = playerDeathLocalization.getBlockX();
		int z = playerDeathLocalization.getBlockZ();
		event.getEntity().sendMessage(Color.WHITE + "Você morreu nas coordenadas x: " + x + " z: " + z);
		
	}
	
}
