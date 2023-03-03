package net.moose.mooseblock;

import net.fabricmc.api.ModInitializer;

import net.moose.mooseblock.block.ModBlocks;
import net.moose.mooseblock.item.ModItemGroups;
import net.moose.mooseblock.item.ModItems;
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
	}

}