
package fr.amitron.aminium.item;

import net.minecraft.item.Rarity;
import net.minecraft.item.Item;

import fr.amitron.aminium.init.AminiumModTabs;

public class AminiumingotItem extends Item {
	public AminiumingotItem() {
		super(new Item.Properties().group(AminiumModTabs.TAB_AMINIUMTAB).maxStackSize(64).isImmuneToFire().rarity(Rarity.COMMON));
	}
}
