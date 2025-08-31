package org.gap.thelastflicker;

import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.DefaultedEntityGeoModel;

public class ScreechersModel extends DefaultedEntityGeoModel<ScreechersEntity> {
    public ScreechersModel() {
        super(ResourceLocation.fromNamespaceAndPath(TheLastFlickerCommon.MODID, "screechers"), true);
    }
}
