package net.benjamin.alteriem.world.feature;

import net.benjamin.alteriem.AlteriemMod;
import net.benjamin.alteriem.config.AlteriemCommonConfigs;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.*;

public class ModPlacedFeatures {

    public static final Holder<PlacedFeature> STEEL_ORE_PLACED = PlacementUtils.register("steel_ore_placed",
            ModConfiguredFeature.STEEL_ORE, ModOrePlacement.commonOrePlacement(
                        AlteriemCommonConfigs.STEEL_ORE_VEINS_PER_CHUNK.get(), // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80))));

    public static final Holder<PlacedFeature> RUBY_ORE_PLACED = PlacementUtils.register("ruby_ore_placed",
            ModConfiguredFeature.RUBY_ORE, ModOrePlacement.commonOrePlacement(
                   AlteriemCommonConfigs.RUBY_ORE_VEINS_PER_CHUNK.get(), // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80))));

    public static final Holder<PlacedFeature> ZINC_ORE_PLACED = PlacementUtils.register("zinc_ore_placed",
            ModConfiguredFeature.ZINC_ORE, (ModOrePlacement.commonOrePlacement(
                   AlteriemCommonConfigs.ZINC_ORE_VEINS_PER_CHUNK.get(), // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80)))));

    public static final Holder<PlacedFeature> WYVNITE_ORE_PLACED = PlacementUtils.register("end_citrine_ore_placed",
            ModConfiguredFeature.WYVNITE_ORE, (ModOrePlacement.commonOrePlacement(
                   AlteriemCommonConfigs.WYVNITE_ORE_VEINS_PER_CHUNK.get(), // VeinsPerChunk
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80)))));
}
