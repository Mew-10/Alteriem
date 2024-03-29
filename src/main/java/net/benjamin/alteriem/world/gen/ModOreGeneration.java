package net.benjamin.alteriem.world.gen;

import net.benjamin.alteriem.world.feature.ModPlacedFeatures;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import java.util.List;
import java.util.Set;
import java.util.function.Supplier;

public class ModOreGeneration {
    public static void generateOres(final BiomeLoadingEvent event) {
        List<Holder<PlacedFeature>> base =
                event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES);


        base.add(ModPlacedFeatures.STEEL_ORE_PLACED);
        base.add(ModPlacedFeatures.RUBY_ORE_PLACED);
        base.add(ModPlacedFeatures.ZINC_ORE_PLACED);

        if(event.getCategory() == Biome.BiomeCategory.THEEND) {
            base.add(ModPlacedFeatures.WYVNITE_ORE_PLACED);
        }


        }
    }