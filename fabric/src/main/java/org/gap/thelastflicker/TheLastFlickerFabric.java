package org.gap.thelastflicker;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import org.gap.thelastflicker.registry.EntityRegistry;

public class TheLastFlickerFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        TheLastFlickerCommon.doRegistrations();
        EntityRegistry.registerEntityAttributes(FabricDefaultAttributeRegistry::register);
    }
}
