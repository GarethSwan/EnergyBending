package com.Swan.Korra.EnergyBending;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import com.projectkorra.projectkorra.Element;
import com.projectkorra.projectkorra.ProjectKorra;
import com.projectkorra.projectkorra.Element.ElementType;
import com.projectkorra.projectkorra.ability.CoreAbility;
import com.projectkorra.projectkorra.configuration.ConfigManager;

public class Main extends JavaPlugin{
	
	public static Element Energy;
	public void onEnable() {
		
		Energy = new Element ("Energy", ElementType.BENDING, this);
		
		CoreAbility.registerPluginAbilities(this, "com.Swan.Korra.EnergyBending");
		
		FileConfiguration config = getConfig();
		config.options().copyDefaults(true);
		ConfigManager.languageConfig.get().addDefault("Chat.Colors.Energy", "AQUA");
		ConfigManager.languageConfig.get().addDefault("Chat.Prefixes.Energy", "[Energy]");
		ConfigManager.languageConfig.save();
		saveConfig();
		
		ProjectKorra.log.info("ProjectKorra Energy Bending by Gareth Swan enabled!");
			
	}
	
	public void onDisable() {
		ProjectKorra.log.info("ProjectKorra Energy Bending by Gareth Swan disabled!");
	}

}
