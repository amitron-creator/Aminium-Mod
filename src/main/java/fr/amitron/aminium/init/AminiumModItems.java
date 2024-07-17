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

import fr.amitron.aminium.item.AminiumingotItem;
import fr.amitron.aminium.item.AminiumSwordItem;
import fr.amitron.aminium.item.AminiumShovelItem;
import fr.amitron.aminium.item.AminiumPickaxeItem;
import fr.amitron.aminium.item.AminiumHoeItem;
import fr.amitron.aminium.item.AminiumAxeItem;
import fr.amitron.aminium.item.AminiumArmorItem;
import fr.amitron.aminium.AminiumMod;

public class AminiumModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, AminiumMod.MODID);
	public static final RegistryObject<Item> AMINIUMORE = block(AminiumModBlocks.AMINIUMORE, AminiumModTabs.TAB_AMINIUMTAB);
	public static final RegistryObject<Item> AMINIUMINGOT = REGISTRY.register("aminiumingot", () -> new AminiumingotItem());
	public static final RegistryObject<Item> AMINIUM_ARMOR_HELMET = REGISTRY.register("aminium_armor_helmet", () -> new AminiumArmorItem.Helmet());
	public static final RegistryObject<Item> AMINIUM_ARMOR_CHESTPLATE = REGISTRY.register("aminium_armor_chestplate", () -> new AminiumArmorItem.Chestplate());
	public static final RegistryObject<Item> AMINIUM_ARMOR_LEGGINGS = REGISTRY.register("aminium_armor_leggings", () -> new AminiumArmorItem.Leggings());
	public static final RegistryObject<Item> AMINIUM_ARMOR_BOOTS = REGISTRY.register("aminium_armor_boots", () -> new AminiumArmorItem.Boots());
	public static final RegistryObject<Item> AMINIUM_AXE = REGISTRY.register("aminium_axe", () -> new AminiumAxeItem());
	public static final RegistryObject<Item> AMINIUM_PICKAXE = REGISTRY.register("aminium_pickaxe", () -> new AminiumPickaxeItem());
	public static final RegistryObject<Item> AMINIUM_SWORD = REGISTRY.register("aminium_sword", () -> new AminiumSwordItem());
	public static final RegistryObject<Item> AMINIUM_SHOVEL = REGISTRY.register("aminium_shovel", () -> new AminiumShovelItem());
	public static final RegistryObject<Item> AMINIUM_HOE = REGISTRY.register("aminium_hoe", () -> new AminiumHoeItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, ItemGroup tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().group(tab)));
	}
}
