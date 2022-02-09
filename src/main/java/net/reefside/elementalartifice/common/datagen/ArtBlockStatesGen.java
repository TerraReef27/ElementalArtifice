package net.reefside.elementalartifice.common.datagen;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.reefside.elementalartifice.ElementalArtifice;
import net.reefside.elementalartifice.common.blocks.ArtBlocks;

import static net.reefside.elementalartifice.ElementalArtifice.MODID;


public class ArtBlockStatesGen extends BlockStateProvider {

    public ArtBlockStatesGen(DataGenerator generator, ExistingFileHelper helper) {
        super(generator, ElementalArtifice.MODID, helper);
    }

    @Override
    protected void registerStatesAndModels() {
        simpleBlock(ArtBlocks.TEST_BLOCK.get());
    }
}
