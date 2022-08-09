package net.benjamin.alteriem.item;

import net.benjamin.alteriem.AlteriemMod;
import net.benjamin.alteriem.item.custom.*;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, AlteriemMod.MOD_ID);

    public static final RegistryObject<Item> STEEL_INGOT = ITEMS.register("steel_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTabs.ALTERIEM)));

    public static final RegistryObject<Item> RAW_STEEL = ITEMS.register("raw_steel",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTabs.ALTERIEM)));


    public static final RegistryObject<Item> STEEL_SWORD = ITEMS.register("steel_sword",
            () -> new SwordItem(ModTiers.STEEL, 3, 3f,
                    new Item.Properties().tab(ModCreativeModeTabs.ALTERIEM)));

    public static final RegistryObject<Item> STEEL_PICKAXE = ITEMS.register("steel_pickaxe",
            () -> new PickaxeItem(ModTiers.STEEL, 1, 1f,
                    new Item.Properties().tab(ModCreativeModeTabs.ALTERIEM)));

    public static final RegistryObject<Item> STEEL_SHOVEL = ITEMS.register("steel_shovel",
            () -> new ShovelItem(ModTiers.STEEL, 0, 1f,
                    new Item.Properties().tab(ModCreativeModeTabs.ALTERIEM)));

    public static final RegistryObject<Item> STEEL_AXE = ITEMS.register("steel_axe",
            () -> new AxeItem(ModTiers.STEEL, 4, 0f,
                    new Item.Properties().tab(ModCreativeModeTabs.ALTERIEM)));

    public static final RegistryObject<Item> STEEL_HOE = ITEMS.register("steel_hoe",
            () -> new HoeItem(ModTiers.STEEL, 0, 0f,
                    new Item.Properties().tab(ModCreativeModeTabs.ALTERIEM)));

    public static final RegistryObject<Item> LAVA_STEW = ITEMS.register("lava_stew",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTabs.ALTERIEM).food(ModFoods.LAVA_STEW)));

    public static final RegistryObject<Item> STEEL_HELMET = ITEMS.register("steel_helmet",
            () -> new ModArmorItem(ModArmorMaterials.STEEL, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModeTabs.ALTERIEM)));

    public static final RegistryObject<Item> STEEL_CHESTPLATE = ITEMS.register("steel_chestplate",
            () -> new ArmorItem(ModArmorMaterials.STEEL, EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModCreativeModeTabs.ALTERIEM)));

    public static final RegistryObject<Item> STEEL_LEGGINGS = ITEMS.register("steel_leggings",
            () -> new ArmorItem(ModArmorMaterials.STEEL, EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModCreativeModeTabs.ALTERIEM)));

    public static final RegistryObject<Item> STEEL_BOOTS = ITEMS.register("steel_boots",
            () -> new ArmorItem(ModArmorMaterials.STEEL, EquipmentSlot.FEET,
                    new Item.Properties().tab(ModCreativeModeTabs.ALTERIEM)));

    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTabs.ALTERIEM)));

    public static final RegistryObject<Item> RUBY_SWORD = ITEMS.register("ruby_sword",
            () -> new SwordItem(ModTiers.RUBY, 4, 4f,
                    new Item.Properties().tab(ModCreativeModeTabs.ALTERIEM)));

    public static final RegistryObject<Item> RUBY_PICKAXE = ITEMS.register("ruby_pickaxe",
            () -> new PickaxeItem(ModTiers.RUBY, 2, 2f,
                    new Item.Properties().tab(ModCreativeModeTabs.ALTERIEM)));

    public static final RegistryObject<Item> RUBY_SHOVEL = ITEMS.register("ruby_shovel",
            () -> new ShovelItem(ModTiers.RUBY, 1, 2f,
                    new Item.Properties().tab(ModCreativeModeTabs.ALTERIEM)));

    public static final RegistryObject<Item> RUBY_AXE = ITEMS.register("ruby_axe",
            () -> new AxeItem(ModTiers.RUBY, 5, 1f,
                    new Item.Properties().tab(ModCreativeModeTabs.ALTERIEM)));

    public static final RegistryObject<Item> RUBY_HOE = ITEMS.register("ruby_hoe",
            () -> new HoeItem(ModTiers.RUBY, 1, 1f,
                    new Item.Properties().tab(ModCreativeModeTabs.ALTERIEM)));

    public static final RegistryObject<Item> RUBY_HELMET = ITEMS.register("ruby_helmet",
            () -> new ModArmorItemRuby(ModArmorMaterials.RUBY, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModeTabs.ALTERIEM)));

    public static final RegistryObject<Item> RUBY_CHESTPLATE = ITEMS.register("ruby_chestplate",
            () -> new ArmorItem(ModArmorMaterials.RUBY, EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModCreativeModeTabs.ALTERIEM)));

    public static final RegistryObject<Item> RUBY_LEGGINGS = ITEMS.register("ruby_leggings",
            () -> new ArmorItem(ModArmorMaterials.RUBY, EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModCreativeModeTabs.ALTERIEM)));

    public static final RegistryObject<Item> RUBY_BOOTS = ITEMS.register("ruby_boots",
            () -> new ArmorItem(ModArmorMaterials.RUBY, EquipmentSlot.FEET,
                    new Item.Properties().tab(ModCreativeModeTabs.ALTERIEM)));


    public static final RegistryObject<Item> ZINC = ITEMS.register("zinc",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTabs.ALTERIEM)));

    public static final RegistryObject<Item> RAW_ZINC = ITEMS.register("raw_zinc",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTabs.ALTERIEM)));


    public static final RegistryObject<Item> BRASS = ITEMS.register("brass",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTabs.ALTERIEM)));

    public static final RegistryObject<Item> BRASS_SWORD = ITEMS.register("brass_sword",
            () -> new SwordItem(ModTiers.BRASS, 4, 4f,
                    new Item.Properties().tab(ModCreativeModeTabs.ALTERIEM)));

    public static final RegistryObject<Item> BRASS_PICKAXE = ITEMS.register("brass_pickaxe",
            () -> new PickaxeItem(ModTiers.BRASS, 2, 2f,
                    new Item.Properties().tab(ModCreativeModeTabs.ALTERIEM)));

    public static final RegistryObject<Item> BRASS_SHOVEL = ITEMS.register("brass_shovel",
            () -> new ShovelItem(ModTiers.BRASS, 1, 2f,
                    new Item.Properties().tab(ModCreativeModeTabs.ALTERIEM)));

    public static final RegistryObject<Item> BRASS_AXE = ITEMS.register("brass_axe",
            () -> new AxeItem(ModTiers.BRASS, 5, 1f,
                    new Item.Properties().tab(ModCreativeModeTabs.ALTERIEM)));

    public static final RegistryObject<Item> BRASS_HOE = ITEMS.register("brass_hoe",
            () -> new HoeItem(ModTiers.BRASS, 1, 1f,
                    new Item.Properties().tab(ModCreativeModeTabs.ALTERIEM)));

    public static final RegistryObject<Item> WYVNITE = ITEMS.register("wyvnite",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTabs.ALTERIEM)));

    public static final RegistryObject<Item> WYVNITE_SWORD = ITEMS.register("wyvnite_sword",
            () -> new SwordItem(ModTiers.WYVNITE, 8, 7f,
                    new Item.Properties().tab(ModCreativeModeTabs.ALTERIEM)));

    public static final RegistryObject<Item> WYVNITE_PICKAXE = ITEMS.register("wyvnite_pickaxe",
            () -> new PickaxeItem(ModTiers.WYVNITE, 6, 3f,
                    new Item.Properties().tab(ModCreativeModeTabs.ALTERIEM)));

    public static final RegistryObject<Item> WYVNITE_SHOVEL = ITEMS.register("wyvnite_shovel",
            () -> new ShovelItem(ModTiers.WYVNITE, 5, 4f,
                    new Item.Properties().tab(ModCreativeModeTabs.ALTERIEM)));

    public static final RegistryObject<Item> WYVNITE_AXE = ITEMS.register("wyvnite_axe",
            () -> new AxeItem(ModTiers.WYVNITE, 10, 4f,
                    new Item.Properties().tab(ModCreativeModeTabs.ALTERIEM)));

    public static final RegistryObject<Item> WYVNITE_HOE = ITEMS.register("wyvnite_hoe",
            () -> new HoeItem(ModTiers.WYVNITE, 5, 5f,
                    new Item.Properties().tab(ModCreativeModeTabs.ALTERIEM)));

    public static final RegistryObject<Item> WYVNITE_HELMET = ITEMS.register("wyvnite_helmet",
            () -> new ModArmorItemWyvnite(ModArmorMaterials.WYVNITE, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModeTabs.ALTERIEM)));

    public static final RegistryObject<Item> WYVNITE_CHESTPLATE = ITEMS.register("wyvnite_chestplate",
            () -> new ArmorItem(ModArmorMaterials.WYVNITE, EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModCreativeModeTabs.ALTERIEM)));

    public static final RegistryObject<Item> WYVNITE_LEGGINGS = ITEMS.register("wyvnite_leggings",
            () -> new ArmorItem(ModArmorMaterials.WYVNITE, EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModCreativeModeTabs.ALTERIEM)));

    public static final RegistryObject<Item> WYVNITE_BOOTS = ITEMS.register("wyvnite_boots",
            () -> new ArmorItem(ModArmorMaterials.WYVNITE, EquipmentSlot.FEET,
                    new Item.Properties().tab(ModCreativeModeTabs.ALTERIEM)));




    public static void register (IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}