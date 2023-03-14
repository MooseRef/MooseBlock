package net.moose.mooseblock.util;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.moose.mooseblock.mooseblock;

public class ModTags {
    public static class Blocks {

        public static final TagKey<Block> MOD_WOOD_PLANKS = createCommonTag("mod_wood_planks");


        public static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, new Identifier(mooseblock.MOD_ID, name));
        }

        public static TagKey<Block> createCommonTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, new Identifier("c", name));
        }
    }

    public static class Items {

        public static final TagKey<Item> MOOSE_ORES = createCommonTag("Moose");



        public static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, new Identifier(mooseblock.MOD_ID, name));
            }

        public static TagKey<Item> createCommonTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, new Identifier("c", name));
        }

    }

    }


