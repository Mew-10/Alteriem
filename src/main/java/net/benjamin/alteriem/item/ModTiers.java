package net.benjamin.alteriem.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModTiers {
    public class modTiers {
    }
    public static final ForgeTier STEEL = new ForgeTier(2, 1400, 1.5f,
            3f, 22, BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(ModItems.STEEL_INGOT.get()));

    public static final ForgeTier RUBY = new ForgeTier(3, 1300, 1.7f,
            4f, 26, BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(ModItems.RUBY.get()));

    public static final ForgeTier BRASS = new ForgeTier(2, 1600, 3f,
            2f, 56, BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(ModItems.BRASS.get()));

    public static final ForgeTier WYVNITE = new ForgeTier(5, 2000, 6f,
            9f, 100, BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(ModItems.WYVNITE.get()));
}
