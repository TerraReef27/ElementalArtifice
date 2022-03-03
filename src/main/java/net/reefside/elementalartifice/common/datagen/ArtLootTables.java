package net.reefside.elementalartifice.common.datagen;

import net.minecraft.data.DataGenerator;
import net.reefside.elementalartifice.common.blocks.ArtBlocks;

public class ArtLootTables extends BaseLootTableProvider {

    public ArtLootTables(DataGenerator generator) {
        super(generator);
    }

    @Override
    protected void addTables() {
        lootTables.put(ArtBlocks.TEST_BLOCK.get(), createSimpleTable("test_block", ArtBlocks.TEST_BLOCK.get()));
        lootTables.put(ArtBlocks.MULTI_BLOCK.get(), createSimpleTable("multi_block", ArtBlocks.MULTI_BLOCK.get()));
        lootTables.put(ArtBlocks.EARTH_CRYSTAL_BLOCK.get(), createSimpleTable("earth_crystal_block", ArtBlocks.EARTH_CRYSTAL_BLOCK.get()));
    }
}
