package net.reefside.elementalartifice.common.datagen;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.reefside.elementalartifice.common.items.ArtItems;

import static net.reefside.elementalartifice.ElementalArtifice.MODID;

public class ArtItemGen extends ItemTagsProvider {

    public ArtItemGen(DataGenerator generator, BlockTagsProvider blockTags, ExistingFileHelper helper) {
        super(generator, blockTags, MODID, helper);
    }

    @Override
    protected void addTags() {
        tag(Tags.Items.COBBLESTONE)
            .add(ArtItems.TEST_BLOCKITEM.get())
            .add(ArtItems.EARTH_CRYSTAL_BLOCKITEM.get())
            .add(ArtItems.WATER_CRYSTAL_BLOCKITEM.get())
            .add(ArtItems.AIR_CRYSTAL_BLOCKITEM.get());
    }

    @Override
    public String getName() {
        return "Elemental Artifice Tags";
    }
}
