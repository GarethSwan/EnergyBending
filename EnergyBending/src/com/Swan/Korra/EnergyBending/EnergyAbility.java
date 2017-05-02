package com.Swan.Korra.EnergyBending;

import org.bukkit.Color;
import org.bukkit.entity.Player;

import com.projectkorra.projectkorra.Element;
import com.projectkorra.projectkorra.ability.ElementalAbility;

public abstract class EnergyAbility extends ElementalAbility{

	public EnergyAbility(Player player) {
		super(player);
		// TODO Auto-generated constructor stub
	}
	
	public Element getElement() {
		return Main.Energy;
	}
	
	public ChatColor getColor() {
		return ChatColor.AQUA;
	}
	
	

}
