// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports
package com.dikiytechies.foolish.client.render;

import com.dikiytechies.foolish.entity.BlackStandEntity;
import com.github.standobyte.jojo.client.render.entity.model.stand.HumanoidStandModel;
import com.github.standobyte.jojo.entity.stand.StandEntity;
import com.github.standobyte.jojo.entity.stand.stands.HierophantGreenEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.github.standobyte.jojo.action.stand.StandEntityAction;
import com.github.standobyte.jojo.client.render.entity.pose.ModelPose;
import com.github.standobyte.jojo.client.render.entity.pose.ModelPoseTransitionMultiple;
import com.github.standobyte.jojo.client.render.entity.pose.RotationAngle;
import com.github.standobyte.jojo.client.render.entity.pose.anim.PosedActionAnimation;
import com.github.standobyte.jojo.entity.stand.StandPose;

import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class BlackStandModelBlockbench extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer body;
	private final ModelRenderer upperPart;
	private final ModelRenderer torso;
	private final ModelRenderer leftArm;
	private final ModelRenderer leftArmJoint;
	private final ModelRenderer leftForeArm;
	private final ModelRenderer commandBlock;
	private final ModelRenderer rightArm;
	private final ModelRenderer rightArmJoint;
	private final ModelRenderer rightForeArm;
	private final ModelRenderer watch;
	private final ModelRenderer leftLeg;
	private final ModelRenderer leftLegJoint;
	private final ModelRenderer leftLowerLeg;
	private final ModelRenderer rightLeg;
	private final ModelRenderer rightLegJoint;
	private final ModelRenderer rightLowerLeg;

	public BlackStandModelBlockbench() {
		texWidth = 128;
		texHeight = 128;

		head = new ModelRenderer(this);
		head.setPos(0.0F, 0.0F, 0.0F);
		head.texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
		head.texOffs(32, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.3F, false);

		body = new ModelRenderer(this);
		body.setPos(0.0F, 0.0F, 0.0F);
		

		upperPart = new ModelRenderer(this);
		upperPart.setPos(0.0F, 12.0F, 0.0F);
		body.addChild(upperPart);
		

		torso = new ModelRenderer(this);
		torso.setPos(0.0F, -12.0F, 0.0F);
		upperPart.addChild(torso);
		torso.texOffs(0, 64).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.0F, false);
		torso.texOffs(24, 64).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.31F, false);

		leftArm = new ModelRenderer(this);
		leftArm.setPos(6.0F, -10.0F, 0.0F);
		upperPart.addChild(leftArm);
		leftArm.texOffs(48, 108).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.301F, false);
		leftArm.texOffs(32, 108).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);

		leftArmJoint = new ModelRenderer(this);
		leftArmJoint.setPos(0.0F, 4.0F, 0.0F);
		leftArm.addChild(leftArmJoint);
		leftArmJoint.texOffs(32, 102).addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F, -0.1F, true);

		leftForeArm = new ModelRenderer(this);
		leftForeArm.setPos(0.0F, 4.0F, 0.0F);
		leftArm.addChild(leftForeArm);
		leftForeArm.texOffs(32, 118).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
		leftForeArm.texOffs(48, 118).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.3F, false);

		commandBlock = new ModelRenderer(this);
		commandBlock.setPos(0.1F, 5.0F, 0.0F);
		leftForeArm.addChild(commandBlock);
		commandBlock.texOffs(64, 0).addBox(-8.0F, -8.0F, -8.0F, 16.0F, 16.0F, 16.0F, -7.6F, false);

		rightArm = new ModelRenderer(this);
		rightArm.setPos(-6.0F, -10.0F, 0.0F);
		upperPart.addChild(rightArm);
		rightArm.texOffs(0, 108).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
		rightArm.texOffs(16, 108).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.301F, false);

		rightArmJoint = new ModelRenderer(this);
		rightArmJoint.setPos(0.0F, 4.0F, 0.0F);
		rightArm.addChild(rightArmJoint);
		rightArmJoint.texOffs(0, 102).addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F, -0.1F, false);

		rightForeArm = new ModelRenderer(this);
		rightForeArm.setPos(0.0F, 4.0F, 0.0F);
		rightArm.addChild(rightForeArm);
		rightForeArm.texOffs(0, 118).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
		rightForeArm.texOffs(16, 118).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.3F, false);

		watch = new ModelRenderer(this);
		watch.setPos(0.0F, 5.3F, -4.4F);
		rightForeArm.addChild(watch);
		setRotationAngle(watch, -237.5461F, -290.0883F, -170.6539F);
		watch.texOffs(115, 63).addBox(-0.8091F, -0.4909F, -1.9F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		watch.texOffs(115, 65).addBox(-0.8091F, -0.4909F, 0.9F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		watch.texOffs(110, 64).addBox(-1.2091F, -0.4909F, -1.5F, 1.0F, 1.0F, 3.0F, 0.0F, false);
		watch.texOffs(119, 61).addBox(-2.0091F, -0.4909F, 0.3F, 1.0F, 1.0F, 1.0F, -0.1F, false);
		watch.texOffs(115, 61).addBox(-2.0091F, -0.4909F, -1.3F, 1.0F, 1.0F, 1.0F, -0.1F, false);
		watch.texOffs(117, 59).addBox(-2.8091F, -0.4909F, -0.5F, 1.0F, 1.0F, 1.0F, -0.1F, false);
		watch.texOffs(120, 64).addBox(1.6909F, -0.4909F, -1.5F, 1.0F, 1.0F, 3.0F, 0.0F, false);
		watch.texOffs(110, 74).addBox(-0.8091F, -0.0909F, -1.5F, 3.0F, 0.0F, 3.0F, 0.0F, false);
		watch.texOffs(110, 71).addBox(-0.8091F, -0.1909F, -1.5F, 3.0F, 0.0F, 3.0F, 0.0F, false);
		watch.texOffs(110, 68).addBox(-0.8091F, -0.2909F, -1.5F, 3.0F, 0.0F, 3.0F, 0.0F, false);
		watch.texOffs(116, 77).addBox(-0.8091F, 0.0091F, -1.5F, 3.0F, 1.0F, 3.0F, 0.0F, false);

		leftLeg = new ModelRenderer(this);
		leftLeg.setPos(1.9F, 12.0F, 0.0F);
		body.addChild(leftLeg);
		leftLeg.texOffs(96, 108).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
		leftLeg.texOffs(112, 108).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.3F, false);

		leftLegJoint = new ModelRenderer(this);
		leftLegJoint.setPos(0.0F, 6.0F, 0.0F);
		leftLeg.addChild(leftLegJoint);
		leftLegJoint.texOffs(96, 102).addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F, -0.1F, true);

		leftLowerLeg = new ModelRenderer(this);
		leftLowerLeg.setPos(0.0F, 6.0F, 0.0F);
		leftLeg.addChild(leftLowerLeg);
		leftLowerLeg.texOffs(96, 118).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, -0.001F, false);
		leftLowerLeg.texOffs(112, 118).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.3F, false);

		rightLeg = new ModelRenderer(this);
		rightLeg.setPos(-1.9F, 12.0F, 0.0F);
		body.addChild(rightLeg);
		rightLeg.texOffs(64, 108).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
		rightLeg.texOffs(80, 108).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.3F, false);

		rightLegJoint = new ModelRenderer(this);
		rightLegJoint.setPos(0.0F, 6.0F, 0.0F);
		rightLeg.addChild(rightLegJoint);
		rightLegJoint.texOffs(64, 102).addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F, -0.1F, false);

		rightLowerLeg = new ModelRenderer(this);
		rightLowerLeg.setPos(0.0F, 6.0F, 0.0F);
		rightLeg.addChild(rightLowerLeg);
		rightLowerLeg.texOffs(64, 118).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, -0.001F, false);
		rightLowerLeg.texOffs(80, 118).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.3F, false);
	}



	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}

}