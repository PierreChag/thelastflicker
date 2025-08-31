package org.gap.thelastflicker.registry;

import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.monster.Monster;
import org.gap.thelastflicker.TheLastFlickerCommon;
import org.gap.thelastflicker.entity.ScreechersEntity;

import java.util.function.BiConsumer;
import java.util.function.Supplier;

public class EntityRegistry {
    public static void init() {}

    public static final Supplier<EntityType<ScreechersEntity>> SCREECHERS = registerEntity("screechers", ScreechersEntity::new, 0.7f, 1.3f, 0x1F1F1F, 0x0D0D0D);

    public static void registerEntityAttributes(BiConsumer<EntityType<? extends LivingEntity>, AttributeSupplier> registrar) {
        AttributeSupplier.Builder genericMonsterAttribs = Monster.createMobAttributes()
                .add(Attributes.FOLLOW_RANGE, 16)
                .add(Attributes.MAX_HEALTH, 1)
                .add(Attributes.MOVEMENT_SPEED, 0.25f)
                .add(Attributes.ATTACK_DAMAGE, 5)
                .add(Attributes.ATTACK_KNOCKBACK, 0.1);

        registrar.accept(EntityRegistry.SCREECHERS.get(), genericMonsterAttribs.build());
    }

    private static <T extends Mob> Supplier<EntityType<T>> registerEntity(String name, EntityType.EntityFactory<T> entity, float width, float height, int primaryEggColor, int secondaryEggColor) {
        return TheLastFlickerCommon.COMMON_PLATFORM.registerEntity(name, () -> EntityType.Builder.of(entity, MobCategory.CREATURE).sized(width, height).build(name));
    }
}
