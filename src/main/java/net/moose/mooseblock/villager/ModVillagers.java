package net.moose.mooseblock.villager;

import com.google.common.collect.ImmutableSet;
import net.fabricmc.fabric.api.object.builder.v1.world.poi.PointOfInterestHelper;
import net.minecraft.block.Block;
import net.minecraft.util.Identifier;
import net.minecraft.world.poi.PointOfInterestType;
import net.moose.mooseblock.mooseblock;

public class ModVillagers {

 //   public static VillagerProfession registerProfession(String name, RegistryKeys<PointOfInterestType> type){
 //       return Registry.register(Registries.VILLAGER_PROFESSION, new Identifier(mooseblock.MOD_ID, name),
 //               VillagerProfessionBuilder.create().id(new Identifier(mooseblock.MOD_ID)).workstation(type)
 //                       .workSound(SoundEvents.ENTITY_VILLAGER_WORK_WEAPONSMITH).build());
 //   }

    public static PointOfInterestType registerPOI(String name, Block block) {
        return PointOfInterestHelper.register(new Identifier(mooseblock.MOD_ID, name),
                1, 1, ImmutableSet.copyOf(block.getStateManager().getStates()));

    }


    public static void registerVillagers() {
        mooseblock.LOGGER.debug("Registering Villagers for " + mooseblock.MOD_ID);
    }
}
