package com.example.examplemod;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraftforge.client.model.ModelLoader;

public class StarupClientOnly {
	
	public static void preInitClientOnly() {
		ModelResourceLocation itemModelResourceLocation = new ModelResourceLocation("examplemod:my_sword", "inventory");
		final int DEFAULT_ITEM_SUBTYPE = 0;
		ModelLoader.setCustomModelResourceLocation(StartupCommon.mySword, DEFAULT_ITEM_SUBTYPE, itemModelResourceLocation);
	}

}
