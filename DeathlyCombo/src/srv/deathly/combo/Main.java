package srv.deathly.combo;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import srv.deathly.combo.Items.Packers;


 
 
public class Main extends JavaPlugin{ //Extending JavaPlugin so that Bukkit knows its the main class...
 
private static Plugin plugin;
 
public void onEnable() {
	plugin = this;
	registerEvents(this, new onGather(), new onClick());
	initializeRecipes();

//This is where we register our events/commands
}
 
public void onDisable() {
plugin = null;//To stop memory leeks
 
}
 
 
//Much eaisier then registering events in 10 diffirent methods
public static void registerEvents(org.bukkit.plugin.Plugin plugin, Listener... listeners) {
for (Listener listener : listeners) {
Bukkit.getServer().getPluginManager().registerEvents(listener, plugin);
}
}
 
//To access the plugin variable from other classes
public static Plugin getPlugin() {
return plugin;
}
 
 
 
 
}