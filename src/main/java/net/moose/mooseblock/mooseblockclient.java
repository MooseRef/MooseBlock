package net.moose.mooseblock;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.minecraft.client.render.RenderLayer;
import net.moose.mooseblock.block.ModBlocks;
import net.moose.mooseblock.particle.ModParticles;
import net.moose.mooseblock.particle.custom.GlitterParticle;

public class mooseblockclient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {


        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.TOMATO_CROP, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.MOOD_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.MOOD_SAPLING, RenderLayer.getCutout());

        ParticleFactoryRegistry.getInstance().register(ModParticles.GLITTER_PARTICLE, GlitterParticle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(ModParticles.SPARKLE_PARTICLE, GlitterParticle.Factory::new);
    }
}
