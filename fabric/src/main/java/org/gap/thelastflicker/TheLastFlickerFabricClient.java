package org.gap.thelastflicker;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import org.gap.thelastflicker.client.TheLastFlickerClient;

public class TheLastFlickerFabricClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        TheLastFlickerClient.registerEntityRenderers(EntityRendererRegistry::register);
        // No need to register BlockRendered, this mod doesn't have any (BlockEntityRenderers::register)
    }
}
