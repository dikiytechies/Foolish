package com.dikiytechies.foolish.client.render;

import com.github.standobyte.jojo.client.render.entity.renderer.stand.StandEntityRenderer;
import com.dikiytechies.foolish.AddonMain;
import com.dikiytechies.foolish.entity.PineConeStandEntity;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;

public class PineConeStandRenderer extends StandEntityRenderer<PineConeStandEntity, PineConeStandModel> {
    
    public PineConeStandRenderer(EntityRendererManager renderManager) {
        super(renderManager, new PineConeStandModel(), 
                new ResourceLocation(AddonMain.MOD_ID, "textures/entity/stand/pine_cone_stand.png"), 0);
    }
}
