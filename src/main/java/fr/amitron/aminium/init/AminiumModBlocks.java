/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package fr.amitron.aminium.init;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.RegistryObject;

import net.minecraft.block.Block;

import fr.amitron.aminium.block.AminiumoreBlock;
import fr.amitron.aminium.AminiumMod;

public class AminiumModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, AminiumMod.MODID);
	public static final RegistryObject<Block> AMINIUMORE = REGISTRY.register("aminiumore", () -> new AminiumoreBlock());
}
