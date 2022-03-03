package net.reefside.elementalartifice.common.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class EarthCrystalBlock extends Block {

    private static final VoxelShape AABB = Block.box(4.0D, 0.0D, 4.0D, 12.0D, 12.0D, 12.0D);

    public EarthCrystalBlock(Properties props) {
        super(props);
    }

    @Override
    @Deprecated
    public VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext collisionContext) {
        return AABB;
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext placement) {
        return this.defaultBlockState().setValue(BlockStateProperties.FACING, placement.getNearestLookingDirection().getOpposite());
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(BlockStateProperties.FACING);
    }
}
