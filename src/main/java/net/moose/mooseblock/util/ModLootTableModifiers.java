package net.moose.mooseblock.util;

import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.condition.MatchToolLootCondition;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.predicate.item.ItemPredicate;
import net.minecraft.util.Identifier;
import net.moose.mooseblock.item.ModItems;

public class ModLootTableModifiers {

    private static final Identifier GRASS_BLOCK_ID
            =new Identifier("minecraft","blocks/grass");
    private static final Identifier IGLOO_STRUCTURE_CHEST_ID
            =new Identifier("minecraft","chests/igloo_chest");
    private static final Identifier CREEPER_ID
            =new Identifier("minecraft","entities/creeper");

    public static void modifyLootTables() {
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
                if(GRASS_BLOCK_ID.equals(id)) {
                    LootPool.Builder poolBuilder = LootPool.builder()
                            .rolls(ConstantLootNumberProvider.create(1))
                            .conditionally(RandomChanceLootCondition.builder(0.30f))
                            .with(ItemEntry.builder(ModItems.TOMATO_SEEDS))
                            .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 2.0f)).build());
                    tableBuilder.pool(poolBuilder.build());
                }
                if(IGLOO_STRUCTURE_CHEST_ID.equals(id)) {
                    LootPool.Builder poolBuilder = LootPool.builder()
                            .rolls(ConstantLootNumberProvider.create(1))
                            .conditionally(RandomChanceLootCondition.builder(1f))
                            .with(ItemEntry.builder(ModItems.DICE_ICOSAHEDRON))
                            .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                    tableBuilder.pool(poolBuilder.build());
                }
            if(CREEPER_ID.equals(id)) {
                    LootPool.Builder poolBuilder = LootPool.builder()
                            .rolls(ConstantLootNumberProvider.create(1))
                            .conditionally(RandomChanceLootCondition.builder(1f))
                            .with(ItemEntry.builder(ModItems.TOMATO))
                            .conditionally(MatchToolLootCondition.builder(ItemPredicate.Builder.create()
                                    .items(ModItems.MOOSITE_SWORD)).build())
                            .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 2.0f)).build());
                    tableBuilder.pool(poolBuilder.build());
                }







        });
    }




}


