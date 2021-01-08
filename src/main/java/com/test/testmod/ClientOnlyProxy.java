package com.test.testmod;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;

public class ClientOnlyProxy extends CommonProxy {
	
	public void preInit()
	{
		super.preInit();
		com.test.testmod.testblock.StartupClientOnly.preInitClientOnly();
	}
	
	public void init()
	{
		super.init();
		com.test.testmod.testblock.StartupClientOnly.initClientOnly();
		
	}
	
	public void postInit()
	{
		super.postInit();
		com.test.testmod.testblock.StartupClientOnly.postInitClientOnly();
		
	}
	
	@Override
	public boolean playerIsInCreativeMode(EntityPlayer player) {
		if(player instanceof EntityPlayerMP) {
			EntityPlayerMP entityPlayerMP = (EntityPlayerMP)player;
			return entityPlayerMP.interactionManager.isCreative();
		}else if(player instanceof EntityPlayerSP) {
			return Minecraft.getMinecraft().playerController.isInCreativeMode();
		}
		return false;
	}
	
	@Override
	public boolean isDedicatedServer() {return false;}

}
