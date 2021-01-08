package com.test.testmod.testblock;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraftforge.client.model.ModelLoader;

public class StartupClientOnly {
	
	public static void preInitClientOnly() {
		//TODO: Block and item are both not getting textures
		//Item should get textures from block
		//Block isn't pointing to assets.ExampleMod.models.block test_block_model.json
		ModelResourceLocation itemModelResourceLocation = new ModelResourceLocation("ExampleMod:test_block_model", "inventory");
		final int DEFAULT_ITEM_SUBTYPE = 0;
		ModelLoader.setCustomModelResourceLocation(StartupCommon.testBlockItem, DEFAULT_ITEM_SUBTYPE, itemModelResourceLocation);
		//TODO: Block names not working. Doesn't seem to be pointing to en_us.lang for some reason
	}
	
	public static void initClientOnly() {

	}
	
	public static void postInitClientOnly() {

	}

}
