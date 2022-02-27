package net.reefside.elementalartifice.common.datagen;

import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.reefside.elementalartifice.ElementalArtifice;
import net.reefside.elementalartifice.common.blocks.ArtBlocks;

import java.util.Locale;

import static net.reefside.elementalartifice.ElementalArtifice.MODID;


public class ArtBlockstatesGen extends BlockStateProvider {

    public ArtBlockstatesGen(DataGenerator generator, ExistingFileHelper helper) {
        super(generator, MODID, helper);
    }

    @Override
    protected void registerStatesAndModels() {
        simpleBlock(ArtBlocks.TEST_BLOCK.get());
        logBlock((RotatedPillarBlock) ArtBlocks.MULTI_BLOCK.get());
        simpleBlockModel(ArtBlocks.RAW_EARTH_CRYSTAL_BLOCK.get());
    }

    private void simpleBlockModel(Block aBlock) {
        simpleBlock(aBlock, new ConfiguredModel(models().getExistingFile(new ResourceLocation(MODID, aBlock.getRegistryName().getPath()))));
    }
}
