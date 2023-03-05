package net.moose.mooseblock.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.moose.mooseblock.block.custom.TomatoCropBlock;
import net.moose.mooseblock.item.ModItemGroups;
import net.moose.mooseblock.mooseblock;
import net.moose.mooseblock.world.tree.MoodSaplingGenerator;

public class ModBlocks {

    public static final Block MOOD_LOG = registerBlock("mood_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG).strength(2.0f,3.0f).requiresTool()),ModItemGroups.MOOSITE);
    public static final Block MOOD_WOOD = registerBlock("mood_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD).strength(2.0f,3.0f).requiresTool()),ModItemGroups.MOOSITE);
    public static final Block STRIPPED_MOOD_LOG = registerBlock("stripped_mood_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG).strength(2.0f,3.0f).requiresTool()),ModItemGroups.MOOSITE);
    public static final Block STRIPPED_MOOD_WOOD = registerBlock("stripped_mood_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD).strength(2.0f,3.0f).requiresTool()),ModItemGroups.MOOSITE);

    public static final Block MOOD_PLANKS = registerBlock("mood_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).strength(2.0f,3.0f).requiresTool()),ModItemGroups.MOOSITE);
    public static final Block MOOD_LEAVES = registerBlock("mood_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).strength(0.2f).requiresTool()),ModItemGroups.MOOSITE);

    public static final Block MOOD_SAPLING = registerBlock("mood_sapling",
            new SaplingBlock(new MoodSaplingGenerator(),FabricBlockSettings.copyOf(Blocks.OAK_SAPLING).noCollision().breakInstantly().requiresTool().sounds(BlockSoundGroup.GRASS)),ModItemGroups.MOOSITE);

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

    public static final Block TOMATO_CROP = registerBlockWithoutItem("tomato_crop",
            new TomatoCropBlock(FabricBlockSettings.copy(Blocks.WHEAT)), ModItemGroups.MOOSITE);


    private static Block registerBlockWithoutItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registries.BLOCK, new Identifier(mooseblock.MOD_ID, name), block);
    }

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
