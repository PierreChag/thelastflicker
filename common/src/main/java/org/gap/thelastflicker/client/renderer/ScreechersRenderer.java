package org.gap.thelastflicker.client.renderer;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.gap.thelastflicker.client.model.ScreechersModel;
import org.gap.thelastflicker.entity.ScreechersEntity;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class ScreechersRenderer extends GeoEntityRenderer<ScreechersEntity> {

    public ScreechersRenderer(EntityRendererProvider.Context context) {
        super(context, new ScreechersModel());
    }

    /*
    @Override
    public void renderFinal(PoseStack poseStack, BatEntity animatable, BakedGeoModel model, MultiBufferSource bufferSource, VertexConsumer buffer, float partialTick, int packedLight, int packedOverlay, int colour) {
        if (this.currentTick < 0 || this.currentTick != animatable.tickCount) {
            this.currentTick = animatable.tickCount;

            // Find the earbone and use it as the point of reference
            this.model.getBone("leftear").ifPresent(ear -> {
                RandomSource rand = animatable.getRandom();
                Vector3d earPos = ear.getWorldPosition();

                animatable.getCommandSenderWorld().addParticle(ParticleTypes.PORTAL,
                        earPos.x(),
                        earPos.y(),
                        earPos.z(),
                        rand.nextDouble() - 0.5D,
                        -rand.nextDouble(),
                        rand.nextDouble() - 0.5D);
            });
        }

        super.renderFinal(poseStack, animatable, model, bufferSource, buffer, partialTick, packedLight, packedOverlay, colour);
    }*/
}
