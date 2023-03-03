package net.moose.mooseblock.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.moose.mooseblock.mooseblock;

public class ModItems {
    public static final Item MOOSITE = registerItem("moosite", new Item(new FabricItemSettings().fireproof()));
    public static final Item GOXITE = registerItem("goxite", new Item(new FabricItemSettings()));
    public static final Item RAW_GOXITE = registerItem("raw_goxite", new Item(new FabricItemSettings()));
    public static final Item BORPITE = registerItem("borpite", new Item(new FabricItemSettings()));
    public static final Item RAW_BORPITE = registerItem("raw_borpite", new Item(new FabricItemSettings()));

    public static final Item MOOSITE_HELMET = registerItem("moosite_helmet", new ArmorItem(ModArmorMaterial.MOOSITE, EquipmentSlot.HEAD, (new FabricItemSettings().fireproof())));
    public static final Item MOOSITE_CHESTPLATE = registerItem("moosite_chestplate", new ArmorItem(ModArmorMaterial.MOOSITE, EquipmentSlot.CHEST, (new FabricItemSettings().fireproof())));
    public static final Item MOOSITE_LEGGINGS = registerItem("moosite_leggings", new ArmorItem(ModArmorMaterial.MOOSITE, EquipmentSlot.LEGS, (new FabricItemSettings().fireproof())));
    public static final Item MOOSITE_BOOTS = registerItem("moosite_boots", new ArmorItem(ModArmorMaterial.MOOSITE, EquipmentSlot.FEET, (new FabricItemSettings().fireproof())));

    public static final Item GOXITE_HELMET = registerItem("goxite_helmet", new ArmorItem(ModArmorMaterial.GOXITE, EquipmentSlot.HEAD, (new FabricItemSettings())));
    public static final Item GOXITE_CHESTPLATE = registerItem("goxite_chestplate", new ArmorItem(ModArmorMaterial.GOXITE, EquipmentSlot.CHEST, (new FabricItemSettings())));
    public static final Item GOXITE_LEGGINGS = registerItem("goxite_leggings", new ArmorItem(ModArmorMaterial.GOXITE, EquipmentSlot.LEGS, (new FabricItemSettings())));
    public static final Item GOXITE_BOOTS = registerItem("goxite_boots", new ArmorItem(ModArmorMaterial.GOXITE, EquipmentSlot.FEET, (new FabricItemSettings())));

    public static final Item BORPITE_HELMET = registerItem("borpite_helmet", new ArmorItem(ModArmorMaterial.BORPITE, EquipmentSlot.HEAD, (new FabricItemSettings())));
    public static final Item BORPITE_CHESTPLATE = registerItem("borpite_chestplate", new ArmorItem(ModArmorMaterial.BORPITE, EquipmentSlot.CHEST, (new FabricItemSettings())));
    public static final Item BORPITE_LEGGINGS = registerItem("borpite_leggings", new ArmorItem(ModArmorMaterial.BORPITE, EquipmentSlot.LEGS, (new FabricItemSettings())));
    public static final Item BORPITE_BOOTS = registerItem("borpite_boots", new ArmorItem(ModArmorMaterial.BORPITE, EquipmentSlot.FEET, (new FabricItemSettings())));

    public static void addItemsToItemGroup() {
        addToItemGroup(ModItemGroups.MOOSITE, MOOSITE);
        addToItemGroup(ModItemGroups.MOOSITE, GOXITE);
        addToItemGroup(ModItemGroups.MOOSITE, RAW_GOXITE);
        addToItemGroup(ModItemGroups.MOOSITE, BORPITE);
        addToItemGroup(ModItemGroups.MOOSITE, RAW_BORPITE);

        addToItemGroup(ModItemGroups.MOOSITE, MOOSITE_HELMET);
        addToItemGroup(ModItemGroups.MOOSITE, MOOSITE_CHESTPLATE);
        addToItemGroup(ModItemGroups.MOOSITE, MOOSITE_LEGGINGS);
        addToItemGroup(ModItemGroups.MOOSITE, MOOSITE_BOOTS);
        addToItemGroup(ModItemGroups.MOOSITE, GOXITE_HELMET);
        addToItemGroup(ModItemGroups.MOOSITE, GOXITE_CHESTPLATE);
        addToItemGroup(ModItemGroups.MOOSITE, GOXITE_LEGGINGS);
        addToItemGroup(ModItemGroups.MOOSITE, GOXITE_BOOTS);
        addToItemGroup(ModItemGroups.MOOSITE, BORPITE_HELMET);
        addToItemGroup(ModItemGroups.MOOSITE, BORPITE_CHESTPLATE);
        addToItemGroup(ModItemGroups.MOOSITE, BORPITE_LEGGINGS);
        addToItemGroup(ModItemGroups.MOOSITE, BORPITE_BOOTS);
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

