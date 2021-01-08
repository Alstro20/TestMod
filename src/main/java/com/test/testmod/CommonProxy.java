package com.test.testmod;

import net.minecraft.entity.player.EntityPlayer;

public abstract class CommonProxy {

	
	public void preInit() {
		com.test.testmod.testblock.StartupCommon.preInitCommon();
	}
	
	public void init() {
		com.test.testmod.testblock.StartupCommon.initCommon();
	}
	
	public void postInit() {
		com.test.testmod.testblock.StartupCommon.postInitCommon();
	}
	
	//To determine if player is in creative
	//Not used for much
	abstract public boolean playerIsInCreativeMode(EntityPlayer player);
	
	//Returns true if running as dedicated server
	abstract public boolean isDedicatedServer();
}
