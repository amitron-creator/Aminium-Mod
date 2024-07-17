
package fr.amitron.aminium.item;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import fr.amitron.aminium.init.AminiumModItems;

public class AminiumSwordItem extends SwordItem {
	public AminiumSwordItem() {
		super(new IItemTier() {
			public int getMaxUses() {
				return 1164;
			}

			public float getEfficiency() {
				return 12f;
			}

			public float getAttackDamage() {
				return 15f;
			}

			public int getHarvestLevel() {
				return 6;
			}

			public int getEnchantability() {
				return 42;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(AminiumModItems.AMINIUMINGOT.get()));
			}
		}, 3, -1f, new Item.Properties().group(ItemGroup.COMBAT));
	}
}
