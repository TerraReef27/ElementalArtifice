package net.reefside.elementalartifice.common.datagen;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.reefside.elementalartifice.common.blocks.ArtBlocks;

import static net.reefside.elementalartifice.ElementalArtifice.MODID;


public class ArtBlockTagsGen extends BlockTagsProvider {

    public ArtBlockTagsGen(DataGenerator generator, ExistingFileHelper helper) {
        super(generator, MODID, helper);
    }

    @Override
    protected void addTags() {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ArtBlocks.TEST_BLOCK.get())
                .add(ArtBlocks.TEST_BLOCK.get());
    }
}
