package net.moose.mooseblock.enchantment;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.moose.mooseblock.enchantment.custom.FrostEnchantment;
import net.moose.mooseblock.item.ModItemGroups;
import net.moose.mooseblock.mooseblock;

public class ModEnchantments {

    public static final Enchantment FROST = registerEnchantment("frost",
            new FrostEnchantment(), ModItemGroups.MOOSITE );


    private static Enchantment registerEnchantment(String name, Enchantment enchantment, ItemGroup group) {
        return Registry.register(Registries.ENCHANTMENT, new Identifier(mooseblock.MOD_ID, name), enchantment);
    }

    public static void registerModEnchantments(){
        mooseblock.LOGGER.info("Registering ModEnchantments for " + mooseblock.MOD_ID);
    }
}
