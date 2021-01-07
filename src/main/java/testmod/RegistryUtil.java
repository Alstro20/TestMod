package testmod;

import testmod.TestMod;
import net.minecraft.block.Block;
import net.minecraft.item.Item;

public class RegistryUtil {
	
	public static Item setItemName(final Item item, final String name) {
		item.setRegistryName(TestMod.MODID, name).setUnlocalizedName(TestMod.MODID+"."+name);
		return item;
	}
	
	public static Block setBlockName(final net.minecraft.block.Block block, final String name) {
		block.setRegistryName(TestMod.MODID, name).setUnlocalizedName(TestMod.MODID+"."+name);
		return block;
	}

}
