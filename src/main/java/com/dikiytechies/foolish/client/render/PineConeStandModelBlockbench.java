// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports
package com.dikiytechies.foolish.client.render;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class PineConeStandModelBlockbench extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer leftEye;
	private final ModelRenderer head_r1;
	private final ModelRenderer head_r2;
	private final ModelRenderer rightEye;
	private final ModelRenderer head_r3;
	private final ModelRenderer head_r4;
	private final ModelRenderer head_r5;
	private final ModelRenderer armor;
	private final ModelRenderer line1;
	private final ModelRenderer head_r6;
	private final ModelRenderer line2;
	private final ModelRenderer head_r7;
	private final ModelRenderer line3;
	private final ModelRenderer head_r8;
	private final ModelRenderer line4;
	private final ModelRenderer head_r9;
	private final ModelRenderer line5;
	private final ModelRenderer head_r10;
	private final ModelRenderer line6;
	private final ModelRenderer head_r11;
	private final ModelRenderer line7;
	private final ModelRenderer head_r12;
	private final ModelRenderer line8;
	private final ModelRenderer head_r13;
	private final ModelRenderer line9;
	private final ModelRenderer head_r14;
	private final ModelRenderer line10;
	private final ModelRenderer head_r15;
	private final ModelRenderer line11;
	private final ModelRenderer head_r16;
	private final ModelRenderer line12;
	private final ModelRenderer head_r17;
	private final ModelRenderer line13;
	private final ModelRenderer head_r18;
	private final ModelRenderer line14;
	private final ModelRenderer head_r19;
	private final ModelRenderer line15;
	private final ModelRenderer head_r20;
	private final ModelRenderer line16;
	private final ModelRenderer head_r21;
	private final ModelRenderer line17;
	private final ModelRenderer head_r22;
	private final ModelRenderer line18;
	private final ModelRenderer head_r23;
	private final ModelRenderer line19;
	private final ModelRenderer head_r24;
	private final ModelRenderer rightEye2;
	private final ModelRenderer leftEye2;
	private final ModelRenderer head_r25;
	private final ModelRenderer body;
	private final ModelRenderer upperPart;
	private final ModelRenderer torso;
	private final ModelRenderer armor2;
	private final ModelRenderer line;
	private final ModelRenderer torso_r1;
	private final ModelRenderer torso_r2;
	private final ModelRenderer torso_r3;
	private final ModelRenderer line20;
	private final ModelRenderer torso_r4;
	private final ModelRenderer torso_r5;
	private final ModelRenderer torso_r6;
	private final ModelRenderer line21;
	private final ModelRenderer torso_r7;
	private final ModelRenderer torso_r8;
	private final ModelRenderer torso_r9;
	private final ModelRenderer line22;
	private final ModelRenderer torso_r10;
	private final ModelRenderer torso_r11;
	private final ModelRenderer torso_r12;
	private final ModelRenderer line23;
	private final ModelRenderer torso_r13;
	private final ModelRenderer torso_r14;
	private final ModelRenderer torso_r15;
	private final ModelRenderer line24;
	private final ModelRenderer torso_r16;
	private final ModelRenderer torso_r17;
	private final ModelRenderer torso_r18;
	private final ModelRenderer line25;
	private final ModelRenderer torso_r19;
	private final ModelRenderer torso_r20;
	private final ModelRenderer torso_r21;
	private final ModelRenderer line26;
	private final ModelRenderer torso_r22;
	private final ModelRenderer torso_r23;
	private final ModelRenderer torso_r24;
	private final ModelRenderer leftShoulder;
	private final ModelRenderer torso_r25;
	private final ModelRenderer rightShoulder;
	private final ModelRenderer torso_r26;
	private final ModelRenderer tail;
	private final ModelRenderer torso_r27;
	private final ModelRenderer torso_r28;
	private final ModelRenderer leftArm;
	private final ModelRenderer leftArm_r1;
	private final ModelRenderer leftArmJoint;
	private final ModelRenderer leftForeArm;
	private final ModelRenderer rightArm;
	private final ModelRenderer rightArm_r1;
	private final ModelRenderer rightArmJoint;
	private final ModelRenderer rightForeArm;
	private final ModelRenderer rightLeg;
	private final ModelRenderer rightLeg_r1;
	private final ModelRenderer rightLegJoint;
	private final ModelRenderer rightLowerLeg;
	private final ModelRenderer leftLeg;
	private final ModelRenderer leftLeg_r1;
	private final ModelRenderer leftLegJoint;
	private final ModelRenderer leftLowerLeg;

	public PineConeStandModelBlockbench() {
		texWidth = 128;
		texHeight = 128;

		head = new ModelRenderer(this);
		head.setPos(0.0F, 2.8F, -0.5F);
		head.texOffs(0, 0).addBox(-2.5F, -3.5F, -3.5F, 5.0F, 4.0F, 7.0F, -0.3F, false);
		head.texOffs(17, 2).addBox(-1.0F, -2.5F, -4.9F, 2.0F, 3.0F, 2.0F, -0.3F, false);
		head.texOffs(25, 3).addBox(-1.0F, -1.5F, -6.1F, 2.0F, 2.0F, 2.0F, -0.4F, false);

		leftEye = new ModelRenderer(this);
		leftEye.setPos(2.4F, -2.0F, -2.0F);
		head.addChild(leftEye);
		leftEye.texOffs(15, 11).addBox(-0.8F, -0.4F, -1.1F, 1.0F, 1.0F, 3.0F, -0.7F, false);

		head_r1 = new ModelRenderer(this);
		head_r1.setPos(0.0F, 0.0F, 0.0F);
		leftEye.addChild(head_r1);
		setRotationAngle(head_r1, 0.0873F, 0.0873F, 0.0F);
		head_r1.texOffs(12, 11).addBox(-0.9F, -0.9F, -1.2F, 1.0F, 1.0F, 2.0F, -0.2F, false);

		head_r2 = new ModelRenderer(this);
		head_r2.setPos(0.0F, 0.0F, 0.0F);
		leftEye.addChild(head_r2);
		setRotationAngle(head_r2, 0.0F, 0.0873F, 0.0F);
		head_r2.texOffs(7, 59).addBox(-0.9F, -0.4F, -1.2F, 1.0F, 1.0F, 1.0F, -0.2F, false);
		head_r2.texOffs(14, 15).addBox(-0.9F, 0.1F, -1.2F, 1.0F, 1.0F, 2.0F, -0.2F, false);

		rightEye = new ModelRenderer(this);
		rightEye.setPos(0.0F, 0.0F, 0.0F);
		leftEye.addChild(rightEye);
		rightEye.texOffs(0, 11).addBox(-5.0F, -0.4F, -1.1F, 1.0F, 1.0F, 3.0F, -0.7F, false);

		head_r3 = new ModelRenderer(this);
		head_r3.setPos(-4.4F, 0.1F, -0.7F);
		rightEye.addChild(head_r3);
		setRotationAngle(head_r3, 0.0F, -0.0873F, 0.0F);
		head_r3.texOffs(7, 14).addBox(-0.45F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, -0.2F, false);

		head_r4 = new ModelRenderer(this);
		head_r4.setPos(-4.4F, 0.6F, -0.2F);
		rightEye.addChild(head_r4);
		setRotationAngle(head_r4, 0.0F, -0.0873F, 0.0F);
		head_r4.texOffs(3, 15).addBox(-0.48F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, -0.2F, false);

		head_r5 = new ModelRenderer(this);
		head_r5.setPos(-4.4F, -0.4F, -0.2F);
		rightEye.addChild(head_r5);
		setRotationAngle(head_r5, 0.0873F, -0.0873F, 0.0F);
		head_r5.texOffs(5, 11).addBox(-0.47F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, -0.2F, false);

		armor = new ModelRenderer(this);
		armor.setPos(0.0F, 15.4F, 0.5F);
		head.addChild(armor);
		

		line1 = new ModelRenderer(this);
		line1.setPos(0.0F, 0.0F, 0.0F);
		armor.addChild(line1);
		

		head_r6 = new ModelRenderer(this);
		head_r6.setPos(-0.5F, -18.1565F, -1.5506F);
		line1.addChild(head_r6);
		setRotationAngle(head_r6, -0.7854F, 0.0F, 0.0F);
		head_r6.texOffs(0, 2).addBox(-0.5F, -3.5F, 2.1F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r6.texOffs(0, 0).addBox(-0.5F, -3.2F, 1.7F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r6.texOffs(0, 2).addBox(-0.5F, -2.8F, 1.3F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r6.texOffs(0, 0).addBox(-0.5F, -2.5F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r6.texOffs(0, 2).addBox(-0.5F, -2.2F, 0.8F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r6.texOffs(0, 0).addBox(-0.5F, -1.9F, 0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r6.texOffs(0, 2).addBox(-0.5F, -1.7F, 0.3F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r6.texOffs(0, 0).addBox(-0.5F, -1.4F, 0.1F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r6.texOffs(0, 2).addBox(-0.5F, -1.0F, -0.2F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r6.texOffs(0, 0).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		line2 = new ModelRenderer(this);
		line2.setPos(1.0F, 0.0F, -0.1F);
		armor.addChild(line2);
		

		head_r7 = new ModelRenderer(this);
		head_r7.setPos(-0.5F, -18.1565F, -1.5506F);
		line2.addChild(head_r7);
		setRotationAngle(head_r7, -0.7854F, 0.0F, 0.0F);
		head_r7.texOffs(0, 0).addBox(-0.5F, -3.5F, 2.1F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r7.texOffs(0, 2).addBox(-0.5F, -3.2F, 1.7F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r7.texOffs(0, 0).addBox(-0.5F, -2.8F, 1.3F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r7.texOffs(0, 2).addBox(-0.5F, -2.5F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r7.texOffs(0, 0).addBox(-0.5F, -2.2F, 0.8F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r7.texOffs(0, 2).addBox(-0.5F, -1.9F, 0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r7.texOffs(0, 0).addBox(-0.5F, -1.7F, 0.3F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r7.texOffs(0, 2).addBox(-0.5F, -1.4F, 0.1F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r7.texOffs(0, 2).addBox(-0.5F, -1.0F, -0.2F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r7.texOffs(0, 0).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		line3 = new ModelRenderer(this);
		line3.setPos(2.0F, 0.0F, -0.2F);
		armor.addChild(line3);
		

		head_r8 = new ModelRenderer(this);
		head_r8.setPos(-0.5F, -18.1565F, -1.5506F);
		line3.addChild(head_r8);
		setRotationAngle(head_r8, -0.7854F, 0.0F, 0.0F);
		head_r8.texOffs(0, 2).addBox(-0.5F, -3.5F, 2.1F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r8.texOffs(0, 0).addBox(-0.5F, -3.2F, 1.7F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r8.texOffs(0, 2).addBox(-0.5F, -2.8F, 1.3F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r8.texOffs(0, 0).addBox(-0.5F, -2.5F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r8.texOffs(0, 2).addBox(-0.5F, -2.2F, 0.8F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r8.texOffs(0, 0).addBox(-0.5F, -1.9F, 0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r8.texOffs(0, 2).addBox(-0.5F, -1.7F, 0.3F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r8.texOffs(0, 0).addBox(-0.5F, -1.4F, 0.1F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r8.texOffs(0, 2).addBox(-0.5F, -1.0F, -0.2F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r8.texOffs(0, 0).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		line4 = new ModelRenderer(this);
		line4.setPos(-1.0F, 0.0F, -0.1F);
		armor.addChild(line4);
		

		head_r9 = new ModelRenderer(this);
		head_r9.setPos(-0.5F, -18.1565F, -1.5506F);
		line4.addChild(head_r9);
		setRotationAngle(head_r9, -0.7854F, 0.0F, 0.0F);
		head_r9.texOffs(0, 2).addBox(-0.5F, -3.5F, 2.1F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r9.texOffs(0, 0).addBox(-0.5F, -3.2F, 1.7F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r9.texOffs(0, 2).addBox(-0.5F, -2.8F, 1.3F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r9.texOffs(0, 0).addBox(-0.5F, -2.5F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r9.texOffs(0, 2).addBox(-0.5F, -2.2F, 0.8F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r9.texOffs(0, 0).addBox(-0.5F, -1.9F, 0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r9.texOffs(0, 2).addBox(-0.5F, -1.7F, 0.3F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r9.texOffs(0, 0).addBox(-0.5F, -1.4F, 0.1F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r9.texOffs(0, 2).addBox(-0.5F, -1.0F, -0.2F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r9.texOffs(0, 0).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		line5 = new ModelRenderer(this);
		line5.setPos(-1.1F, -20.3111F, 0.4151F);
		armor.addChild(line5);
		setRotationAngle(line5, 0.0F, 0.0F, -0.7854F);
		

		head_r10 = new ModelRenderer(this);
		head_r10.setPos(0.0F, 0.2546F, -1.9658F);
		line5.addChild(head_r10);
		setRotationAngle(head_r10, -0.7854F, 0.0F, 0.0F);
		head_r10.texOffs(0, 2).addBox(-2.6213F, -3.0F, 2.6F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r10.texOffs(0, 0).addBox(-2.6213F, -2.7F, 2.2F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r10.texOffs(0, 2).addBox(-2.6213F, -2.3F, 1.8F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r10.texOffs(0, 0).addBox(-2.6213F, -2.0F, 1.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r10.texOffs(0, 2).addBox(-2.6213F, -1.7F, 1.3F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r10.texOffs(0, 0).addBox(-2.6213F, -1.4F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r10.texOffs(0, 2).addBox(-2.6213F, -1.2F, 0.8F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r10.texOffs(0, 0).addBox(-2.6213F, -0.9F, 0.6F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r10.texOffs(0, 2).addBox(-2.6213F, -0.5F, 0.3F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r10.texOffs(0, 0).addBox(-2.6213F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		line6 = new ModelRenderer(this);
		line6.setPos(-1.1F, -19.5111F, 0.1151F);
		armor.addChild(line6);
		setRotationAngle(line6, 0.0F, 0.0F, -1.5708F);
		

		head_r11 = new ModelRenderer(this);
		head_r11.setPos(0.0F, 0.2546F, -1.9658F);
		line6.addChild(head_r11);
		setRotationAngle(head_r11, -0.7854F, 0.0F, 0.0F);
		head_r11.texOffs(0, 2).addBox(-2.5F, -4.2071F, 1.3929F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r11.texOffs(0, 0).addBox(-2.5F, -3.9071F, 0.9929F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r11.texOffs(0, 2).addBox(-2.5F, -3.5071F, 0.5929F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r11.texOffs(0, 0).addBox(-2.5F, -3.2071F, 0.2929F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r11.texOffs(0, 2).addBox(-2.5F, -2.9071F, 0.0929F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r11.texOffs(0, 0).addBox(-2.5F, -2.6071F, -0.2071F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r11.texOffs(0, 2).addBox(-2.5F, -2.4071F, -0.4071F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r11.texOffs(0, 0).addBox(-2.5F, -2.1071F, -0.6071F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r11.texOffs(0, 2).addBox(-2.5F, -1.7071F, -0.9071F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r11.texOffs(0, 0).addBox(-2.5F, -1.2071F, -1.2071F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		line7 = new ModelRenderer(this);
		line7.setPos(-1.1F, -18.5111F, 0.2151F);
		armor.addChild(line7);
		setRotationAngle(line7, 0.0F, 0.0F, -1.5708F);
		

		head_r12 = new ModelRenderer(this);
		head_r12.setPos(0.0F, 0.2546F, -1.9658F);
		line7.addChild(head_r12);
		setRotationAngle(head_r12, -0.7854F, 0.0F, 0.0F);
		head_r12.texOffs(0, 2).addBox(-2.5F, -4.2071F, 1.3929F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r12.texOffs(0, 0).addBox(-2.5F, -3.9071F, 0.9929F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r12.texOffs(0, 2).addBox(-2.5F, -3.5071F, 0.5929F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r12.texOffs(0, 0).addBox(-2.5F, -3.2071F, 0.2929F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r12.texOffs(0, 2).addBox(-2.5F, -2.9071F, 0.0929F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r12.texOffs(0, 0).addBox(-2.5F, -2.6071F, -0.2071F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r12.texOffs(0, 2).addBox(-2.5F, -2.4071F, -0.4071F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r12.texOffs(0, 0).addBox(-2.5F, -2.1071F, -0.6071F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r12.texOffs(0, 2).addBox(-2.5F, -1.7071F, -0.9071F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r12.texOffs(0, 0).addBox(-2.5F, -1.2071F, -1.2071F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		line8 = new ModelRenderer(this);
		line8.setPos(-1.1F, -17.5111F, 0.3151F);
		armor.addChild(line8);
		setRotationAngle(line8, 0.0F, 0.0F, -1.5708F);
		

		head_r13 = new ModelRenderer(this);
		head_r13.setPos(0.0F, 0.2546F, -1.9658F);
		line8.addChild(head_r13);
		setRotationAngle(head_r13, -0.7854F, 0.0F, 0.0F);
		head_r13.texOffs(0, 2).addBox(-2.5F, -4.2071F, 1.3929F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r13.texOffs(0, 0).addBox(-2.5F, -3.9071F, 0.9929F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r13.texOffs(0, 2).addBox(-2.5F, -3.5071F, 0.5929F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r13.texOffs(0, 0).addBox(-2.5F, -3.2071F, 0.2929F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r13.texOffs(0, 2).addBox(-2.5F, -2.9071F, 0.0929F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r13.texOffs(0, 0).addBox(-2.5F, -2.6071F, -0.2071F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r13.texOffs(0, 2).addBox(-2.5F, -2.4071F, -0.4071F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r13.texOffs(0, 0).addBox(-2.5F, -2.1071F, -0.6071F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r13.texOffs(0, 2).addBox(-2.5F, -1.7071F, -0.9071F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r13.texOffs(0, 0).addBox(-2.5F, -1.2071F, -1.2071F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		line9 = new ModelRenderer(this);
		line9.setPos(3.1F, -20.3111F, 0.4151F);
		armor.addChild(line9);
		setRotationAngle(line9, 0.0F, 0.0F, 0.7854F);
		

		head_r14 = new ModelRenderer(this);
		head_r14.setPos(0.0F, 0.2546F, -1.9658F);
		line9.addChild(head_r14);
		setRotationAngle(head_r14, -0.7854F, 0.0F, 0.0F);
		head_r14.texOffs(0, 2).addBox(0.2071F, -2.0F, 3.6F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r14.texOffs(0, 0).addBox(0.2071F, -1.7F, 3.2F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r14.texOffs(0, 2).addBox(0.2071F, -1.3F, 2.8F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r14.texOffs(0, 0).addBox(0.2071F, -1.0F, 2.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r14.texOffs(0, 2).addBox(0.2071F, -0.7F, 2.3F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r14.texOffs(0, 0).addBox(0.2071F, -0.4F, 2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r14.texOffs(0, 2).addBox(0.2071F, -0.2F, 1.8F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r14.texOffs(0, 0).addBox(0.2071F, 0.1F, 1.6F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r14.texOffs(0, 2).addBox(0.2071F, 0.5F, 1.3F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r14.texOffs(0, 0).addBox(0.2071F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		line10 = new ModelRenderer(this);
		line10.setPos(3.1F, -19.5111F, 0.1151F);
		armor.addChild(line10);
		setRotationAngle(line10, 0.0F, 0.0F, 1.5708F);
		

		head_r15 = new ModelRenderer(this);
		head_r15.setPos(0.0F, 0.2546F, -1.9658F);
		line10.addChild(head_r15);
		setRotationAngle(head_r15, -0.7854F, 0.0F, 0.0F);
		head_r15.texOffs(0, 2).addBox(1.5F, -2.7929F, 2.8071F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r15.texOffs(0, 0).addBox(1.5F, -2.4929F, 2.4071F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r15.texOffs(0, 2).addBox(1.5F, -2.0929F, 2.0071F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r15.texOffs(0, 0).addBox(1.5F, -1.7929F, 1.7071F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r15.texOffs(0, 2).addBox(1.5F, -1.4929F, 1.5071F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r15.texOffs(0, 0).addBox(1.5F, -1.1929F, 1.2071F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r15.texOffs(0, 2).addBox(1.5F, -0.9929F, 1.0071F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r15.texOffs(0, 0).addBox(1.5F, -0.6929F, 0.8071F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r15.texOffs(0, 2).addBox(1.5F, -0.2929F, 0.5071F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r15.texOffs(0, 0).addBox(1.5F, 0.2071F, 0.2071F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		line11 = new ModelRenderer(this);
		line11.setPos(3.1F, -18.5111F, 0.2151F);
		armor.addChild(line11);
		setRotationAngle(line11, 0.0F, 0.0F, 1.5708F);
		

		head_r16 = new ModelRenderer(this);
		head_r16.setPos(0.0F, 0.2546F, -1.9658F);
		line11.addChild(head_r16);
		setRotationAngle(head_r16, -0.7854F, 0.0F, 0.0F);
		head_r16.texOffs(0, 2).addBox(1.5F, -2.7929F, 2.8071F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r16.texOffs(0, 0).addBox(1.5F, -2.4929F, 2.4071F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r16.texOffs(0, 2).addBox(1.5F, -2.0929F, 2.0071F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r16.texOffs(0, 0).addBox(1.5F, -1.7929F, 1.7071F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r16.texOffs(0, 2).addBox(1.5F, -1.4929F, 1.5071F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r16.texOffs(0, 0).addBox(1.5F, -1.1929F, 1.2071F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r16.texOffs(0, 2).addBox(1.5F, -0.9929F, 1.0071F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r16.texOffs(0, 0).addBox(1.5F, -0.6929F, 0.8071F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r16.texOffs(0, 2).addBox(1.5F, -0.2929F, 0.5071F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r16.texOffs(0, 0).addBox(1.5F, 0.2071F, 0.2071F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		line12 = new ModelRenderer(this);
		line12.setPos(3.1F, -17.5111F, 0.3151F);
		armor.addChild(line12);
		setRotationAngle(line12, 0.0F, 0.0F, 1.5708F);
		

		head_r17 = new ModelRenderer(this);
		head_r17.setPos(0.0F, 0.2546F, -1.9658F);
		line12.addChild(head_r17);
		setRotationAngle(head_r17, -0.7854F, 0.0F, 0.0F);
		head_r17.texOffs(0, 2).addBox(1.5F, -2.7929F, 2.8071F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r17.texOffs(0, 0).addBox(1.5F, -2.4929F, 2.4071F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r17.texOffs(0, 2).addBox(1.5F, -2.0929F, 2.0071F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r17.texOffs(0, 0).addBox(1.5F, -1.7929F, 1.7071F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r17.texOffs(0, 2).addBox(1.5F, -1.4929F, 1.5071F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r17.texOffs(0, 0).addBox(1.5F, -1.1929F, 1.2071F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r17.texOffs(0, 2).addBox(1.5F, -0.9929F, 1.0071F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r17.texOffs(0, 0).addBox(1.5F, -0.6929F, 0.8071F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r17.texOffs(0, 2).addBox(1.5F, -0.2929F, 0.5071F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r17.texOffs(0, 0).addBox(1.5F, 0.2071F, 0.2071F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		line13 = new ModelRenderer(this);
		line13.setPos(2.5F, -19.2111F, 2.6151F);
		armor.addChild(line13);
		setRotationAngle(line13, -1.5708F, 0.0F, 0.0F);
		

		head_r18 = new ModelRenderer(this);
		head_r18.setPos(0.0F, 0.2546F, -1.9658F);
		line13.addChild(head_r18);
		setRotationAngle(head_r18, -0.7854F, 0.0F, 0.0F);
		head_r18.texOffs(0, 0).addBox(-1.5F, -4.6142F, 3.1142F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r18.texOffs(0, 2).addBox(-1.5F, -4.2142F, 2.7142F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r18.texOffs(0, 0).addBox(-1.5F, -3.9142F, 2.4142F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r18.texOffs(0, 2).addBox(-1.5F, -3.6142F, 2.2142F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r18.texOffs(0, 0).addBox(-1.5F, -3.3142F, 1.9142F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r18.texOffs(0, 2).addBox(-1.5F, -3.1142F, 1.7142F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r18.texOffs(0, 0).addBox(-1.5F, -2.8142F, 1.5142F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		line14 = new ModelRenderer(this);
		line14.setPos(1.5F, -19.1111F, 2.6151F);
		armor.addChild(line14);
		setRotationAngle(line14, -1.5708F, 0.0F, 0.0F);
		

		head_r19 = new ModelRenderer(this);
		head_r19.setPos(0.0F, 0.2546F, -1.9658F);
		line14.addChild(head_r19);
		setRotationAngle(head_r19, -0.7854F, 0.0F, 0.0F);
		head_r19.texOffs(0, 0).addBox(-1.5F, -4.6142F, 3.1142F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r19.texOffs(0, 2).addBox(-1.5F, -4.2142F, 2.7142F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r19.texOffs(0, 0).addBox(-1.5F, -3.9142F, 2.4142F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r19.texOffs(0, 2).addBox(-1.5F, -3.6142F, 2.2142F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r19.texOffs(0, 0).addBox(-1.5F, -3.3142F, 1.9142F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r19.texOffs(0, 2).addBox(-1.5F, -3.1142F, 1.7142F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r19.texOffs(0, 0).addBox(-1.5F, -2.8142F, 1.5142F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		line15 = new ModelRenderer(this);
		line15.setPos(0.5F, -19.1111F, 2.6151F);
		armor.addChild(line15);
		setRotationAngle(line15, -1.5708F, 0.0F, 0.0F);
		

		head_r20 = new ModelRenderer(this);
		head_r20.setPos(0.0F, 0.2546F, -1.9658F);
		line15.addChild(head_r20);
		setRotationAngle(head_r20, -0.7854F, 0.0F, 0.0F);
		head_r20.texOffs(0, 0).addBox(-1.5F, -4.6142F, 3.1142F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r20.texOffs(0, 2).addBox(-1.5F, -4.2142F, 2.7142F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r20.texOffs(0, 0).addBox(-1.5F, -3.9142F, 2.4142F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r20.texOffs(0, 2).addBox(-1.5F, -3.6142F, 2.2142F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r20.texOffs(0, 0).addBox(-1.5F, -3.3142F, 1.9142F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r20.texOffs(0, 2).addBox(-1.5F, -3.1142F, 1.7142F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r20.texOffs(0, 0).addBox(-1.5F, -2.8142F, 1.5142F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		line16 = new ModelRenderer(this);
		line16.setPos(0.5F, -19.0111F, 2.6151F);
		armor.addChild(line16);
		setRotationAngle(line16, -1.5708F, 0.0F, 0.0F);
		

		head_r21 = new ModelRenderer(this);
		head_r21.setPos(0.0F, 0.2546F, -1.9658F);
		line16.addChild(head_r21);
		setRotationAngle(head_r21, -0.7854F, 0.0F, 0.0F);
		head_r21.texOffs(0, 0).addBox(-1.5F, -4.6142F, 3.1142F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r21.texOffs(0, 2).addBox(-1.5F, -4.2142F, 2.7142F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r21.texOffs(0, 0).addBox(-1.5F, -3.9142F, 2.4142F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r21.texOffs(0, 2).addBox(-1.5F, -3.6142F, 2.2142F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r21.texOffs(0, 0).addBox(-1.5F, -3.3142F, 1.9142F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r21.texOffs(0, 2).addBox(-1.5F, -3.1142F, 1.7142F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r21.texOffs(0, 0).addBox(-1.5F, -2.8142F, 1.5142F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		line17 = new ModelRenderer(this);
		line17.setPos(-0.5F, -19.1111F, 2.6151F);
		armor.addChild(line17);
		setRotationAngle(line17, -1.5708F, 0.0F, 0.0F);
		

		head_r22 = new ModelRenderer(this);
		head_r22.setPos(0.0F, 0.2546F, -1.9658F);
		line17.addChild(head_r22);
		setRotationAngle(head_r22, -0.7854F, 0.0F, 0.0F);
		head_r22.texOffs(0, 0).addBox(-1.5F, -4.6142F, 3.1142F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r22.texOffs(0, 2).addBox(-1.5F, -4.2142F, 2.7142F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r22.texOffs(0, 0).addBox(-1.5F, -3.9142F, 2.4142F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r22.texOffs(0, 2).addBox(-1.5F, -3.6142F, 2.2142F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r22.texOffs(0, 0).addBox(-1.5F, -3.3142F, 1.9142F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r22.texOffs(0, 2).addBox(-1.5F, -3.1142F, 1.7142F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r22.texOffs(0, 0).addBox(-1.5F, -2.8142F, 1.5142F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		line18 = new ModelRenderer(this);
		line18.setPos(-1.0F, -19.2111F, 2.4151F);
		armor.addChild(line18);
		setRotationAngle(line18, -1.5708F, -0.7854F, 0.0F);
		

		head_r23 = new ModelRenderer(this);
		head_r23.setPos(0.0F, 0.2546F, -1.9658F);
		line18.addChild(head_r23);
		setRotationAngle(head_r23, -0.7854F, 0.0F, 0.0F);
		head_r23.texOffs(0, 0).addBox(-1.2071F, -5.1142F, 2.6142F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r23.texOffs(0, 2).addBox(-1.2071F, -4.7142F, 2.2142F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r23.texOffs(0, 0).addBox(-1.2071F, -4.4142F, 1.9142F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r23.texOffs(0, 2).addBox(-1.2071F, -4.1142F, 1.7142F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r23.texOffs(0, 0).addBox(-1.2071F, -3.8142F, 1.4142F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r23.texOffs(0, 2).addBox(-1.2071F, -3.6142F, 1.2142F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r23.texOffs(0, 0).addBox(-1.2071F, -3.3142F, 1.0142F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		line19 = new ModelRenderer(this);
		line19.setPos(3.0F, -19.2111F, 2.4151F);
		armor.addChild(line19);
		setRotationAngle(line19, -1.5708F, 0.7854F, 0.0F);
		

		head_r24 = new ModelRenderer(this);
		head_r24.setPos(0.0F, 0.2546F, -1.9658F);
		line19.addChild(head_r24);
		setRotationAngle(head_r24, -0.7854F, 0.0F, 0.0F);
		head_r24.texOffs(0, 0).addBox(-1.2071F, -4.1142F, 3.6142F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r24.texOffs(0, 2).addBox(-1.2071F, -3.7142F, 3.2142F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r24.texOffs(0, 0).addBox(-1.2071F, -3.4142F, 2.9142F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r24.texOffs(0, 2).addBox(-1.2071F, -3.1142F, 2.7142F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r24.texOffs(0, 0).addBox(-1.2071F, -2.8142F, 2.4142F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r24.texOffs(0, 2).addBox(-1.2071F, -2.6142F, 2.2142F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r24.texOffs(0, 0).addBox(-1.2071F, -2.3142F, 2.0142F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		rightEye2 = new ModelRenderer(this);
		rightEye2.setPos(-2.4F, -2.0F, -2.0F);
		head.addChild(rightEye2);
		

		leftEye2 = new ModelRenderer(this);
		leftEye2.setPos(0.0F, 0.0F, 0.0F);
		rightEye2.addChild(leftEye2);
		

		head_r25 = new ModelRenderer(this);
		head_r25.setPos(4.4F, 0.1F, -0.7F);
		leftEye2.addChild(head_r25);
		setRotationAngle(head_r25, 0.0F, 0.0873F, 0.0F);
		head_r25.texOffs(12, 14).addBox(-0.55F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, -0.2F, false);

		body = new ModelRenderer(this);
		body.setPos(0.0F, 14.0F, 0.0F);
		

		upperPart = new ModelRenderer(this);
		upperPart.setPos(0.0F, 4.0F, 0.0F);
		body.addChild(upperPart);
		

		torso = new ModelRenderer(this);
		torso.setPos(0.0F, 0.0F, 0.0F);
		upperPart.addChild(torso);
		torso.texOffs(0, 18).addBox(-4.0F, -15.0F, -2.0F, 8.0F, 11.0F, 4.0F, 0.2F, false);
		torso.texOffs(24, 23).addBox(-3.0F, -14.0F, -3.0F, 6.0F, 9.0F, 1.0F, -0.1F, false);

		armor2 = new ModelRenderer(this);
		armor2.setPos(0.0F, -11.0F, 0.0F);
		torso.addChild(armor2);
		

		line = new ModelRenderer(this);
		line.setPos(0.0F, -3.5F, 0.0F);
		armor2.addChild(line);
		

		torso_r1 = new ModelRenderer(this);
		torso_r1.setPos(-1.5916F, 9.3097F, 2.8668F);
		line.addChild(torso_r1);
		setRotationAngle(torso_r1, -0.001F, 0.0003F, -0.7929F);
		torso_r1.texOffs(24, 19).addBox(-1.9F, 0.0F, -0.8F, 2.0F, 2.0F, 1.0F, -0.1F, false);

		torso_r2 = new ModelRenderer(this);
		torso_r2.setPos(-1.5916F, 9.3097F, 2.8668F);
		line.addChild(torso_r2);
		setRotationAngle(torso_r2, 0.0863F, 0.0876F, -0.793F);
		torso_r2.texOffs(24, 19).addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F, -0.1F, false);

		torso_r3 = new ModelRenderer(this);
		torso_r3.setPos(-1.0F, 2.0F, 0.0F);
		line.addChild(torso_r3);
		setRotationAngle(torso_r3, 0.1745F, 0.1745F, -0.7854F);
		torso_r3.texOffs(24, 19).addBox(-6.0F, 3.0F, 0.7F, 2.0F, 2.0F, 1.0F, -0.1F, false);
		torso_r3.texOffs(24, 19).addBox(-5.0F, 2.0F, 0.9F, 2.0F, 2.0F, 1.0F, -0.1F, false);
		torso_r3.texOffs(24, 19).addBox(-4.0F, 1.0F, 1.1F, 2.0F, 2.0F, 1.0F, -0.1F, false);
		torso_r3.texOffs(24, 19).addBox(-3.0F, 0.0F, 1.3F, 2.0F, 2.0F, 1.0F, -0.1F, false);
		torso_r3.texOffs(24, 19).addBox(-2.0F, -1.0F, 1.6F, 2.0F, 2.0F, 1.0F, -0.1F, false);
		torso_r3.texOffs(24, 19).addBox(-1.0F, -2.0F, 2.0F, 2.0F, 2.0F, 1.0F, -0.1F, false);

		line20 = new ModelRenderer(this);
		line20.setPos(1.0F, -3.5F, 0.0F);
		armor2.addChild(line20);
		

		torso_r4 = new ModelRenderer(this);
		torso_r4.setPos(-1.5916F, 9.3097F, 2.8668F);
		line20.addChild(torso_r4);
		setRotationAngle(torso_r4, -0.001F, 0.0003F, -0.7929F);
		torso_r4.texOffs(24, 19).addBox(-1.9F, 0.0F, -0.8F, 2.0F, 2.0F, 1.0F, -0.1F, false);

		torso_r5 = new ModelRenderer(this);
		torso_r5.setPos(-1.5916F, 9.3097F, 2.8668F);
		line20.addChild(torso_r5);
		setRotationAngle(torso_r5, 0.0863F, 0.0876F, -0.793F);
		torso_r5.texOffs(24, 19).addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F, -0.1F, false);

		torso_r6 = new ModelRenderer(this);
		torso_r6.setPos(-1.0F, 2.0F, 0.0F);
		line20.addChild(torso_r6);
		setRotationAngle(torso_r6, 0.1745F, 0.1745F, -0.7854F);
		torso_r6.texOffs(24, 19).addBox(-6.0F, 3.0F, 0.7F, 2.0F, 2.0F, 1.0F, -0.1F, false);
		torso_r6.texOffs(24, 19).addBox(-5.0F, 2.0F, 0.9F, 2.0F, 2.0F, 1.0F, -0.1F, false);
		torso_r6.texOffs(24, 19).addBox(-4.0F, 1.0F, 1.1F, 2.0F, 2.0F, 1.0F, -0.1F, false);
		torso_r6.texOffs(24, 19).addBox(-3.0F, 0.0F, 1.3F, 2.0F, 2.0F, 1.0F, -0.1F, false);
		torso_r6.texOffs(24, 19).addBox(-2.0F, -1.0F, 1.6F, 2.0F, 2.0F, 1.0F, -0.1F, false);
		torso_r6.texOffs(24, 19).addBox(-1.0F, -2.0F, 2.0F, 2.0F, 2.0F, 1.0F, -0.1F, false);

		line21 = new ModelRenderer(this);
		line21.setPos(2.0F, -3.5F, 0.0F);
		armor2.addChild(line21);
		

		torso_r7 = new ModelRenderer(this);
		torso_r7.setPos(-1.5916F, 9.3097F, 2.8668F);
		line21.addChild(torso_r7);
		setRotationAngle(torso_r7, -0.001F, 0.0003F, -0.7929F);
		torso_r7.texOffs(24, 19).addBox(-1.9F, 0.0F, -0.8F, 2.0F, 2.0F, 1.0F, -0.1F, false);

		torso_r8 = new ModelRenderer(this);
		torso_r8.setPos(-1.5916F, 9.3097F, 2.8668F);
		line21.addChild(torso_r8);
		setRotationAngle(torso_r8, 0.0863F, 0.0876F, -0.793F);
		torso_r8.texOffs(24, 18).addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F, -0.1F, false);

		torso_r9 = new ModelRenderer(this);
		torso_r9.setPos(-1.0F, 2.0F, 0.0F);
		line21.addChild(torso_r9);
		setRotationAngle(torso_r9, 0.1745F, 0.1745F, -0.7854F);
		torso_r9.texOffs(24, 19).addBox(-6.0F, 3.0F, 0.7F, 2.0F, 2.0F, 1.0F, -0.1F, false);
		torso_r9.texOffs(24, 19).addBox(-5.0F, 2.0F, 0.9F, 2.0F, 2.0F, 1.0F, -0.1F, false);
		torso_r9.texOffs(24, 19).addBox(-4.0F, 1.0F, 1.1F, 2.0F, 2.0F, 1.0F, -0.1F, false);
		torso_r9.texOffs(24, 19).addBox(-3.0F, 0.0F, 1.3F, 2.0F, 2.0F, 1.0F, -0.1F, false);
		torso_r9.texOffs(24, 19).addBox(-2.0F, -1.0F, 1.6F, 2.0F, 2.0F, 1.0F, -0.1F, false);
		torso_r9.texOffs(24, 19).addBox(-1.0F, -2.0F, 2.0F, 2.0F, 2.0F, 1.0F, -0.1F, false);

		line22 = new ModelRenderer(this);
		line22.setPos(3.0F, -3.5F, 0.0F);
		armor2.addChild(line22);
		

		torso_r10 = new ModelRenderer(this);
		torso_r10.setPos(-1.5916F, 9.3097F, 2.8668F);
		line22.addChild(torso_r10);
		setRotationAngle(torso_r10, -0.001F, 0.0003F, -0.7929F);
		torso_r10.texOffs(24, 19).addBox(-1.9F, 0.0F, -0.8F, 2.0F, 2.0F, 1.0F, -0.1F, false);

		torso_r11 = new ModelRenderer(this);
		torso_r11.setPos(-1.5916F, 9.3097F, 2.8668F);
		line22.addChild(torso_r11);
		setRotationAngle(torso_r11, 0.0863F, 0.0876F, -0.793F);
		torso_r11.texOffs(24, 19).addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F, -0.1F, false);

		torso_r12 = new ModelRenderer(this);
		torso_r12.setPos(-1.0F, 2.0F, 0.0F);
		line22.addChild(torso_r12);
		setRotationAngle(torso_r12, 0.1745F, 0.1745F, -0.7854F);
		torso_r12.texOffs(24, 19).addBox(-6.0F, 3.0F, 0.7F, 2.0F, 2.0F, 1.0F, -0.1F, false);
		torso_r12.texOffs(24, 19).addBox(-5.0F, 2.0F, 0.9F, 2.0F, 2.0F, 1.0F, -0.1F, false);
		torso_r12.texOffs(24, 19).addBox(-4.0F, 1.0F, 1.1F, 2.0F, 2.0F, 1.0F, -0.1F, false);
		torso_r12.texOffs(24, 19).addBox(-3.0F, 0.0F, 1.3F, 2.0F, 2.0F, 1.0F, -0.1F, false);
		torso_r12.texOffs(24, 19).addBox(-2.0F, -1.0F, 1.6F, 2.0F, 2.0F, 1.0F, -0.1F, false);
		torso_r12.texOffs(24, 19).addBox(-1.0F, -2.0F, 2.0F, 2.0F, 2.0F, 1.0F, -0.1F, false);

		line23 = new ModelRenderer(this);
		line23.setPos(4.0F, -3.5F, 0.0F);
		armor2.addChild(line23);
		

		torso_r13 = new ModelRenderer(this);
		torso_r13.setPos(-1.5916F, 9.3097F, 2.8668F);
		line23.addChild(torso_r13);
		setRotationAngle(torso_r13, -0.001F, 0.0003F, -0.7929F);
		torso_r13.texOffs(24, 19).addBox(-1.9F, 0.0F, -0.8F, 2.0F, 2.0F, 1.0F, -0.1F, false);

		torso_r14 = new ModelRenderer(this);
		torso_r14.setPos(-1.5916F, 9.3097F, 2.8668F);
		line23.addChild(torso_r14);
		setRotationAngle(torso_r14, 0.0863F, 0.0876F, -0.793F);
		torso_r14.texOffs(24, 19).addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F, -0.1F, false);

		torso_r15 = new ModelRenderer(this);
		torso_r15.setPos(-1.0F, 2.0F, 0.0F);
		line23.addChild(torso_r15);
		setRotationAngle(torso_r15, 0.1745F, 0.1745F, -0.7854F);
		torso_r15.texOffs(24, 19).addBox(-6.0F, 3.0F, 0.7F, 2.0F, 2.0F, 1.0F, -0.1F, false);
		torso_r15.texOffs(24, 19).addBox(-5.0F, 2.0F, 0.9F, 2.0F, 2.0F, 1.0F, -0.1F, false);
		torso_r15.texOffs(24, 19).addBox(-4.0F, 1.0F, 1.1F, 2.0F, 2.0F, 1.0F, -0.1F, false);
		torso_r15.texOffs(24, 19).addBox(-3.0F, 0.0F, 1.3F, 2.0F, 2.0F, 1.0F, -0.1F, false);
		torso_r15.texOffs(24, 19).addBox(-2.0F, -1.0F, 1.6F, 2.0F, 2.0F, 1.0F, -0.1F, false);
		torso_r15.texOffs(24, 19).addBox(-1.0F, -2.0F, 2.0F, 2.0F, 2.0F, 1.0F, -0.1F, false);

		line24 = new ModelRenderer(this);
		line24.setPos(5.0F, -3.5F, 0.0F);
		armor2.addChild(line24);
		

		torso_r16 = new ModelRenderer(this);
		torso_r16.setPos(-1.5916F, 9.3097F, 2.8668F);
		line24.addChild(torso_r16);
		setRotationAngle(torso_r16, -0.001F, 0.0003F, -0.7929F);
		torso_r16.texOffs(24, 19).addBox(-1.9F, 0.0F, -0.8F, 2.0F, 2.0F, 1.0F, -0.1F, false);

		torso_r17 = new ModelRenderer(this);
		torso_r17.setPos(-1.5916F, 9.3097F, 2.8668F);
		line24.addChild(torso_r17);
		setRotationAngle(torso_r17, 0.0863F, 0.0876F, -0.793F);
		torso_r17.texOffs(24, 19).addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F, -0.1F, false);

		torso_r18 = new ModelRenderer(this);
		torso_r18.setPos(-1.0F, 2.0F, 0.0F);
		line24.addChild(torso_r18);
		setRotationAngle(torso_r18, 0.1745F, 0.1745F, -0.7854F);
		torso_r18.texOffs(24, 19).addBox(-6.0F, 3.0F, 0.7F, 2.0F, 2.0F, 1.0F, -0.1F, false);
		torso_r18.texOffs(24, 19).addBox(-5.0F, 2.0F, 0.9F, 2.0F, 2.0F, 1.0F, -0.1F, false);
		torso_r18.texOffs(24, 19).addBox(-4.0F, 1.0F, 1.1F, 2.0F, 2.0F, 1.0F, -0.1F, false);
		torso_r18.texOffs(24, 19).addBox(-3.0F, 0.0F, 1.3F, 2.0F, 2.0F, 1.0F, -0.1F, false);
		torso_r18.texOffs(24, 19).addBox(-2.0F, -1.0F, 1.6F, 2.0F, 2.0F, 1.0F, -0.1F, false);
		torso_r18.texOffs(24, 19).addBox(-1.0F, -2.0F, 2.0F, 2.0F, 2.0F, 1.0F, -0.1F, false);

		line25 = new ModelRenderer(this);
		line25.setPos(-1.0F, -3.5F, 0.0F);
		armor2.addChild(line25);
		

		torso_r19 = new ModelRenderer(this);
		torso_r19.setPos(-1.5916F, 9.3097F, 2.8668F);
		line25.addChild(torso_r19);
		setRotationAngle(torso_r19, -0.001F, 0.0003F, -0.7929F);
		torso_r19.texOffs(24, 19).addBox(-1.9F, 0.0F, -0.8F, 2.0F, 2.0F, 1.0F, -0.1F, false);

		torso_r20 = new ModelRenderer(this);
		torso_r20.setPos(-1.5916F, 9.3097F, 2.8668F);
		line25.addChild(torso_r20);
		setRotationAngle(torso_r20, 0.0863F, 0.0876F, -0.793F);
		torso_r20.texOffs(24, 19).addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F, -0.1F, false);

		torso_r21 = new ModelRenderer(this);
		torso_r21.setPos(-1.0F, 2.0F, 0.0F);
		line25.addChild(torso_r21);
		setRotationAngle(torso_r21, 0.1745F, 0.1745F, -0.7854F);
		torso_r21.texOffs(24, 19).addBox(-6.0F, 3.0F, 0.7F, 2.0F, 2.0F, 1.0F, -0.1F, false);
		torso_r21.texOffs(24, 19).addBox(-5.0F, 2.0F, 0.9F, 2.0F, 2.0F, 1.0F, -0.1F, false);
		torso_r21.texOffs(24, 19).addBox(-4.0F, 1.0F, 1.1F, 2.0F, 2.0F, 1.0F, -0.1F, false);
		torso_r21.texOffs(24, 19).addBox(-3.0F, 0.0F, 1.3F, 2.0F, 2.0F, 1.0F, -0.1F, false);
		torso_r21.texOffs(24, 19).addBox(-2.0F, -1.0F, 1.6F, 2.0F, 2.0F, 1.0F, -0.1F, false);
		torso_r21.texOffs(24, 19).addBox(-1.0F, -2.0F, 2.0F, 2.0F, 2.0F, 1.0F, -0.1F, false);

		line26 = new ModelRenderer(this);
		line26.setPos(-2.0F, -3.5F, 0.0F);
		armor2.addChild(line26);
		

		torso_r22 = new ModelRenderer(this);
		torso_r22.setPos(-1.5916F, 9.3097F, 2.8668F);
		line26.addChild(torso_r22);
		setRotationAngle(torso_r22, -0.001F, 0.0003F, -0.7929F);
		torso_r22.texOffs(24, 19).addBox(-1.9F, 0.0F, -0.8F, 2.0F, 2.0F, 1.0F, -0.1F, false);

		torso_r23 = new ModelRenderer(this);
		torso_r23.setPos(-1.5916F, 9.3097F, 2.8668F);
		line26.addChild(torso_r23);
		setRotationAngle(torso_r23, 0.0863F, 0.0876F, -0.793F);
		torso_r23.texOffs(24, 19).addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F, -0.1F, false);

		torso_r24 = new ModelRenderer(this);
		torso_r24.setPos(-1.0F, 2.0F, 0.0F);
		line26.addChild(torso_r24);
		setRotationAngle(torso_r24, 0.1745F, 0.1745F, -0.7854F);
		torso_r24.texOffs(24, 19).addBox(-6.0F, 3.0F, 0.7F, 2.0F, 2.0F, 1.0F, -0.1F, false);
		torso_r24.texOffs(24, 19).addBox(-5.0F, 2.0F, 0.9F, 2.0F, 2.0F, 1.0F, -0.1F, false);
		torso_r24.texOffs(24, 19).addBox(-4.0F, 1.0F, 1.1F, 2.0F, 2.0F, 1.0F, -0.1F, false);
		torso_r24.texOffs(24, 19).addBox(-3.0F, 0.0F, 1.3F, 2.0F, 2.0F, 1.0F, -0.1F, false);
		torso_r24.texOffs(24, 19).addBox(-2.0F, -1.0F, 1.6F, 2.0F, 2.0F, 1.0F, -0.1F, false);
		torso_r24.texOffs(24, 19).addBox(-1.0F, -2.0F, 2.0F, 2.0F, 2.0F, 1.0F, -0.1F, false);

		leftShoulder = new ModelRenderer(this);
		leftShoulder.setPos(0.0F, 0.0F, 0.0F);
		torso.addChild(leftShoulder);
		

		torso_r25 = new ModelRenderer(this);
		torso_r25.setPos(5.7F, -14.7F, 0.0F);
		leftShoulder.addChild(torso_r25);
		setRotationAngle(torso_r25, 0.0F, 0.0F, -0.0873F);
		torso_r25.texOffs(38, 23).addBox(-2.5F, -0.7F, -2.0F, 4.0F, 1.0F, 4.0F, 0.0F, false);

		rightShoulder = new ModelRenderer(this);
		rightShoulder.setPos(0.0F, 0.0F, 0.0F);
		torso.addChild(rightShoulder);
		

		torso_r26 = new ModelRenderer(this);
		torso_r26.setPos(-5.305F, -15.3412F, 0.0F);
		rightShoulder.addChild(torso_r26);
		setRotationAngle(torso_r26, 0.0F, 0.0F, 0.0873F);
		torso_r26.texOffs(38, 28).addBox(-1.495F, -0.0588F, -2.0F, 4.0F, 1.0F, 4.0F, 0.0F, false);

		tail = new ModelRenderer(this);
		tail.setPos(0.0F, -4.2153F, 2.2155F);
		torso.addChild(tail);
		setRotationAngle(tail, 0.6109F, 0.0F, 0.0F);
		tail.texOffs(54, 23).addBox(-1.0F, -0.8054F, -1.2422F, 2.0F, 4.0F, 2.0F, -0.3F, false);

		torso_r27 = new ModelRenderer(this);
		torso_r27.setPos(0.0F, 6.1946F, -0.2422F);
		tail.addChild(torso_r27);
		setRotationAngle(torso_r27, 0.1745F, 0.0F, 0.0F);
		torso_r27.texOffs(62, 29).addBox(-1.0F, -1.2F, -0.7F, 2.0F, 4.0F, 2.0F, -0.8F, false);

		torso_r28 = new ModelRenderer(this);
		torso_r28.setPos(0.0F, 3.1946F, -0.2422F);
		tail.addChild(torso_r28);
		setRotationAngle(torso_r28, 0.0873F, 0.0F, 0.0F);
		torso_r28.texOffs(62, 23).addBox(-1.0F, -0.8F, -1.0F, 2.0F, 4.0F, 2.0F, -0.5F, false);

		leftArm = new ModelRenderer(this);
		leftArm.setPos(4.0F, -13.0F, 0.0F);
		upperPart.addChild(leftArm);
		leftArm.texOffs(38, 0).addBox(0.0F, -1.0F, -2.0F, 3.0F, 5.0F, 4.0F, 0.0F, false);

		leftArm_r1 = new ModelRenderer(this);
		leftArm_r1.setPos(1.4F, 4.0F, 2.1F);
		leftArm.addChild(leftArm_r1);
		setRotationAngle(leftArm_r1, 0.0F, 0.0F, -0.7854F);
		leftArm_r1.texOffs(39, 9).addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F, -0.35F, false);

		leftArmJoint = new ModelRenderer(this);
		leftArmJoint.setPos(-4.0F, 12.5F, 0.0F);
		leftArm.addChild(leftArmJoint);
		leftArmJoint.texOffs(32, 9).addBox(4.5F, -10.0F, -1.5F, 2.0F, 3.0F, 3.0F, 0.0F, false);

		leftForeArm = new ModelRenderer(this);
		leftForeArm.setPos(1.0F, 4.0F, 0.0F);
		leftArm.addChild(leftForeArm);
		leftForeArm.texOffs(38, 14).addBox(-1.0F, 0.0F, -2.0F, 3.0F, 5.0F, 4.0F, 0.0F, false);

		rightArm = new ModelRenderer(this);
		rightArm.setPos(-4.0F, -13.0F, 0.0F);
		upperPart.addChild(rightArm);
		rightArm.texOffs(54, 0).addBox(-3.0F, -1.0F, -2.0F, 3.0F, 5.0F, 4.0F, 0.0F, false);

		rightArm_r1 = new ModelRenderer(this);
		rightArm_r1.setPos(-1.7F, 4.0F, 2.1F);
		rightArm.addChild(rightArm_r1);
		setRotationAngle(rightArm_r1, 0.0F, 0.0F, -0.7854F);
		rightArm_r1.texOffs(55, 9).addBox(-0.9F, -0.9F, -0.5F, 2.0F, 2.0F, 1.0F, -0.35F, false);

		rightArmJoint = new ModelRenderer(this);
		rightArmJoint.setPos(-7.0F, 12.5F, 0.0F);
		rightArm.addChild(rightArmJoint);
		rightArmJoint.texOffs(48, 9).addBox(4.5F, -10.0F, -1.5F, 2.0F, 3.0F, 3.0F, 0.0F, false);

		rightForeArm = new ModelRenderer(this);
		rightForeArm.setPos(-2.0F, 4.0F, 0.0F);
		rightArm.addChild(rightForeArm);
		rightForeArm.texOffs(54, 14).addBox(-1.0F, 0.0F, -2.0F, 3.0F, 5.0F, 4.0F, 0.0F, false);

		rightLeg = new ModelRenderer(this);
		rightLeg.setPos(-2.0F, 1.0F, 0.0F);
		body.addChild(rightLeg);
		rightLeg.texOffs(0, 33).addBox(-2.0F, -1.0F, -2.0F, 4.0F, 5.0F, 4.0F, 0.0F, false);

		rightLeg_r1 = new ModelRenderer(this);
		rightLeg_r1.setPos(1.0F, 5.0F, 0.0F);
		rightLeg.addChild(rightLeg_r1);
		setRotationAngle(rightLeg_r1, 0.0F, 0.0F, 0.7854F);
		rightLeg_r1.texOffs(12, 49).addBox(-2.4F, -1.0F, -2.6F, 2.0F, 2.0F, 1.0F, -0.35F, false);

		rightLegJoint = new ModelRenderer(this);
		rightLegJoint.setPos(2.0F, 3.0F, 0.0F);
		rightLeg.addChild(rightLegJoint);
		rightLegJoint.texOffs(0, 42).addBox(-3.5F, -1.0F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, false);

		rightLowerLeg = new ModelRenderer(this);
		rightLowerLeg.setPos(0.0F, 4.0F, 0.0F);
		rightLeg.addChild(rightLowerLeg);
		rightLowerLeg.texOffs(0, 48).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 5.0F, 4.0F, 0.0F, false);

		leftLeg = new ModelRenderer(this);
		leftLeg.setPos(2.0F, 1.0F, 0.0F);
		body.addChild(leftLeg);
		leftLeg.texOffs(16, 33).addBox(-2.0F, -1.0F, -2.0F, 4.0F, 5.0F, 4.0F, 0.0F, false);

		leftLeg_r1 = new ModelRenderer(this);
		leftLeg_r1.setPos(0.0F, 4.0F, -2.1F);
		leftLeg.addChild(leftLeg_r1);
		setRotationAngle(leftLeg_r1, 0.0F, 0.0F, 0.7854F);
		leftLeg_r1.texOffs(28, 49).addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F, -0.35F, false);

		leftLegJoint = new ModelRenderer(this);
		leftLegJoint.setPos(-2.0F, 3.0F, 0.0F);
		leftLeg.addChild(leftLegJoint);
		leftLegJoint.texOffs(16, 42).addBox(0.5F, -1.0F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, false);

		leftLowerLeg = new ModelRenderer(this);
		leftLowerLeg.setPos(0.0F, 4.0F, 0.0F);
		leftLeg.addChild(leftLowerLeg);
		leftLowerLeg.texOffs(16, 48).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 5.0F, 4.0F, 0.0F, false);
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