package net.neverandy.moredyes.data;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;
import net.neverandy.moredyes.MoreDyes;
import net.neverandy.moredyes.data.client.ModItemModelProvider;

@Mod.EventBusSubscriber(modid = MoreDyes.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public final class DataGen {
    private DataGen(){}

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event){
        DataGenerator gen = event.getGenerator();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();

        //gen.addProvider(new ModBlockStateProvider(gen, existingFileHelper));
        gen.addProvider(new ModItemModelProvider(gen, existingFileHelper));
    }
}
