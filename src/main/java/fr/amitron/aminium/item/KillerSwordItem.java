
package fr.amitron.aminium.item;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.entity.LivingEntity;
import net.minecraft.client.util.ITooltipFlag;

import java.util.List;

import fr.amitron.aminium.procedures.KillerSwordLivingEntityIsHitWithToolProcedure;
import fr.amitron.aminium.init.AminiumModTabs;

public class KillerSwordItem extends SwordItem {
	public KillerSwordItem() {
		super(new IItemTier() {
			public int getMaxUses() {
				return 0;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return 0f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 2;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks();
			}
		}, 3, 26f, new Item.Properties().group(AminiumModTabs.TAB_AMINIUMTAB).isImmuneToFire());
	}

	@Override
	public boolean hitEntity(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hitEntity(itemstack, entity, sourceentity);
		KillerSwordLivingEntityIsHitWithToolProcedure.execute(entity);
		return retval;
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public void addInformation(ItemStack itemstack, World level, List<ITextComponent> list, ITooltipFlag flag) {
		super.addInformation(itemstack, level, list, flag);
		list.add(new StringTextComponent("tue toute les entit\u00E9es"));
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean hasEffect(ItemStack itemstack) {
		return true;
	}
}
