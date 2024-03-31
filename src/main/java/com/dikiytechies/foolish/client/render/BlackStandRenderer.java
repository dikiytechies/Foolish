package com.dikiytechies.foolish.client.render;

import com.dikiytechies.foolish.entity.BlackStandEntity;
import com.github.standobyte.jojo.client.render.entity.renderer.stand.StandEntityRenderer;
import com.dikiytechies.foolish.AddonMain;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;

public class BlackStandRenderer extends StandEntityRenderer<BlackStandEntity, BlackStandModel> {
    
    public BlackStandRenderer(EntityRendererManager renderManager) {
        super(renderManager, new BlackStandModel(),
                new ResourceLocation(AddonMain.MOD_ID, "textures/entity/stand/black_stand.png"), 0);
    }
}
