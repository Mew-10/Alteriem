package net.benjamin.alteriem.item;

import net.benjamin.alteriem.AlteriemMod;
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






    public static void register (IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}