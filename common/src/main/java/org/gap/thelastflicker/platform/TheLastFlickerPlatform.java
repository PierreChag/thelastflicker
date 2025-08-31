package org.gap.thelastflicker.platform;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.CreativeModeTab;

import java.util.function.Supplier;

public interface TheLastFlickerPlatform {
    <T extends Entity> Supplier<EntityType<T>> registerEntity(String id, Supplier<EntityType<T>> entity);

    CreativeModeTab.Builder newCreativeTabBuilder();
}
