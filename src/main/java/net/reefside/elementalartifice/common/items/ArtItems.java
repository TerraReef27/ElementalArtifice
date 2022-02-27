package net.reefside.elementalartifice.common.items;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.reefside.elementalartifice.common.blocks.ArtBlocks;

import static net.reefside.elementalartifice.ElementalArtifice.ITEM_GROUP;
import static net.reefside.elementalartifice.ElementalArtifice.MODID;

public class ArtItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);

    public static final RegistryObject<Item> TEST_BLOCKITEM = ITEMS.register(ArtBlocks.TEST_BLOCK.getId().getPath(), () -> new BlockItem(ArtBlocks.TEST_BLOCK.get(), new Item.Properties().tab(ITEM_GROUP)));
    public static final RegistryObject<Item> MULTI_BLOCK = ITEMS.register(ArtBlocks.MULTI_BLOCK.getId().getPath(), () -> new BlockItem(ArtBlocks.MULTI_BLOCK.get(), new Item.Properties().tab(ITEM_GROUP)));
    public static final RegistryObject<Item> RAW_EARTH_CRYSTAL_BLOCKITEM = ITEMS.register(ArtBlocks.RAW_EARTH_CRYSTAL_BLOCK.getId().getPath(), () -> new BlockItem(ArtBlocks.RAW_EARTH_CRYSTAL_BLOCK.get(), new Item.Properties().tab((ITEM_GROUP))));
    public static final RegistryObject<Item> DIRT_BOMB_ITEM = ITEMS.register("dirt_bomb", () -> new DirtBombItem(new Item.Properties().tab(ITEM_GROUP)));
}
