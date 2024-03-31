package com.dikiytechies.foolish.client;

import com.dikiytechies.foolish.AddonMain;
import com.dikiytechies.foolish.client.render.BlackStandRenderer;
import com.dikiytechies.foolish.client.render.PineConeStandRenderer;
import com.dikiytechies.foolish.init.InitEntities;
import com.dikiytechies.foolish.init.InitStands;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@EventBusSubscriber(modid = AddonMain.MOD_ID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientInit {
    
    @SubscribeEvent
    public static void onFMLClientSetup(FMLClientSetupEvent event) {
        RenderingRegistry.registerEntityRenderingHandler(
                //InitStands.PINE_CONE_STAND.getEntityType(), PineConeStandRenderer::new);
                InitStands.BLACK_STAND.getEntityType(), BlackStandRenderer::new);
    }
}
