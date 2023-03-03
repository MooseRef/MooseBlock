package net.moose.mooseblock.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.moose.mooseblock.item.ModItemGroups;
import net.moose.mooseblock.mooseblock;

public class ModBlocks {

    public static final Block GOXITE_ORE = registerBlock("goxite_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4.0f,4.0f).requiresTool()), ModItemGroups.MOOSITE);
    public static final Block DEEPSLATE_GOXITE_ORE = registerBlock("deepslate_goxite_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4.0f,4.0f).requiresTool()), ModItemGroups.MOOSITE);
    public static final Block BLOCK_OF_GOXITE = registerBlock("block_of_goxite",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f,4.0f).requiresTool()), ModItemGroups.MOOSITE);
    public static final Block BLOCK_OF_RAW_GOXITE = registerBlock("block_of_raw_goxite",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f,4.0f).requiresTool()), ModItemGroups.MOOSITE);

    public static final Block BORPITE_ORE = registerBlock("borpite_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4.0f,4.0f).requiresTool()), ModItemGroups.MOOSITE);
    public static final Block DEEPSLATE_BORPITE_ORE = registerBlock("deepslate_borpite_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4.0f,4.0f).requiresTool()), ModItemGroups.MOOSITE);
    public static final Block BLOCK_OF_BORPITE = registerBlock("block_of_borpite",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f,4.0f).requiresTool()), ModItemGroups.MOOSITE);
    public static final Block BLOCK_OF_RAW_BORPITE = registerBlock("block_of_raw_borpite",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f,4.0f).requiresTool()), ModItemGroups.MOOSITE);

    public static final Block MOOSITE_ORE = registerBlock("moosite_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(4.0f,4.0f).requiresTool(), UniformIntProvider.create(3,7)), ModItemGroups.MOOSITE);
    public static final Block DEEPSLATE_MOOSITE_ORE = registerBlock("deepslate_moosite_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(4.0f,4.0f).requiresTool(), UniformIntProvider.create(3,7)), ModItemGroups.MOOSITE);
    public static final Block BLOCK_OF_MOOSITE = registerBlock("block_of_moosite",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f,4.0f).requiresTool()), ModItemGroups.MOOSITE);


    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registries.BLOCK, new Identifier(mooseblock.MOD_ID, name), block);
    }
    private static Item registerBlockItem(String name, Block block, ItemGroup group){
        Item item = Registry.register(Registries.ITEM, new Identifier(mooseblock.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
        return item;
    }
    public static void registerModBlocks(){
        mooseblock.LOGGER.info("Registering ModBlocks for " + mooseblock.MOD_ID);
    }
}
