package com.example.examplemod;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

@Mod.EventBusSubscriber
public class StartupCommon {

	/*
	 @SubscribeEvent public static void registerRenders(ModelRegistryEvent event)
	 { registerRender(ExampleMod.mySword); }
	 
	 private static void registerRender(Item item) {
	 ModelLoader.setCustomModelResourceLocation(item, 0, new
	 ModelResourceLocation(item.getRegistryName(), "inventory")); }
	 
	 public static ItemBlock myBlockItem;
	 
	 @SubscribeEvent public static void
	 registerBlocks(RegistryEvent.Register<Block> event) {
	 event.getRegistry().registerAll(ExampleMod.myBlock); }
	 
	 @SubscribeEvent public static void registerItems(RegistryEvent.Register<Item>
	 event) { event.getRegistry().registerAll(ExampleMod.mySword, new
	 ItemBlock(ExampleMod.myBlock).setRegistryName(ExampleMod.myBlock.
	 getRegistryName())); }
	 */

	public static CustomSword mySword;
	public static TestBlock myBlock;

	public static void preInitCommon() {
		mySword = (CustomSword)(new CustomSword().setUnlocalizedName("my_sword")));
		mySword.setRegistryName("my_sword_registry")
		
		ForgeRegistries.ITEMS.register(mySword);
	}

}
