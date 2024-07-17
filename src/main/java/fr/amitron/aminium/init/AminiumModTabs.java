/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package fr.amitron.aminium.init;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.block.Blocks;

public class AminiumModTabs {
	public static ItemGroup TAB_AMINIUMTAB;

	public static void load() {
		TAB_AMINIUMTAB = new ItemGroup("tab_aminiumtab") {
			@Override
			public ItemStack createIcon() {
				return new ItemStack(Blocks.VOID_AIR);
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
