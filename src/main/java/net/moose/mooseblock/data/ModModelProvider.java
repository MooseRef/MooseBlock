package net.moose.mooseblock.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.moose.mooseblock.block.ModBlocks;
import net.moose.mooseblock.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output)
    {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.GOXITE_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DEEPSLATE_GOXITE_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BLOCK_OF_GOXITE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BLOCK_OF_RAW_GOXITE);

        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BORPITE_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DEEPSLATE_BORPITE_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BLOCK_OF_BORPITE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BLOCK_OF_RAW_BORPITE);

        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.MOOSITE_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DEEPSLATE_MOOSITE_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BLOCK_OF_MOOSITE);

        blockStateModelGenerator.registerLog(ModBlocks.MOOD_LOG);
        blockStateModelGenerator.registerLog(ModBlocks.MOOD_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_MOOD_LOG);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_MOOD_WOOD);

        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.MOOD_PLANKS);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.MOOD_LEAVES);

       // blockStateModelGenerator.registerTintableCrossBlockState(ModBlocks.MOOD_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);

        //FIX LATER
        //
       //   blockStateModelGenerator.registerCrop(ModBlocks.TOMATO_CROP, Properties.AGE_7, 0, 1, 2, 3, 4, 5, 6, 6);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator)
    {
        itemModelGenerator.register(ModItems.GOXITE, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_GOXITE, Models.GENERATED);
        itemModelGenerator.register(ModItems.GOXITE_BOOTS, Models.GENERATED);
        itemModelGenerator.register(ModItems.GOXITE_CHESTPLATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.GOXITE_HELMET, Models.GENERATED);
        itemModelGenerator.register(ModItems.GOXITE_LEGGINGS, Models.GENERATED);
        itemModelGenerator.register(ModItems.GOXITE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.GOXITE_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.GOXITE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.GOXITE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.GOXITE_PICKAXE, Models.HANDHELD);

        itemModelGenerator.register(ModItems.BORPITE, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_BORPITE, Models.GENERATED);
        itemModelGenerator.register(ModItems.BORPITE_BOOTS, Models.GENERATED);
        itemModelGenerator.register(ModItems.BORPITE_CHESTPLATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.BORPITE_HELMET, Models.GENERATED);
        itemModelGenerator.register(ModItems.BORPITE_LEGGINGS, Models.GENERATED);
        itemModelGenerator.register(ModItems.BORPITE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.BORPITE_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.BORPITE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.BORPITE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.BORPITE_PICKAXE, Models.HANDHELD);

        itemModelGenerator.register(ModItems.MOOSITE, Models.GENERATED);
        itemModelGenerator.register(ModItems.MOOSITE_BOOTS, Models.GENERATED);
        itemModelGenerator.register(ModItems.MOOSITE_CHESTPLATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.MOOSITE_HELMET, Models.GENERATED);
        itemModelGenerator.register(ModItems.MOOSITE_LEGGINGS, Models.GENERATED);
        itemModelGenerator.register(ModItems.MOOSITE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.MOOSITE_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.MOOSITE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.MOOSITE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.MOOSITE_PICKAXE, Models.HANDHELD);

        itemModelGenerator.register(ModItems.TOMATO_SEEDS, Models.GENERATED);
        itemModelGenerator.register(ModItems.TOMATO, Models.GENERATED);


    }
}
