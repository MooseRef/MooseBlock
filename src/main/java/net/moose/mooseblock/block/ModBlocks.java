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
    public static final Block MOOSITE_ORE = new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(4.00f).requiresTool(), UniformIntProvider.create(3,7));
    public static final Block DEEPSLATE_MOOSITE_ORE = new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(4.00f).requiresTool(), UniformIntProvider.create(3,7));
    public static final Block BLOCK_OF_MOOSITE = new Block(FabricBlockSettings.of(Material.METAL).strength(4.20f).requiresTool());
    public static final Block GOXITE_ORE = new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(4.00f).requiresTool(), UniformIntProvider.create(2,5));
    public static final Block DEEPSLATE_GOXITE_ORE = new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(4.00f).requiresTool(), UniformIntProvider.create(2,5));
    public static final Block BLOCK_OF_GOXITE = new Block(FabricBlockSettings.of(Material.METAL).strength(4.20f).requiresTool());
    public static final Block BORPITE_ORE = new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(4.00f).requiresTool(), UniformIntProvider.create(1,3));
    public static final Block DEEPSLATE_BORPITE_ORE = new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(4.00f).requiresTool(), UniformIntProvider.create(1,3));
    public static final Block BLOCK_OF_BORPITE = new Block(FabricBlockSettings.of(Material.METAL).strength(4.20f).requiresTool());
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
          registerBlock("moosite_ore",MOOSITE_ORE, ModItemGroups.MOOSITE);
          registerBlock("deepslate_moosite_ore",DEEPSLATE_MOOSITE_ORE, ModItemGroups.MOOSITE);
          registerBlock("block_of_moosite",BLOCK_OF_MOOSITE, ModItemGroups.MOOSITE);
          registerBlock("goxite_ore",GOXITE_ORE, ModItemGroups.MOOSITE);
          registerBlock("deepslate_goxite_ore",DEEPSLATE_GOXITE_ORE, ModItemGroups.MOOSITE);
          registerBlock("block_of_goxite",BLOCK_OF_GOXITE, ModItemGroups.MOOSITE);
          registerBlock("borpite_ore",BORPITE_ORE, ModItemGroups.MOOSITE);
          registerBlock("deepslate_borpite_ore",DEEPSLATE_BORPITE_ORE, ModItemGroups.MOOSITE);
          registerBlock("block_of_borpite",BLOCK_OF_BORPITE, ModItemGroups.MOOSITE);
        mooseblock.LOGGER.info("Registering ModBlocks for " + mooseblock.MOD_ID);
    }


}
