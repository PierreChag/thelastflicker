package org.gap.thelastflicker.client;

import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import org.gap.thelastflicker.client.renderer.ScreechersRenderer;
import org.gap.thelastflicker.registry.EntityRegistry;

import java.util.function.BiConsumer;

public class TheLastFlickerClient {
    public static void registerRenderers(BiConsumer<EntityType<? extends Entity>, EntityRendererProvider> entityRenderers,
                                         BiConsumer<BlockEntityType<? extends BlockEntity>, BlockEntityRendererProvider> blockEntityRenderers) {
        entityRenderers.accept(EntityRegistry.SCREECHERS.get(), ScreechersRenderer::new);

    }
}
