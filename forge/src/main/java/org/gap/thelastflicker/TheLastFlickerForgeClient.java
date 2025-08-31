package org.gap.thelastflicker;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import org.gap.thelastflicker.client.TheLastFlickerClient;

@Mod.EventBusSubscriber(modid = TheLastFlickerCommon.MODID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
public class TheLastFlickerForgeClient {
    @SubscribeEvent
    public static void registerRenderers(final EntityRenderersEvent.RegisterRenderers event) {
        TheLastFlickerClient.registerRenderers(event::registerEntityRenderer, event::registerBlockEntityRenderer);
    }
}
