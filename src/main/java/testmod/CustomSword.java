
package testmod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
//import net.minecraft.item.ItemSword;

public class CustomSword extends Item {

	public CustomSword() {
		final int MAX_STACK = 1;
		this.setMaxStackSize(MAX_STACK);
		this.setCreativeTab(CreativeTabs.MISC);
	}

}
