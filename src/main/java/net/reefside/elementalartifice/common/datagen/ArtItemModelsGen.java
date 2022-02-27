package net.reefside.elementalartifice.common.datagen;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.reefside.elementalartifice.common.items.ArtItems;

import static net.reefside.elementalartifice.ElementalArtifice.MODID;

public class ArtItemModelsGen extends ItemModelProvider {

    public ArtItemModelsGen(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        withExistingParent(ArtItems.TEST_BLOCKITEM.get().getRegistryName().getPath(), modLoc("block/test_block"));
        singleTexture(ArtItems.RAW_EARTH_CRYSTAL_BLOCKITEM.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0",
                modLoc("item/dirt_bomb_item")
        );
        singleTexture(ArtItems.DIRT_BOMB_ITEM.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0",
                modLoc("item/dirt_bomb_item")
        );
    }
}
