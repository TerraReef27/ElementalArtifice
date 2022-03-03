package net.reefside.elementalartifice.common.datagen;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;
import net.reefside.elementalartifice.ElementalArtifice;

@Mod.EventBusSubscriber(modid = ElementalArtifice.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ArtDataGen {

    @SubscribeEvent
    public static void gatherDataGenerators(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        ExistingFileHelper helper =  event.getExistingFileHelper();

        if(event.includeServer()) {
            ArtBlockTagsGen blockTags = new ArtBlockTagsGen(generator, helper);
            generator.addProvider(blockTags);
            generator.addProvider(new ArtItemGen(generator, blockTags, helper));
            generator.addProvider(new ArtLootTables(generator));
        }

        if(event.includeClient()) {
            generator.addProvider(new ArtBlockstateGen(generator, helper));
            generator.addProvider(new ArtItemModelsGen(generator, helper));
            generator.addProvider(new ArtLangProvider(generator, "en_us"));
        }
    }
}
