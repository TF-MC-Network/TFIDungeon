package net.teamfekker.tfdungeon;

import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;
import net.teamfekker.tfdungeon.Listeners.NetherLoot;

public class Main extends JavaPlugin {
	
	Plugin plugin = this;
	public void onEnable() {
		Bukkit.getPluginManager().registerEvents(new NetherLoot(), this);
	}
	
	public void onDiable() {
		plugin = null;
	}
	
	
}
