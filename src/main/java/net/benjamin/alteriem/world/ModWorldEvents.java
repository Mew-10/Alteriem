package net.benjamin.alteriem.world;

import net.benjamin.alteriem.AlteriemMod;
import net.benjamin.alteriem.world.gen.ModOreGeneration;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = AlteriemMod.MOD_ID)
public class ModWorldEvents {
    @SubscribeEvent
    public static void biomeLoadingEvent(final BiomeLoadingEvent event) {

        ModOreGeneration.generateOres(event);
    }
}