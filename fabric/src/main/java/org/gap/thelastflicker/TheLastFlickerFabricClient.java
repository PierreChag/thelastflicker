package org.gap.thelastflicker;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderers;
import org.gap.thelastflicker.client.TheLastFlickerClient;

public class TheLastFlickerFabricClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        TheLastFlickerClient.registerRenderers(EntityRendererRegistry::register, BlockEntityRenderers::register);
    }
}
