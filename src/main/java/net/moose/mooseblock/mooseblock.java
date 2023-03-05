package net.moose.mooseblock;

import net.fabricmc.api.ModInitializer;

import net.moose.mooseblock.block.ModBlocks;
import net.moose.mooseblock.block.custom.ModFlammableBlock;
import net.moose.mooseblock.block.custom.ModStrippableBlock;
import net.moose.mooseblock.item.ModItemGroups;
import net.moose.mooseblock.item.ModItems;
import net.moose.mooseblock.registries.ModRegistries;
import net.moose.mooseblock.world.gen.ModWorldGeneration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class mooseblock implements ModInitializer {
	public static final String MOD_ID = "mooseblock";
	public static final Logger LOGGER = LoggerFactory.getLogger("mooseblock");



	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModRegistries.registerModFuels();

		ModWorldGeneration.generateModWorldGen();


		ModFlammableBlock.registerFlammableBlock();
		ModStrippableBlock.registerStrippableBlocks();

	}

}