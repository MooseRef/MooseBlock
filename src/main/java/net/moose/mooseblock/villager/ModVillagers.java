package net.moose.mooseblock.villager;

import com.google.common.collect.ImmutableSet;
import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.fabricmc.fabric.api.object.builder.v1.villager.VillagerProfessionBuilder;
import net.fabricmc.fabric.api.object.builder.v1.world.poi.PointOfInterestHelper;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.VillagerProfession;
import net.minecraft.world.poi.PointOfInterestType;
import net.moose.mooseblock.block.ModBlocks;
import net.moose.mooseblock.item.ModItems;
import net.moose.mooseblock.mooseblock;

public class ModVillagers {

    public static final PointOfInterestType TRINKET_POI = registerPOI("trinket_poi", ModBlocks.REGEN_PAD);
    public static final VillagerProfession TRINKET_MAKER = registerProfession("trinket_maker",
            RegistryKey.of(Registries.POINT_OF_INTEREST_TYPE.getKey(), new Identifier(mooseblock.MOD_ID, "trinket_poi")));


    public static VillagerProfession registerProfession(String name, RegistryKey<PointOfInterestType> type) {
        return Registry.register(Registries.VILLAGER_PROFESSION, new Identifier(mooseblock.MOD_ID, name),
                VillagerProfessionBuilder.create().id(new Identifier(mooseblock.MOD_ID, name)).workstation(type)
                        .workSound(SoundEvents.ENTITY_VILLAGER_WORK_MASON).build());
    }


    public static PointOfInterestType registerPOI(String name, Block block) {
        return PointOfInterestHelper.register(new Identifier(mooseblock.MOD_ID, name),
                1, 15, ImmutableSet.copyOf(block.getStateManager().getStates()));

    }


    public static void registerVillagers() {
        mooseblock.LOGGER.debug("Registering Villagers for " + mooseblock.MOD_ID);
    }

    public static void registerTrades() {
        TradeOfferHelper.registerVillagerOffers(TRINKET_MAKER, 1,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 10),
                            new ItemStack(ModItems.DICE_ICOSAHEDRON, 1),
                            6, 2, 0.02f
                    )));
                });
    }
}