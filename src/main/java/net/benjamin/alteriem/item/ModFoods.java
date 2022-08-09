package net.benjamin.alteriem.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties LAVA_STEW = new FoodProperties.Builder().nutrition(4).saturationMod(0.5f)
            .effect(() -> new MobEffectInstance(MobEffects.WITHER, 150), 1.7f).build();
}