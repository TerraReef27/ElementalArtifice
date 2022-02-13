package net.reefside.elementalartifice.common.entities;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.reefside.elementalartifice.common.entities.projectiles.DirtBombProjectileEntity;
import net.minecraft.world.entity.EntityType.Builder;
import net.reefside.elementalartifice.common.items.ArtItems;

import static net.reefside.elementalartifice.ElementalArtifice.MODID;

public class ArtEntities {

    public static DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITIES, MODID);

    public static RegistryObject<EntityType<DirtBombProjectileEntity>> DIRT_BOMB_PROJECTILE = ENTITIES.register(
            "dirt_bomb_projectile",
            () -> EntityType.Builder.<DirtBombProjectileEntity>of(DirtBombProjectileEntity::new, MobCategory.MISC)
                    .sized(0.1F, 0.1F)
                    .build(MODID+"dirt_bomb_projectile")
    );
}
