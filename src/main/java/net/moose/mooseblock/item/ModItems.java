package net.moose.mooseblock.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.moose.mooseblock.block.ModBlocks;
import net.moose.mooseblock.mooseblock;

public class ModItems {

    public static final Item GOXITE = registerItem("goxite", new Item(new FabricItemSettings()));
    public static final Item RAW_GOXITE = registerItem("raw_goxite", new Item(new FabricItemSettings()));
    public static final Item BORPITE = registerItem("borpite", new Item(new FabricItemSettings()));
    public static final Item RAW_BORPITE = registerItem("raw_borpite", new Item(new FabricItemSettings()));
    public static final Item MOOSITE = registerItem("moosite", new Item(new FabricItemSettings().fireproof()));

    public static final Item GOXITE_HELMET = registerItem("goxite_helmet", new ArmorItem(ModArmorMaterial.GOXITE, EquipmentSlot.HEAD, new FabricItemSettings()));
    public static final Item GOXITE_CHESTPLATE = registerItem("goxite_chestplate", new ArmorItem(ModArmorMaterial.GOXITE, EquipmentSlot.CHEST, new FabricItemSettings()));
    public static final Item GOXITE_LEGGINGS = registerItem("goxite_leggings", new ArmorItem(ModArmorMaterial.GOXITE, EquipmentSlot.LEGS, new FabricItemSettings()));
    public static final Item GOXITE_BOOTS = registerItem("goxite_boots", new ArmorItem(ModArmorMaterial.GOXITE, EquipmentSlot.FEET, new FabricItemSettings()));
    public static final Item GOXITE_SWORD = registerItem("goxite_sword", new SwordItem(ModToolMaterial.GOXITE, 3, -2.4f, new FabricItemSettings()));
    public static final Item GOXITE_SHOVEL = registerItem("goxite_shovel", new ModShovelItem(ModToolMaterial.GOXITE,2.0f, -3.0f,new FabricItemSettings()));
    public static final Item GOXITE_PICKAXE = registerItem("goxite_pickaxe", new ModPickaxeItem(ModToolMaterial.GOXITE, 1, -2.8f, new FabricItemSettings()));
    public static final Item GOXITE_AXE = registerItem("goxite_axe", new ModAxeItem(ModToolMaterial.GOXITE, 5.0f, -3.0f, new FabricItemSettings()));
    public static final Item GOXITE_HOE = registerItem("goxite_hoe", new ModHoeItem(ModToolMaterial.GOXITE, -3, 0.0f, new FabricItemSettings()));

    public static final Item BORPITE_HELMET = registerItem("borpite_helmet", new ArmorItem(ModArmorMaterial.BORPITE, EquipmentSlot.HEAD, new FabricItemSettings()));
    public static final Item BORPITE_CHESTPLATE = registerItem("borpite_chestplate", new ArmorItem(ModArmorMaterial.BORPITE, EquipmentSlot.CHEST, new FabricItemSettings()));
    public static final Item BORPITE_LEGGINGS = registerItem("borpite_leggings", new ArmorItem(ModArmorMaterial.BORPITE, EquipmentSlot.LEGS, new FabricItemSettings()));
    public static final Item BORPITE_BOOTS = registerItem("borpite_boots", new ArmorItem(ModArmorMaterial.BORPITE, EquipmentSlot.FEET, new FabricItemSettings()));
    public static final Item BORPITE_SWORD = registerItem("borpite_sword", new SwordItem(ModToolMaterial.BORPITE, 3, -2.4f, new FabricItemSettings()));
    public static final Item BORPITE_SHOVEL = registerItem("borpite_shovel", new ModShovelItem(ModToolMaterial.BORPITE,2.0f, -3.0f,new FabricItemSettings()));
    public static final Item BORPITE_PICKAXE = registerItem("borpite_pickaxe", new ModPickaxeItem(ModToolMaterial.BORPITE, 1, -2.8f, new FabricItemSettings()));
    public static final Item BORPITE_AXE = registerItem("borpite_axe", new ModAxeItem(ModToolMaterial.BORPITE, 5.0f, -3.0f, new FabricItemSettings()));
    public static final Item BORPITE_HOE = registerItem("borpite_hoe", new ModHoeItem(ModToolMaterial.BORPITE, -3, 0.0f, new FabricItemSettings()));

    public static final Item MOOSITE_HELMET = registerItem("moosite_helmet", new ArmorItem(ModArmorMaterial.MOOSITE, EquipmentSlot.HEAD, new FabricItemSettings().fireproof()));
    public static final Item MOOSITE_CHESTPLATE = registerItem("moosite_chestplate", new ArmorItem(ModArmorMaterial.MOOSITE, EquipmentSlot.CHEST, new FabricItemSettings().fireproof()));
    public static final Item MOOSITE_LEGGINGS = registerItem("moosite_leggings", new ArmorItem(ModArmorMaterial.MOOSITE, EquipmentSlot.LEGS, new FabricItemSettings().fireproof()));
    public static final Item MOOSITE_BOOTS = registerItem("moosite_boots", new ArmorItem(ModArmorMaterial.MOOSITE, EquipmentSlot.FEET, new FabricItemSettings().fireproof()));
    public static final Item MOOSITE_SWORD = registerItem("moosite_sword", new SwordItem(ModToolMaterial.MOOSITE, 3, -2.4f, new FabricItemSettings().fireproof()));
    public static final Item MOOSITE_SHOVEL = registerItem("moosite_shovel", new ModShovelItem(ModToolMaterial.MOOSITE,2.0f, -3.0f,new FabricItemSettings().fireproof()));
    public static final Item MOOSITE_PICKAXE = registerItem("moosite_pickaxe", new ModPickaxeItem(ModToolMaterial.MOOSITE, 1, -2.8f, new FabricItemSettings().fireproof()));
    public static final Item MOOSITE_AXE = registerItem("moosite_axe", new ModAxeItem(ModToolMaterial.MOOSITE, 5.0f, -3.0f, new FabricItemSettings().fireproof()));
    public static final Item MOOSITE_HOE = registerItem("moosite_hoe", new ModHoeItem(ModToolMaterial.MOOSITE, -3, 0.0f, new FabricItemSettings().fireproof()));

    public static final Item TOMATO_SEEDS = registerItem("tomato_seeds", new AliasedBlockItem(ModBlocks.TOMATO_CROP, new FabricItemSettings()));
    public static final Item TOMATO = registerItem("tomato", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(1).saturationModifier(1f).build())));


    public static void addItemsToItemGroup() {

        // ADD TO THE ABOVE ITEMS????

        addToItemGroup(ModItemGroups.MOOSITE, GOXITE);
        addToItemGroup(ModItemGroups.MOOSITE, RAW_GOXITE);
        addToItemGroup(ModItemGroups.MOOSITE, BORPITE);
        addToItemGroup(ModItemGroups.MOOSITE, RAW_BORPITE);
        addToItemGroup(ModItemGroups.MOOSITE, MOOSITE);

        addToItemGroup(ModItemGroups.MOOSITE, GOXITE_HELMET);
        addToItemGroup(ModItemGroups.MOOSITE, GOXITE_CHESTPLATE);
        addToItemGroup(ModItemGroups.MOOSITE, GOXITE_LEGGINGS);
        addToItemGroup(ModItemGroups.MOOSITE, GOXITE_BOOTS);
        addToItemGroup(ModItemGroups.MOOSITE, GOXITE_SWORD);
        addToItemGroup(ModItemGroups.MOOSITE, GOXITE_SHOVEL);
        addToItemGroup(ModItemGroups.MOOSITE, GOXITE_AXE);
        addToItemGroup(ModItemGroups.MOOSITE, GOXITE_PICKAXE);
        addToItemGroup(ModItemGroups.MOOSITE, GOXITE_HOE);

        addToItemGroup(ModItemGroups.MOOSITE, BORPITE_HELMET);
        addToItemGroup(ModItemGroups.MOOSITE, BORPITE_CHESTPLATE);
        addToItemGroup(ModItemGroups.MOOSITE, BORPITE_LEGGINGS);
        addToItemGroup(ModItemGroups.MOOSITE, BORPITE_BOOTS);
        addToItemGroup(ModItemGroups.MOOSITE, BORPITE_SWORD);
        addToItemGroup(ModItemGroups.MOOSITE, BORPITE_SHOVEL);
        addToItemGroup(ModItemGroups.MOOSITE, BORPITE_AXE);
        addToItemGroup(ModItemGroups.MOOSITE, BORPITE_PICKAXE);
        addToItemGroup(ModItemGroups.MOOSITE, BORPITE_HOE);

        addToItemGroup(ModItemGroups.MOOSITE, MOOSITE_HELMET);
        addToItemGroup(ModItemGroups.MOOSITE, MOOSITE_CHESTPLATE);
        addToItemGroup(ModItemGroups.MOOSITE, MOOSITE_LEGGINGS);
        addToItemGroup(ModItemGroups.MOOSITE, MOOSITE_BOOTS);
        addToItemGroup(ModItemGroups.MOOSITE, MOOSITE_SWORD);
        addToItemGroup(ModItemGroups.MOOSITE, MOOSITE_SHOVEL);
        addToItemGroup(ModItemGroups.MOOSITE, MOOSITE_AXE);
        addToItemGroup(ModItemGroups.MOOSITE, MOOSITE_PICKAXE);
        addToItemGroup(ModItemGroups.MOOSITE, MOOSITE_HOE);

        addToItemGroup(ModItemGroups.MOOSITE, TOMATO_SEEDS);
        addToItemGroup(ModItemGroups.MOOSITE, TOMATO);
    }
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(mooseblock.MOD_ID, name), item);
    }
    private static void addToItemGroup(ItemGroup group, Item item) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }


    public static void registerModItems() {
        mooseblock.LOGGER.info("Registering Mod Items For" + mooseblock.MOD_ID);

        addItemsToItemGroup();
    }
}

