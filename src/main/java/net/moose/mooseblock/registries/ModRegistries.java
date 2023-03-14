package net.moose.mooseblock.registries;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.moose.mooseblock.block.ModBlocks;
import net.moose.mooseblock.mooseblock;

public class ModRegistries {

       public static void registerModFuels(){
        System.out.println("Now Registering Fuels for "+ mooseblock.MOD_ID);
        FuelRegistry registry = FuelRegistry.INSTANCE;

        registry.add(ModBlocks.MOOD_LOG, 150 ); // x20
        registry.add(ModBlocks.MOOD_WOOD, 150 );
        registry.add(ModBlocks.STRIPPED_MOOD_LOG, 150 );
        registry.add(ModBlocks.STRIPPED_MOOD_WOOD, 150 );
        registry.add(ModBlocks.MOOD_PLANKS, 150 );
        registry.add(ModBlocks.MOOD_SAPLING, 150 );
    }
}
