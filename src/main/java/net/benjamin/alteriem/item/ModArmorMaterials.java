package net.benjamin.alteriem.item;

import net.benjamin.alteriem.AlteriemMod;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.LazyLoadedValue;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.util.Lazy;

import java.util.function.Supplier;

public enum ModArmorMaterials implements ArmorMaterial {
    STEEL("steel", 33, new int[]{3, 5, 7, 4}, 55,
            SoundEvents.ARMOR_EQUIP_IRON, 2.0F, 0.9F, () -> {
        return Ingredient.of(ModItems.STEEL_INGOT.get());
    }),

    RUBY("ruby", 44, new int[]{4, 6, 8, 5}, 66,
            SoundEvents.ARMOR_EQUIP_DIAMOND, 3.0F, 1.0F, () -> {
        return Ingredient.of(ModItems.RUBY.get());
    }),


    WYVNITE("wyvnite", 78, new int[]{6, 10, 15, 7}, 66,
            SoundEvents.ARMOR_EQUIP_DIAMOND, 5.0F, 4.0F, () -> {
        return Ingredient.of(ModItems.RUBY.get());
    }),



    ZINC("zinc", 78, new int[]{4, 10, 15, 7}, 66,
            SoundEvents.ARMOR_EQUIP_DIAMOND, 5.0F, 4.0F, () -> {
        return Ingredient.of(ModItems.RUBY.get());
    });

    private static final int[] HEALTH_PER_SLOT = new int[]{13, 15, 16, 11};
    private final String name;
    private final int durabilityMultiplier;
    private final int[] slotProtections;
    private final int enchantmentValue;
    private final SoundEvent sound;
    private final float toughness;
    private final float knockbackResistance;
    private final Lazy<Ingredient> repairIngredient;

    ModArmorMaterials(String name, int durabilityMultiplier, int[] slotProtections, int enchantmentValue,
                      SoundEvent sound, float toughness,
                      float knockbackResistance, Supplier<Ingredient> repairIngredient) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.slotProtections = slotProtections;
        this.enchantmentValue = enchantmentValue;
        this.sound = sound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredient = Lazy.of(repairIngredient);
    }

    public int getDurabilityForSlot(EquipmentSlot pSlot) {
        return HEALTH_PER_SLOT[pSlot.getIndex()] * this.durabilityMultiplier;
    }

    public int getDefenseForSlot(EquipmentSlot pSlot) {
        return this.slotProtections[pSlot.getIndex()];
    }

    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    public SoundEvent getEquipSound() {
        return this.sound;
    }

    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    public String getName() {
        return AlteriemMod.MOD_ID + ":" + this.name;
    }

    public float getToughness() {
        return this.toughness;
    }

    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}