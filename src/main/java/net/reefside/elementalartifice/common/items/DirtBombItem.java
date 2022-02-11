package net.reefside.elementalartifice.common.items;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.reefside.elementalartifice.common.entities.ArtEntities;
import net.reefside.elementalartifice.common.entities.projectiles.DirtBombEntityProjectile;


public class DirtBombItem extends Item {

    public DirtBombItem(Properties properties) {
        super(properties);
    }

    @Override
    InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        ItemStack itemStack = player.getItemInHand(hand);
        level.playSound((Player)null, player.getX(), player.getY(), player.getZ(), SoundEvents.SNOWBALL_THROW, SoundSource.NEUTRAL, 0.5F, 0.4F);

        if(!level.isClientSide) {
            DirtBombEntityProjectile dirtBomb = new DirtBombEntityProjectile(ArtEntities.DIRT_BOMB, level, player);
            dirtBomb.setItem(itemStack);
            level.addFreshEntity(dirtBomb);
        }

        if(!player.getAbilities().instabuild) {
            itemStack.shrink(1);
        }

        return InteractionResultHolder.sidedSuccess(itemStack, level.isClientSide());
    }
}
