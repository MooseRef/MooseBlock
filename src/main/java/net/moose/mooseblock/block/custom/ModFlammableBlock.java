package net.moose.mooseblock.block.custom;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.moose.mooseblock.block.ModBlocks;

public class ModFlammableBlock {
    public static void registerFlammableBlock(){
        FlammableBlockRegistry registry = FlammableBlockRegistry.getDefaultInstance();

        registry.add(ModBlocks.MOOD_LOG, 5, 20);
        registry.add(ModBlocks.MOOD_WOOD, 5, 20);
        registry.add(ModBlocks.STRIPPED_MOOD_LOG, 5, 20);
        registry.add(ModBlocks.STRIPPED_MOOD_WOOD, 5, 20);

        registry.add(ModBlocks.MOOD_LEAVES, 30, 60);
        registry.add(ModBlocks.MOOD_PLANKS, 5, 20);

    }
}
