package net.moose.mooseblock.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.loot.condition.BlockStatePropertyLootCondition;
import net.minecraft.predicate.StatePredicate;
import net.moose.mooseblock.block.ModBlocks;
import net.moose.mooseblock.block.custom.TomatoCropBlock;
import net.moose.mooseblock.item.ModItems;

public class ModLootTableGenerator extends FabricBlockLootTableProvider {
    public ModLootTableGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate()
    {
        addDrop(ModBlocks.MOOD_LOG);
        addDrop(ModBlocks.MOOD_WOOD);
        addDrop(ModBlocks.STRIPPED_MOOD_LOG);
        addDrop(ModBlocks.STRIPPED_MOOD_WOOD);
        addDrop(ModBlocks.MOOD_PLANKS);
        addDrop(ModBlocks.MOOD_SAPLING);

        addDrop(ModBlocks.MOOD_LEAVES,leavesDrops(ModBlocks.MOOD_LEAVES,ModBlocks.MOOD_SAPLING,SAPLING_DROP_CHANCE));

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

        BlockStatePropertyLootCondition.Builder builder = BlockStatePropertyLootCondition.builder(ModBlocks.TOMATO_CROP).properties(StatePredicate.Builder.create().exactMatch(TomatoCropBlock.AGE, 6));
        addDrop(ModBlocks.TOMATO_CROP,cropDrops(ModBlocks.TOMATO_CROP,ModItems.TOMATO_SEEDS,ModItems.TOMATO, builder));

    }

}
