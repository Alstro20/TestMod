package com.example.examplemod;

import net.minecraft.entity.player.EntityPlayer;

public abstract class CommonProxy {

	
	public void preInit() {
		com.example.examplemod.StartupCommon.preInitCommon();
		
	}
	
	public void init() {
		com.example.examplemod.StartupCommon.initCommon();
	}
	
	public void postInit() {
		com.example.examplemod.StartupCommon.postInitCommon();
	}
	
	//To determine if player is in creative
	//Not used for much
	abstract public boolean playerIsInCreativeMode(EntityPlayer player);
	
	//Returns true if running as dedicated server
	abstract public boolean isDedicatedServer();
}
