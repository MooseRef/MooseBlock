package net.moose.mooseblock.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.moose.mooseblock.mooseblock;

public class ModItemGroup {
    public static ItemGroup MOOSITE;
    public static ItemGroup GOXITE;
    public static ItemGroup BORPITE;
    public static void  registerItemGroups() {
        MOOSITE = FabricItemGroup.builder(new Identifier(mooseblock.MOD_ID, "moosite"))
                .displayName(Text.translatable("itemgroup.moosite"))
                .icon(()-> new ItemStack(ModItems.MOOSITE)).build();
        GOXITE = FabricItemGroup.builder(new Identifier(mooseblock.MOD_ID, "goxite"))
                .displayName(Text.translatable("itemgroup.goxite"))
                .icon(()-> new ItemStack(ModItems.GOXITE)).build();
        BORPITE = FabricItemGroup.builder(new Identifier(mooseblock.MOD_ID, "borpite"))
                .displayName(Text.translatable("itemgroup.borpite"))
                .icon(()-> new ItemStack(ModItems.BORPITE)).build();

    }



}
