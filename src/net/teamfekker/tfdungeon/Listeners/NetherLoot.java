package net.teamfekker.tfdungeon.Listeners;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Biome;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Minecart;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.world.LootGenerateEvent;
import org.bukkit.inventory.ItemStack;

public class NetherLoot implements Listener {
	
	@EventHandler
	public void lootModifyEvent(LootGenerateEvent event, World world, Entity entity) {
		entity = event.getEntity();
		world = event.getWorld();
		List<ItemStack> loot = new ArrayList();
		ItemStack bedrock = new ItemStack(Material.BEDROCK);
		loot.add(bedrock);
		
		if(entity instanceof Player) {
			Location loc = entity.getLocation();
			Biome biome = world.getBiome(loc.getBlockX(), loc.getBlockY(), loc.getBlockZ());
			
			if(loc.getWorld().getName().equalsIgnoreCase("world_the_nether")) {
				((Player) entity).getPlayer().sendMessage("event called");
				event.setLoot(null);
			}
			
		}
		
		
	}
	
	
}
