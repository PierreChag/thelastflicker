package org.gap.thelastflicker.client.model;

import net.minecraft.resources.ResourceLocation;
import org.gap.thelastflicker.entity.ScreechersEntity;
import software.bernie.geckolib.model.DefaultedEntityGeoModel;

public class ScreechersModel extends DefaultedEntityGeoModel<ScreechersEntity> {
    public ScreechersModel() {
        super(ResourceLocation.fromNamespaceAndPath(TheLastFlickerCommon.MODID, "screechers"), true);
    }
}
