package net.benjamin.alteriem.world.feature;

import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.*;

public class ModPlacedFeatures {

    public static final PlacedFeature STEEL_ORE_PLACED = PlacementUtils.register("steel_ore_placed",
            ModConfiguredFeature.STEEL_ORE.placed(ModOrePlacement.commonOrePlacement(7, // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80)))));

    public static final PlacedFeature RUBY_ORE_PLACED = PlacementUtils.register("ruby_ore_placed",
            ModConfiguredFeature.RUBY_ORE.placed(ModOrePlacement.commonOrePlacement(7, // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80)))));

    public static final PlacedFeature ZINC_ORE_PLACED = PlacementUtils.register("zinc_ore_placed",
            ModConfiguredFeature.ZINC_ORE.placed(ModOrePlacement.commonOrePlacement(7, // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80)))));

    public static final PlacedFeature WYVNITE_ORE_PLACED = PlacementUtils.register("end_citrine_ore_placed",
            ModConfiguredFeature.WYVNITE_ORE.placed(ModOrePlacement.commonOrePlacement(7, // VeinsPerChunk
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80)))));
}
