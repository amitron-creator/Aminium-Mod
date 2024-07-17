
package fr.amitron.aminium.item;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import fr.amitron.aminium.init.AminiumModItems;

public class AminiumShovelItem extends ShovelItem {
	public AminiumShovelItem() {
		super(new IItemTier() {
			public int getMaxUses() {
				return 1164;
			}

			public float getEfficiency() {
				return 12f;
			}

			public float getAttackDamage() {
				return 4f;
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
		}, 1, -3f, new Item.Properties().group(ItemGroup.TOOLS));
	}
}
