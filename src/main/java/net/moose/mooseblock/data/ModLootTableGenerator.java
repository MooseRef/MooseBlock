package net.moose.mooseblock.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.moose.mooseblock.block.ModBlocks;
import net.moose.mooseblock.item.ModItems;

public class ModLootTableGenerator extends FabricBlockLootTableProvider {
    public ModLootTableGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate()
    {
        addDrop(ModBlocks.GOXITE_ORE,oreDrops(ModBlocks.GOXITE_ORE, ModItems.RAW_GOXITE));
        addDrop(ModBlocks.DEEPSLATE_GOXITE_ORE,oreDrops(ModBlocks.DEEPSLATE_GOXITE_ORE, ModItems.RAW_GOXITE));
        addDrop(ModBlocks.BLOCK_OF_GOXITE);
        addDrop(ModBlocks.BLOCK_OF_RAW_GOXITE);

        addDrop(ModBlocks.BORPITE_ORE,oreDrops(ModBlocks.BORPITE_ORE, ModItems.RAW_BORPITE));
        addDrop(ModBlocks.DEEPSLATE_BORPITE_ORE,oreDrops(ModBlocks.BORPITE_ORE, ModItems.RAW_BORPITE));
        addDrop(ModBlocks.BLOCK_OF_BORPITE);
        addDrop(ModBlocks.BLOCK_OF_RAW_BORPITE);


        addDrop(ModBlocks.MOOSITE_ORE,oreDrops(ModBlocks.MOOSITE_ORE, ModItems.MOOSITE));
        addDrop(ModBlocks.DEEPSLATE_MOOSITE_ORE,oreDrops(ModBlocks.DEEPSLATE_MOOSITE_ORE, ModItems.MOOSITE));
        addDrop(ModBlocks.BLOCK_OF_MOOSITE);

    }

}
