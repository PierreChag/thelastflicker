package org.gap.thelastflicker.client;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import org.gap.thelastflicker.client.renderer.ScreechersRenderer;
import org.gap.thelastflicker.registry.EntityRegistry;

import java.util.function.BiConsumer;

public class TheLastFlickerClient {
    public static void registerEntityRenderers(BiConsumer<EntityType<? extends Entity>, EntityRendererProvider> entityRenderers) {
        entityRenderers.accept(EntityRegistry.SCREECHERS.get(), ScreechersRenderer::new);

    }
}
