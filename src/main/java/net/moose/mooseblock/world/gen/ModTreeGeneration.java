package net.moose.mooseblock.world.gen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;
import net.moose.mooseblock.world.ModPlacedFeatures;

public class ModTreeGeneration {
       public static void generateTrees(){
           BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.PLAINS),
                   GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.MOOD_PLACED_KEY);

       }
}
