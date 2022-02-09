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
        ArtBlockTagsGen blockTags = new ArtBlockTagsGen(generator,helper);
        generator.addProvider(blockTags);
        generator.addProvider(new ArtBlockStatesGen(generator, helper));
        generator.addProvider(new ArtItemGen(generator, blockTags, helper));
    }
}
