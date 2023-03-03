package net.moose.mooseblock;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.moose.mooseblock.data.ModLootTableGenerator;
import net.moose.mooseblock.data.ModModelProvider;
import net.moose.mooseblock.data.ModRecipeGenerator;
import net.moose.mooseblock.data.ModWorldGenerator;

public class mooseblockdatgen implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(ModLootTableGenerator::new);
		pack.addProvider(ModRecipeGenerator::new);
		pack.addProvider(ModModelProvider::new);
		pack.addProvider(ModWorldGenerator::new);

	}
}
