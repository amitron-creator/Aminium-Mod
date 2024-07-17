/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package fr.amitron.aminium.init;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.RegistryObject;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.block.Block;

import fr.amitron.aminium.AminiumMod;

public class AminiumModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, AminiumMod.MODID);
	public static final RegistryObject<Item> AMINIUMORE = block(AminiumModBlocks.AMINIUMORE, AminiumModTabs.TAB_AMINIUMTAB);

	private static RegistryObject<Item> block(RegistryObject<Block> block, ItemGroup tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().group(tab)));
	}
}
