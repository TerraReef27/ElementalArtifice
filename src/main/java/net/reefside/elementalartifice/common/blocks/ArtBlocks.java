package net.reefside.elementalartifice.common.blocks;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static net.reefside.elementalartifice.ElementalArtifice.MODID;

public class ArtBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MODID);

    public static final RegistryObject<Block> TEST_BLOCK = BLOCKS.register("test_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2f)));

    public static final RegistryObject<Block> MULTI_BLOCK = BLOCKS.register("multi_block",
            () -> new MultiBlock(BlockBehaviour.Properties.of(Material.CLAY)));

    public static final RegistryObject<Block> EARTH_CRYSTAL_BLOCK = BLOCKS.register("earth_crystal_block",
            () -> new EarthCrystalBlock(BlockBehaviour.Properties.of(Material.STONE)));
    public static final RegistryObject<Block> WATER_CRYSTAL_BLOCK = BLOCKS.register("water_crystal_block",
            () -> new EarthCrystalBlock(BlockBehaviour.Properties.of(Material.STONE)));
    public static final RegistryObject<Block> AIR_CRYSTAL_BLOCK = BLOCKS.register("air_crystal_block",
            () -> new EarthCrystalBlock(BlockBehaviour.Properties.of(Material.STONE)));
}
