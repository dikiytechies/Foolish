package com.dikiytechies.foolish.util;

import com.dikiytechies.foolish.AddonMain;
import com.dikiytechies.foolish.init.InitPotions;
import com.github.standobyte.jojo.JojoMod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

@EventBusSubscriber(modid = AddonMain.MOD_ID, bus = EventBusSubscriber.Bus.MOD)
public class CommonSetup {
    @SubscribeEvent
    public static void onFMLCommonSetup(FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            InitPotions.registerRecipes();
        });
    }

}
