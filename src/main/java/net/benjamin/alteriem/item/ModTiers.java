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
}
