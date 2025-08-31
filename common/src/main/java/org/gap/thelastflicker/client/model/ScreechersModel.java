package org.gap.thelastflicker.client.model;

import net.minecraft.resources.ResourceLocation;
import org.gap.thelastflicker.Constants;
import org.gap.thelastflicker.TheLastFlickerCommon;
import org.gap.thelastflicker.entity.ScreechersEntity;
import software.bernie.geckolib.model.DefaultedEntityGeoModel;

public class ScreechersModel extends DefaultedEntityGeoModel<ScreechersEntity> {
    public ScreechersModel() {
        super(ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "screechers"), true);
    }
}
