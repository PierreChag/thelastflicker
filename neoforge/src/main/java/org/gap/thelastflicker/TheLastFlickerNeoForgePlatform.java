package org.gap.thelastflicker;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.CreativeModeTab;
import org.gap.thelastflicker.platform.TheLastFlickerPlatform;

import java.util.function.Supplier;

public class TheLastFlickerNeoForgePlatform implements TheLastFlickerPlatform {
    @Override
    public <T extends Entity> Supplier<EntityType<T>> registerEntity(String id, Supplier<EntityType<T>> entity) {
        return TheLastFlickerNeoForge.ENTITIES.register(id, entity);
    }

    @Override
    public CreativeModeTab.Builder newCreativeTabBuilder() {
        return CreativeModeTab.builder();
    }
}
