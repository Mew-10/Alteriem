package net.benjamin.alteriem.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTabs {
    public static final CreativeModeTab ALTERIEM = new CreativeModeTab("alteriem") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.STEEL_INGOT.get());
        }
    }; {

            }
    }


