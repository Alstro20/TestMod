package testmod.testblock;

import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.Mod;
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

	//public static CustomSword mySword;
	
	public static TestBlock testBlock;
	public static ItemBlock testBlockItem;
	
	
	public static void preInitCommon() {
		/*mySword = (CustomSword)(new CustomSword().setUnlocalizedName("my_sword"));
		mySword.setRegistryName("my_sword_registry");
		ForgeRegistries.ITEMS.register(mySword);*/
		
		testBlock = (TestBlock)(new TestBlock().setUnlocalizedName("test_block_unlocalized_name"));
		testBlock.setRegistryName("test_block_registry_name");
		ForgeRegistries.BLOCKS.register(testBlock);
		
		testBlockItem = new ItemBlock(testBlock);
		testBlockItem.setRegistryName(testBlock.getRegistryName());
		ForgeRegistries.ITEMS.register(testBlockItem);
		
	}
	
	public static void initCommon() {
		
	}
	
	public static void postInitCommon() {
		
	}

}
