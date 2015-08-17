package disconnect;

import org.bukkit.plugin.java.JavaPlugin;

public class main extends JavaPlugin {
	
	public void onEnable() {
		getLogger().info("Disconnecter has been enabled!");
		getCommand("disconnect").setExecutor(new command());
		getCommand("dc").setExecutor(new command());
	}
	
	public void onDisable() {
		getLogger().info("Disconnecter has been disabled!");
	}

}
