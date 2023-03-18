package net.moose.mooseblock.block.custom;

import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.moose.mooseblock.block.ModBlocks;

public class ModStrippableBlock {
    public static void registerStrippableBlocks() {

        StrippableBlockRegistry.register(ModBlocks.MOOD_LOG, ModBlocks.STRIPPED_MOOD_LOG);
        StrippableBlockRegistry.register(ModBlocks.MOOD_WOOD, ModBlocks.STRIPPED_MOOD_WOOD);

        StrippableBlockRegistry.register(ModBlocks.SATIN_LOG, ModBlocks.STRIPPED_SATIN_LOG);
        StrippableBlockRegistry.register(ModBlocks.SATIN_WOOD, ModBlocks.STRIPPED_SATIN_WOOD);
    }
}