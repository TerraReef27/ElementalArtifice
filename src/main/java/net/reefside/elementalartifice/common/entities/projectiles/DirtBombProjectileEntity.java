package net.reefside.elementalartifice.common.entities.projectiles;

import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ItemParticleOption;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.ThrowableItemProjectile;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.HitResult;
import net.reefside.elementalartifice.common.blocks.ArtBlocks;
import net.reefside.elementalartifice.common.items.ArtItems;

public class DirtBombProjectileEntity extends ThrowableItemProjectile {

    public DirtBombProjectileEntity(EntityType<? extends DirtBombProjectileEntity> type, Level level) {
        super(type, level);
    }

    public DirtBombProjectileEntity(EntityType<? extends DirtBombProjectileEntity> type, double x, double y, double z, Level level) {
        super(type, x, y, z, level);
    }

    public DirtBombProjectileEntity(EntityType<? extends DirtBombProjectileEntity> type, LivingEntity user, Level level) {
        super(type, user, level);
    }

    @Override
    protected Item getDefaultItem() {
        return ArtItems.DIRT_BOMB_ITEM.get();
    }

    public void handleEntityEvent(byte pId) {
        System.out.println("Handling entity");
        if(pId == 3) {
            System.out.println("Adding particles");
            ParticleOptions particleOptions = this.getParticle();

            for(int i=0; i<100; i++) {
                this.level.addParticle(particleOptions, this.getX(), this.getY(), this.getZ(), 10.0D,  10.0D, 10.0D);
            }
        }
    }

    protected void onHitEntity(EntityHitResult entityHitResult) {
        System.out.println("Hit entity");
        super.onHitEntity(entityHitResult);
        Entity entity = entityHitResult.getEntity();
        entity.hurt(DamageSource.thrown(this, this.getOwner()), 100F);
    }

    protected void onHit(HitResult hitResult) {
        super.onHit(hitResult);
        if(!this.level.isClientSide) {
            this.level.broadcastEntityEvent(this, (byte)3);
            System.out.println("Hit Position: " + this.blockPosition());
            BlockState block = Blocks.DIRT.defaultBlockState();
            createCluster(this.blockPosition(), block, 3);
            this.discard();
        }
    }

    private ParticleOptions getParticle() {
        ItemStack itemstack = this.getItemRaw();
        return (ParticleOptions)(itemstack.isEmpty() ? ParticleTypes.ASH : new ItemParticleOption(ParticleTypes.ITEM, itemstack));
    }

    private void createCluster(BlockPos blockPos, BlockState block, int size) {
            int circumference = size*size+1;
            for(int i= -circumference; i<circumference; i++) {
                for(int j= -circumference; j<circumference; j++) {
                    for(int k= -circumference; k<circumference; k++) {
                        int d = i*i + j*j + k*k;
                        if(d < circumference-1) {
                            level.setBlockAndUpdate(blockPos.offset(i, j, k), block);
                        }
                    }
                }
            }
    }
}
