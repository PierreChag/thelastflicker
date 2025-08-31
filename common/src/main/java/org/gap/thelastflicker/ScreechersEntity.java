package org.gap.thelastflicker;

import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import software.bernie.geckolib.animatable.GeoEntity;
import software.bernie.geckolib.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.animation.AnimatableManager;
import software.bernie.geckolib.animation.AnimationController;
import software.bernie.geckolib.constant.DefaultAnimations;
import software.bernie.geckolib.util.ClientUtil;
import software.bernie.geckolib.util.GeckoLibUtil;

public class ScreechersEntity extends PathfinderMob implements GeoEntity {
    private final AnimatableInstanceCache cache = GeckoLibUtil.createInstanceCache(this);

    public ScreechersEntity(EntityType<? extends PathfinderMob> type, Level level) {
        super(type, level);
    }

    @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar controllers) {
        controllers.add(
                // Add our flying animation controller
                new AnimationController<>(this, 10, state -> state.setAndContinue(DefaultAnimations.FLY))
                        // Handle the custom instruction keyframe that is part of our animation json
                        .setCustomInstructionKeyframeHandler(state -> {
                            Player player = ClientUtil.getClientPlayer();

                            if (player != null)
                                player.displayClientMessage(Component.literal("KeyFraming"), true);
                        }),
                // Add our generic living animation controller
                DefaultAnimations.genericLivingController(this)
        );
    }

    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return this.cache;
    }
}
