package net.reefside.elementalartifice.common.entities.projectiles;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.ThrowableItemProjectile;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Level;
import net.reefside.elementalartifice.common.items.ArtItems;

public class DirtBombEntityProjectile extends ThrowableItemProjectile {

    public DirtBombEntityProjectile(EntityType<? extends DirtBombEntityProjectile> type, Level level) {
        super(type, level);
    }

    public DirtBombEntityProjectile(EntityType<? extends DirtBombEntityProjectile> type, double x, double y, double z, Level level) {
        super(type, x, y, z, level);
    }

    public DirtBombEntityProjectile(EntityType<? extends DirtBombEntityProjectile> type, LivingEntity user, Level level) {
        super(type, user, level);
    }

    @Override
    protected Item getDefaultItem() {
        return ArtItems.DIRT_BOMB_ITEM.get();
    }
}
