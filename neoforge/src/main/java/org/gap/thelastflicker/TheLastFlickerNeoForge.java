package org.gap.thelastflicker;


import net.minecraft.core.registries.Registries;
import net.minecraft.world.entity.EntityType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.gap.thelastflicker.registry.EntityRegistry;

@Mod(Constants.MOD_ID)
public class TheLastFlickerNeoForge {
    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(Registries.ENTITY_TYPE, Constants.MOD_ID);

    public TheLastFlickerNeoForge(IEventBus eventBus) {
        ENTITIES.register(eventBus);
        eventBus.<EntityAttributeCreationEvent>addListener(event -> EntityRegistry.registerEntityAttributes(event::put));

        TheLastFlickerCommon.doRegistrations();

    }
}