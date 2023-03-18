package net.moose.mooseblock.world;

import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;
import net.moose.mooseblock.block.ModBlocks;
import net.moose.mooseblock.mooseblock;

import java.util.List;

public class ModConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?, ?>> MOOD_KEY = registerKey("mood_tree");
    public static final RegistryKey<ConfiguredFeature<?, ?>> SATIN_KEY = registerKey("satin_tree");

    public static final RegistryKey<ConfiguredFeature<?, ?>> GOXITE_KEY = registerKey("goxite_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> BORPITE_KEY = registerKey("borpite_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> MOOSITE_KEY = registerKey("moosite_ore");



    public static void bootstrap(Registerable<ConfiguredFeature<?,?>> context) {
        RuleTest stoneReplacables = new TagMatchRuleTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplacables = new TagMatchRuleTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);

        register(context, MOOD_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(ModBlocks.MOOD_LOG),
                new StraightTrunkPlacer(5, 3, 3),
                BlockStateProvider.of(ModBlocks.MOOD_LEAVES),
                new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 4),
                new TwoLayersFeatureSize(1, 0, 2)).build());

        register(context, SATIN_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(ModBlocks.SATIN_LOG),
                new StraightTrunkPlacer(4, 2, 5),
                BlockStateProvider.of(ModBlocks.SATIN_LEAVES),
                new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(1), 4),
                new TwoLayersFeatureSize(1, 0, 2)).build());


        List<OreFeatureConfig.Target> overworldGoxite =
                List.of(OreFeatureConfig.createTarget(stoneReplacables, ModBlocks.GOXITE_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplacables, ModBlocks.DEEPSLATE_GOXITE_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> overworldBorpite =
                List.of(OreFeatureConfig.createTarget(stoneReplacables, ModBlocks.BORPITE_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplacables, ModBlocks.DEEPSLATE_BORPITE_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> overworldMoosite =
                List.of(OreFeatureConfig.createTarget(stoneReplacables, ModBlocks.MOOSITE_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplacables, ModBlocks.DEEPSLATE_MOOSITE_ORE.getDefaultState()));



        register(context, GOXITE_KEY, Feature.ORE, new OreFeatureConfig(overworldGoxite, 12));
        register(context, BORPITE_KEY, Feature.ORE, new OreFeatureConfig(overworldBorpite, 7));
        register(context, MOOSITE_KEY, Feature.ORE, new OreFeatureConfig(overworldMoosite, 3));

    }


    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {


        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(mooseblock.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}



