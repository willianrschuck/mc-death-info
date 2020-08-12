package com.blogspot.tragacafe.spigot;

import org.bukkit.plugin.java.JavaPlugin;

public class DeathInfo extends JavaPlugin {

	@Override
	public void onEnable() {
		getServer().getPluginManager().registerEvents(new DeathListener(), this);
	}
	
}
