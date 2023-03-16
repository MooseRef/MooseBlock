package net.moose.mooseblock.fluid;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.FluidBlock;
import net.minecraft.fluid.FlowableFluid;
import net.minecraft.item.BucketItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.moose.mooseblock.item.ModItemGroups;
import net.moose.mooseblock.mooseblock;


public class ModFluids {
    public static FlowableFluid STILL_GLUE;
    public static FlowableFluid FLOWING_GLUE;
    public static Block GLUE_BLOCK;
    public static Item GLUE_BUCKET;


    public static void register() {

        STILL_GLUE = Registry.register(Registries.FLUID,
            new Identifier(mooseblock.MOD_ID, "still_glue"), new GlueFluid.Still());
        FLOWING_GLUE = Registry.register(Registries.FLUID,
            new Identifier(mooseblock.MOD_ID, "flowing_glue"), new GlueFluid.Flowing());

        GLUE_BLOCK = Registry.register(Registries.BLOCK, new Identifier(mooseblock.MOD_ID, "glue_block"),
                new FluidBlock(ModFluids.STILL_GLUE, FabricBlockSettings.copyOf(Blocks.WATER)){});
        GLUE_BUCKET = Registry.register(Registries.ITEM, new Identifier(mooseblock.MOD_ID, "glue_bucket"),
                new BucketItem(ModFluids.STILL_GLUE, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));

        ItemGroupEvents.modifyEntriesEvent(ModItemGroups.MOOSITE).register(entries -> entries.add(GLUE_BUCKET));

    }
}
