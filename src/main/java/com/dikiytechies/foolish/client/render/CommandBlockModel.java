package com.dikiytechies.foolish.client.render;
// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.dikiytechies.foolish.entity.CommandBlockEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class CommandBlockModel extends EntityModel<CommandBlockEntity> {
	private final ModelRenderer bb_main;

	public CommandBlockModel() {
		texWidth = 128;
		texHeight = 128;

		bb_main = new ModelRenderer(this);
		bb_main.setPos(0.0F, 24.0F, 0.0F);
		bb_main.texOffs(0, 64).addBox(-16.0F, -23.0F, -16.0F, 32.0F, 32.0F, 32.0F, -9.0F, false);
	}

	@Override
	public void setupAnim(CommandBlockEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		bb_main.yRot = netHeadYaw * ((float)Math.PI / 90F);
		bb_main.xRot = ageInTicks * 2F;
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		bb_main.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}