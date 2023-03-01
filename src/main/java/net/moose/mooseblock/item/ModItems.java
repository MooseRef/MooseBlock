package net.moose.mooseblock.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.moose.mooseblock.mooseblock;

public class ModItems {
    public static final Item MOOSITE = registerItem("moosite",
            new Item(new FabricItemSettings()));
    public static final Item GOXITE = registerItem("goxite",
            new Item(new FabricItemSettings()));
    public static final Item RAW_GOXITE = registerItem("raw_goxite",
            new Item(new FabricItemSettings()));
    public static final Item BORPITE = registerItem("borpite",
            new Item(new FabricItemSettings()));
    public static final Item RAW_BORPITE = registerItem("raw_borpite",
            new Item(new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(mooseblock.MOD_ID, name), item);
    }

    public static void addItemsToItemGroup() {
        addToItemGroup(ModItemGroups.MOOSITE, MOOSITE);
        addToItemGroup(ModItemGroups.MOOSITE, GOXITE);
        addToItemGroup(ModItemGroups.MOOSITE, RAW_GOXITE);
        addToItemGroup(ModItemGroups.MOOSITE, BORPITE);
        addToItemGroup(ModItemGroups.MOOSITE, RAW_BORPITE);
    }

    private static void addToItemGroup(ItemGroup group, Item item) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }


    public static void registerModItems() {
        mooseblock.LOGGER.info("Registering Mod Items For" + mooseblock.MOD_ID);

        addItemsToItemGroup();
    }
}

