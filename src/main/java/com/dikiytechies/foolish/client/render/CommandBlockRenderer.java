package com.dikiytechies.foolish.client.render;


import com.dikiytechies.foolish.AddonMain;
import com.dikiytechies.foolish.entity.CommandBlockEntity;
import com.github.standobyte.jojo.client.render.entity.renderer.SimpleEntityRenderer;


import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;

public class CommandBlockRenderer extends SimpleEntityRenderer<CommandBlockEntity, CommandBlockModel> {

    public CommandBlockRenderer(EntityRendererManager renderManager) {
        super(renderManager, new CommandBlockModel(),
                new ResourceLocation(AddonMain.MOD_ID, "textures/entity/command_block.png"));
    }
}
