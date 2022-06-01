package net.benjamin.alteriem.world.feature;

import net.benjamin.alteriem.block.ModBlocks;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.WeightedPlacedFeature;
import net.minecraft.world.level.levelgen.feature.configurations.*;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;

import java.util.List;

public class ModConfiguredFeature {
    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_STEEL_ORES = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.STEEL_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_STEEL_ORE.get().defaultBlockState()));

    public static final ConfiguredFeature<?, ?> STEEL_ORE = FeatureUtils.register("steel_ore",
            Feature.ORE.configured(new OreConfiguration(OVERWORLD_STEEL_ORES, 9)));

    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_RUBY_ORES = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.RUBY_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_RUBY_ORE.get().defaultBlockState()));

    public static final ConfiguredFeature<?, ?> RUBY_ORE = FeatureUtils.register("ruby_ore",
            Feature.ORE.configured(new OreConfiguration(OVERWORLD_RUBY_ORES, 9)));

    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_ZINC_ORES = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.ZINC_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_ZINC_ORE.get().defaultBlockState()));

    public static final ConfiguredFeature<?, ?> ZINC_ORE = FeatureUtils.register("zinc_ore",
            Feature.ORE.configured(new OreConfiguration(OVERWORLD_ZINC_ORES, 9)));


    public static final List<OreConfiguration.TargetBlockState> END_WYVNITE_ORES = List.of(
            OreConfiguration.target(new BlockMatchTest(Blocks.END_STONE), ModBlocks.WYVNITE_ORE.get().defaultBlockState()));

    public static final ConfiguredFeature<?, ?> WYVNITE_ORE = FeatureUtils.register("wyvnite_ore",
            Feature.ORE.configured(new OreConfiguration(END_WYVNITE_ORES, 9)));
}