package net.reefside.elementalartifice;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

//Possible issues on one sided registries
import static net.reefside.elementalartifice.common.blocks.ArtBlocks.BLOCKS;
import static net.reefside.elementalartifice.common.items.ArtItems.ITEMS;
import static net.reefside.elementalartifice.common.entities.ArtEntities.ENTITIES;

@Mod(ElementalArtifice.MODID)
public class ElementalArtifice {

    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MODID = "elementalartifice";
    public static final String MODNAME = "Elemental Artifice";
    public static final CreativeModeTab ITEM_GROUP = new CreativeModeTab(MODNAME) {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(Items.AMETHYST_SHARD);
        }
    };

    public ElementalArtifice() {
        IEventBus modbus = FMLJavaModLoadingContext.get().getModEventBus();

        modbus.addListener(this::setup);

        BLOCKS.register(modbus);
        ITEMS.register(modbus);
        ENTITIES.register(modbus);
    }

    private void setup(FMLCommonSetupEvent event)
    {

    }
}