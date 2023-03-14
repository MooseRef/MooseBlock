package net.moose.mooseblock.particle;

import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.minecraft.particle.DefaultParticleType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.moose.mooseblock.mooseblock;

public class ModParticles {
    public static final DefaultParticleType GLITTER_PARTICLE = FabricParticleTypes.simple();
    public static final DefaultParticleType SPARKLE_PARTICLE = FabricParticleTypes.simple();

    public static void registerModParticles() {
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(mooseblock.MOD_ID, "glitter_particle"),
                GLITTER_PARTICLE);
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(mooseblock.MOD_ID, "sparkle_particle"),
                SPARKLE_PARTICLE);
    }



}
