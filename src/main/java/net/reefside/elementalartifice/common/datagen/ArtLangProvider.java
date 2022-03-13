package net.reefside.elementalartifice.common.datagen;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;
import net.reefside.elementalartifice.common.blocks.ArtBlocks;
import net.reefside.elementalartifice.common.items.ArtItems;

import static net.reefside.elementalartifice.ElementalArtifice.*;

public class ArtLangProvider extends LanguageProvider {
    public ArtLangProvider(DataGenerator dataGen, String locale) {
        super(dataGen, MODID, locale);
    }

    @Override
    protected void addTranslations() {
        add("itemGroup." + MODNAME, "Elemental Artifice");

        add(ArtBlocks.TEST_BLOCK.get(), "Test Block");
        add(ArtBlocks.MULTI_BLOCK.get(), "Multi Block");
        add(ArtBlocks.EARTH_CRYSTAL_BLOCK.get(), "Earth Crystal Chunk");
        add(ArtBlocks.WATER_CRYSTAL_BLOCK.get(), "Water Crystal Chunk");
        add(ArtBlocks.AIR_CRYSTAL_BLOCK.get(), "Air Crystal Chunk");
        add(ArtItems.DIRT_BOMB_ITEM.get(), "Dirt Bomb");
    }
}
