
package fr.amitron.aminium.item;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ArmorItem;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.entity.Entity;

import fr.amitron.aminium.init.AminiumModTabs;
import fr.amitron.aminium.init.AminiumModItems;

public abstract class AminiumArmorItem extends ArmorItem {
	public AminiumArmorItem(EquipmentSlotType type, Item.Properties properties) {
		super(new IArmorMaterial() {
			@Override
			public int getDurability(EquipmentSlotType type) {
				return new int[]{13, 15, 16, 11}[type.getIndex()] * 35;
			}

			@Override
			public int getDamageReductionAmount(EquipmentSlotType type) {
				return new int[]{4, 15, 10, 4}[type.getIndex()];
			}

			@Override
			public int getEnchantability() {
				return 27;
			}

			@Override
			public net.minecraft.util.SoundEvent getSoundEvent() {
				return null;
			}

			@Override
			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(AminiumModItems.AMINIUMINGOT.get()));
			}

			@Override
			@OnlyIn(Dist.CLIENT)
			public String getName() {
				return "aminium_armor";
			}

			@Override
			public float getToughness() {
				return 0f;
			}

			@Override
			public float getKnockbackResistance() {
				return 1f;
			}
		}, type, properties);
	}

	public static class Helmet extends AminiumArmorItem {
		public Helmet() {
			super(EquipmentSlotType.HEAD, new Item.Properties().group(AminiumModTabs.TAB_AMINIUMTAB));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
			return "aminium:textures/models/armor/aminium_layer_1.png";
		}
	}

	public static class Chestplate extends AminiumArmorItem {
		public Chestplate() {
			super(EquipmentSlotType.CHEST, new Item.Properties().group(AminiumModTabs.TAB_AMINIUMTAB));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
			return "aminium:textures/models/armor/aminium_layer_1.png";
		}
	}

	public static class Leggings extends AminiumArmorItem {
		public Leggings() {
			super(EquipmentSlotType.LEGS, new Item.Properties().group(AminiumModTabs.TAB_AMINIUMTAB));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
			return "aminium:textures/models/armor/aminium_layer_2.png";
		}
	}

	public static class Boots extends AminiumArmorItem {
		public Boots() {
			super(EquipmentSlotType.FEET, new Item.Properties().group(AminiumModTabs.TAB_AMINIUMTAB));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
			return "aminium:textures/models/armor/aminium_layer_1.png";
		}
	}
}
