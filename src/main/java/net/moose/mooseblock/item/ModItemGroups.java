package net.moose.mooseblock.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.moose.mooseblock.mooseblock;

public class ModItemGroups {
    public static ItemGroup MOOSITE;

    public static void registerItemGroups() {
        MOOSITE = FabricItemGroup.builder(new Identifier(mooseblock.MOD_ID, "moosite"))
                .displayName(Text.translatable("itemgroup.moosite"))
                .icon(() -> new ItemStack(ModItems.MOOSITE))
                .build();
    }
}


