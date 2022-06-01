package net.benjamin.alteriem.block;

import net.benjamin.alteriem.AlteriemMod;
import net.benjamin.alteriem.item.ModCreativeModeTabs;
import net.benjamin.alteriem.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, AlteriemMod.MOD_ID);

    public static final RegistryObject<Block> STEEL_BLOCK = registerBlock("steel_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(5f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTabs.ALTERIEM);

    public static final RegistryObject<Block> RAW_STEEL_BLOCK = registerBlock("raw_steel_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(4f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTabs.ALTERIEM);

    public static final RegistryObject<Block> STEEL_ORE = registerBlock("steel_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(4f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTabs.ALTERIEM);

    public static final RegistryObject<Block> DEEPSLATE_STEEL_ORE = registerBlock("deepslate_steel_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(4f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTabs.ALTERIEM);

    public static final RegistryObject<Block> RUBY_BLOCK = registerBlock("ruby_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(5f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTabs.ALTERIEM);

    public static final RegistryObject<Block> RUBY_ORE = registerBlock("ruby_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(4f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTabs.ALTERIEM);

    public static final RegistryObject<Block> DEEPSLATE_RUBY_ORE = registerBlock("deepslate_ruby_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(4f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTabs.ALTERIEM);

    public static final RegistryObject<Block> ZINC_BLOCK = registerBlock("zinc_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(5f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTabs.ALTERIEM);

    public static final RegistryObject<Block> ZINC_ORE = registerBlock("zinc_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(4f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTabs.ALTERIEM);

    public static final RegistryObject<Block> DEEPSLATE_ZINC_ORE = registerBlock("deepslate_zinc_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(4f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTabs.ALTERIEM);

    public static final RegistryObject<Block> RAW_ZINC_BLOCK = registerBlock("raw_zinc_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(5f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTabs.ALTERIEM);

    public static final RegistryObject<Block> WYVNITE_BLOCK = registerBlock("wyvnite_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(5f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTabs.ALTERIEM);

    public static final RegistryObject<Block> WYVNITE_ORE = registerBlock("wyvnite_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(4f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTabs.ALTERIEM);

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }


    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(ModCreativeModeTabs.ALTERIEM)));
    }

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }

}
