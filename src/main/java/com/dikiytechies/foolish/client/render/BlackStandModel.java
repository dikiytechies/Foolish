package com.dikiytechies.foolish.client.render;

import com.dikiytechies.foolish.action.BitesTheDust;
import com.dikiytechies.foolish.action.Jumpscare;
import com.dikiytechies.foolish.entity.BlackStandEntity;
import com.github.standobyte.jojo.action.stand.StandEntityAction;
import com.github.standobyte.jojo.client.render.entity.model.stand.HumanoidStandModel;
import com.github.standobyte.jojo.client.render.entity.model.stand.bb.BlockbenchStandModelHelper;
import com.github.standobyte.jojo.client.render.entity.pose.*;
import com.github.standobyte.jojo.client.render.entity.pose.anim.PosedActionAnimation;
import com.github.standobyte.jojo.entity.stand.StandPose;

import net.minecraft.client.renderer.model.ModelRenderer;

import com.dikiytechies.foolish.action.FireballRain;

// Made with Blockbench 4.8.1
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class BlackStandModel extends HumanoidStandModel<BlackStandEntity> {
    private ModelRenderer watch;
    private ModelRenderer commandBlock;

	public BlackStandModel() {
		super();
		
		BlockbenchStandModelHelper.fillFromBlockbenchExport(new BlackStandModelBlockbench(), this);
	}

    @Override
    protected RotationAngle[][] initSummonPoseRotations() {
        return new RotationAngle[][] {
                new RotationAngle[] {
                        RotationAngle.fromDegrees(head, 0.0f, 145f, 0.0f),
                        RotationAngle.fromDegrees(body, 0.0f, 157f, 0.0f),
                        RotationAngle.fromDegrees(torso, 0.0f, 0.0f, 0.0f),
                        RotationAngle.fromDegrees(leftArm, -362.319f, 0.8276f, -363.3206f),
                        RotationAngle.fromDegrees(leftForeArm, -4.1296f, 4.9238f, 0.0374f),
                        RotationAngle.fromDegrees(rightArm, -6.4793f, -13.5406f, 7.9902f),
                        RotationAngle.fromDegrees(rightForeArm, 0.0f, 0.0f, 0.0f),
                        RotationAngle.fromDegrees(leftLeg, 0.4713f, -6.9884f, 0.5485f),
                        RotationAngle.fromDegrees(leftLowerLeg, 0.0f, 0.0f, 0.0f),
                        RotationAngle.fromDegrees(rightLeg, -9.4741f, 6.1978f, 1.6974f),
                        RotationAngle.fromDegrees(rightLowerLeg, 10f, 0.0f, 0.0f)
                },
                new RotationAngle[] {
                        RotationAngle.fromDegrees(head, 2.5f, 10f, 0.0f),
                        RotationAngle.fromDegrees(body, 0.0f, -7.5f, 0.0f),
                        RotationAngle.fromDegrees(leftArm, -369.792f, 1.8145f, -370.2542f),
                        RotationAngle.fromDegrees(leftForeArm, -8.9152f, 4.8812f, 2.5462f),
                        RotationAngle.fromDegrees(rightArm, -66.8616f, -15.8582f, 38.2406f),
                        RotationAngle.fromDegrees(rightForeArm, -60.0f, 0.0f, 0.0f),
                        RotationAngle.fromDegrees(leftLeg, 6.0816f, -6.9206f, -4.4881f),
                        RotationAngle.fromDegrees(leftLowerLeg, -2.5f, 0.0f, 0.0f),
                        RotationAngle.fromDegrees(rightLeg, -1.4161f, 6.5638f, 6.7151f),
                        RotationAngle.fromDegrees(rightLowerLeg, 5.0f, 0.0f, 0.0f)
                }
        };
    }


    
    @Override
    protected void initActionPoses() {
        ModelPose<BlackStandEntity> shoot1 = new ModelPose<>(new RotationAngle[]{
                RotationAngle.fromDegrees(body, 0.0f, 20.0f, 0.0f),
                RotationAngle.fromDegrees(leftArm, -42.9152f, 14.6704f, -16.3127f),
                RotationAngle.fromDegrees(leftForeArm, -25.0f, 0.0f, 0.0),
                RotationAngle.fromDegrees(rightArm, -57.1426f, -33.3577f, 18.2031f),
                RotationAngle.fromDegrees(rightForeArm, -9.9093f, -3.917f, -6.4207f),
                RotationAngle.fromDegrees(leftLeg, -6.2196f, -16.5425f, -1.9606f),
                RotationAngle.fromDegrees(leftLowerLeg, 10.0f, -7.5f, 0.0f),
                RotationAngle.fromDegrees(rightLeg, -2.3179f, -10.1954f, -2.0747f),
                RotationAngle.fromDegrees(rightLowerLeg, 12.5f, 7.5f, 0.0f)
        });
        ModelPose<BlackStandEntity> shoot2 = new ModelPose<>(new RotationAngle[]{
                RotationAngle.fromDegrees(head, 2.5072f, 4.9976f, 0.1094f),
                RotationAngle.fromDegrees(leftArm, -46.0255f, 20.0248f, -17.9913f),
                RotationAngle.fromDegrees(rightArm, -60.2277f, -36.7733f, 19.316f)
        });
        ModelPose<BlackStandEntity> shoot3 = new ModelPose<>(new RotationAngle[]{
                RotationAngle.fromDegrees(leftArm, -58.0427f, -9.3837f, -10.6598f),
                RotationAngle.fromDegrees(rightArm, -63.8786f, -12.8465f, 15.4013f)
        });

        ModelPose<BlackStandEntity> fire1 = new ModelPose<>(new RotationAngle[]{
                RotationAngle.fromDegrees(head, 1.1389f, -55.2334f, 14.461f),
                RotationAngle.fromDegrees(body, 0.0f, -30.0f, 0.0f),
                RotationAngle.fromDegrees(upperPart, 12.1248f, -31.1736f, 5.6467f),
                RotationAngle.fromDegrees(leftArm, 1.6304f, 6.8638f, -18.3054f),
                RotationAngle.fromDegrees(leftForeArm, -17.5518f, -0.4736f, 6.7387f),
                RotationAngle.fromDegrees(rightArm, -55.4163f, -35.4783f, 21.9075f),
                RotationAngle.fromDegrees(rightForeArm, -12.5115f, -2.4407f, 0.5414f),
                RotationAngle.fromDegrees(leftLeg, -6.2196f, -16.5425f, -1.9606f),
                RotationAngle.fromDegrees(leftLowerLeg, 10.0f, -7.5f, 0.0f),
                RotationAngle.fromDegrees(rightLeg, -13.6998f, 8.6871f, 4.4628f),
                RotationAngle.fromDegrees(rightLowerLeg, 12.5f, 7.5f, 0.0f)
        });
        ModelPose<BlackStandEntity> fire2 = new ModelPose<>(new RotationAngle[]{
                RotationAngle.fromDegrees(head, 16.9858f, -39.9359f, -2.536f),
                RotationAngle.fromDegrees(body, 0.0f, -30.0f, 0.0f),
                RotationAngle.fromDegrees(upperPart, 13.332f, -34.2275f, 7.9378f),
                RotationAngle.fromDegrees(rightArm, -69.0931f, -41.8114f, 35.7395f),
                RotationAngle.fromDegrees(rightForeArm, -17.5157f, -2.3842f, 0.7522f),
        });
        ModelPose<BlackStandEntity> fire3 = new ModelPose<>(new RotationAngle[]{
                RotationAngle.fromDegrees(head, 6.4013f, -16.1752f, 1.2352f),
                RotationAngle.fromDegrees(body, 0.0f, -30.0f, 0.0f),
                RotationAngle.fromDegrees(upperPart, 13.332f, -34.2275f, 7.9378f),
                RotationAngle.fromDegrees(leftArm, 1.63f, 6.86f, -18.31f),
                RotationAngle.fromDegrees(rightArm, -69.09f, -41.81f, 35.74f),
                RotationAngle.fromDegrees(rightForeArm, -17.5627f, -4.768f, 1.507f)
        });
        ModelPose<BlackStandEntity> fire4 = new ModelPose<>(new RotationAngle[]{
                RotationAngle.fromDegrees(head, 6.4013f, -16.1752f, 1.2352f),
                RotationAngle.fromDegrees(body, 0.0f, -30.0f, 0.0f),
                RotationAngle.fromDegrees(upperPart, 4.941f, -14.2571f, -0.5414f),
                RotationAngle.fromDegrees(leftArm, 1.63f, 6.86f, -18.31f),
                RotationAngle.fromDegrees(rightArm, -34.1638f, 13.5678f, 98.2025f),
                RotationAngle.fromDegrees(rightForeArm, 0.0f, 0.0f, 0.0f)
        });
        ModelPose<BlackStandEntity> watch1 = new ModelPose<>(new RotationAngle[]{
                RotationAngle.fromDegrees(head, -0.0024f, -2.4976f, -0.1089f),
                RotationAngle.fromDegrees(body, 0.0f, -7.5f, 0.0f),
                RotationAngle.fromDegrees(torso, 0.0f, 0.0f, 0.0f),
                RotationAngle.fromDegrees(leftArm, -4.7552f, 9.4005f, -8.1576f),
                RotationAngle.fromDegrees(leftForeArm, -6.4152f, 4.8812f, 2.5462f),
                RotationAngle.fromDegrees(rightArm, -34.5945f, -10.0591f, 24.5428f),
                RotationAngle.fromDegrees(rightForeArm, -15.0374f, -4.9238f, 0.8704f),
                RotationAngle.fromDegrees(leftLeg, 1.0373f, 0.5376f, -3.6957f),
                RotationAngle.fromDegrees(leftLowerLeg, 0.0f, 0.0f, 2.5f),
                RotationAngle.fromDegrees(rightLeg, 0.7953f, 6.6048f, 4.1989f),
                RotationAngle.fromDegrees(rightLowerLeg, 2.4976f, 0.109f, -2.4976f)
        });
        ModelPose<BlackStandEntity> watch2 = new ModelPose<>(new RotationAngle[]{
                RotationAngle.fromDegrees(head, 4.02f, 1.47f, 0.41f),
                RotationAngle.fromDegrees(body, 0.0f, -7.5f, 0.0f),
                RotationAngle.fromDegrees(torso, 0.0f, 0.0f, 0.0f),
                RotationAngle.fromDegrees(leftArm, -4.76f, 9.4f, -8.16f),
                RotationAngle.fromDegrees(leftForeArm, -6.4152f, 4.8812f, 2.5462f),
                RotationAngle.fromDegrees(rightArm, -27.9726f, 9.9639f, 19.7166f),
                RotationAngle.fromDegrees(rightForeArm, -0.0374f, -4.9238f, 0.8704f),
                RotationAngle.fromDegrees(leftLeg, 1.0373f, 0.5376f, -3.6957f),
                RotationAngle.fromDegrees(leftLowerLeg, 0.0f, 0.0f, 2.5f),
                RotationAngle.fromDegrees(rightLeg, 0.7953f, 6.6048f, 4.1989f),
                RotationAngle.fromDegrees(rightLowerLeg, 2.4976f, 0.109f, -2.4976f)
        });//
        ModelPose<BlackStandEntity> watch3 = new ModelPose<>(new RotationAngle[]{
                RotationAngle.fromDegrees(head, 8.04f, 5.43f, 0.94f),
                RotationAngle.fromDegrees(body, 0.0f, -7.5f, 0.0f),
                RotationAngle.fromDegrees(torso, 0.0f, 7.5f, 0.0f),
                RotationAngle.fromDegrees(leftArm, -4.848f, 14.3825f, -8.5877f),
                RotationAngle.fromDegrees(leftForeArm, -6.4152f, 4.8812f, 2.5462f),
                RotationAngle.fromDegrees(rightArm, -66.8616f, -15.8582f, 38.2406f),
                RotationAngle.fromDegrees(rightForeArm, -60.0f, 0.0f, 0.0f),
                RotationAngle.fromDegrees(leftLeg, 1.0373f, 0.5376f, -3.6957f),
                RotationAngle.fromDegrees(leftLowerLeg, 0.0f, 0.0f, 2.5f),
                RotationAngle.fromDegrees(rightLeg, 0.7953f, 6.6048f, 4.1989f),
                RotationAngle.fromDegrees(rightLowerLeg, 2.4976f, 0.109f, -2.4976f)
        });
        ModelPose<BlackStandEntity> watch4 = new ModelPose<>(new RotationAngle[]{
                RotationAngle.fromDegrees(head, 10.054f, 7.4167f, 1.2004f),
                RotationAngle.fromDegrees(body, 0.0f, -7.5f, 0.0f),
                RotationAngle.fromDegrees(torso, 0.0f, 0.0f, 0.0f),
                RotationAngle.fromDegrees(leftArm, 1.63f, 6.86f, -18.31f),
                RotationAngle.fromDegrees(leftForeArm, -6.4152f, 4.8812f, 2.5462f),
                RotationAngle.fromDegrees(rightArm, -66.86f, -15.86f, 38.24f),
                RotationAngle.fromDegrees(rightForeArm, -60.0f, 0.0f, 0.0f),
                RotationAngle.fromDegrees(leftLeg, 1.0373f, 0.5376f, -3.6957f),
                RotationAngle.fromDegrees(leftLowerLeg, 0.0f, 0.0f, 2.5f),
                RotationAngle.fromDegrees(rightLeg, 0.7953f, 6.6048f, 4.1989f),
                RotationAngle.fromDegrees(rightLowerLeg, 2.4976f, 0.109f, -2.4976f)
        });
        ModelPose<BlackStandEntity> watch5 = new ModelPose<>(new RotationAngle[]{
                RotationAngle.fromDegrees(head, 6.7f, 4.1f, 0.98f),
                RotationAngle.fromDegrees(body, 0.0f, -7.5f, 0.0f),
                RotationAngle.fromDegrees(torso, 0.0f, 10.0f, 0.0f),
                RotationAngle.fromDegrees(leftArm, -4.9088f, 16.8718f, -8.81f),
                RotationAngle.fromDegrees(leftForeArm, -6.4152f, 4.8812f, 2.5462f),
                RotationAngle.fromDegrees(rightArm, -48.032f, -14.5466f, 36.0355f),
                RotationAngle.fromDegrees(rightForeArm, -87.25f, 0.0f, 0.0f),
                RotationAngle.fromDegrees(leftLeg, 1.0373f, 0.5376f, -3.6957f),
                RotationAngle.fromDegrees(leftLowerLeg, 0.0f, 0.0f, 2.5f),
                RotationAngle.fromDegrees(rightLeg, 0.7953f, 6.6048f, 4.1989f),
                RotationAngle.fromDegrees(rightLowerLeg, 2.4976f, 0.109f, -2.4976f)
        });
        ModelPose<BlackStandEntity> watch6 = new ModelPose<>(new RotationAngle[]{
                RotationAngle.fromDegrees(head, 3.36f, 0.77f, 0.76f),
                RotationAngle.fromDegrees(body, 0.0f, -7.5f, 0.0f),
                RotationAngle.fromDegrees(torso, 0.0f, 6.25f, 0.0f),
                RotationAngle.fromDegrees(leftArm, -4.85f, 14.13f, -8.57f),
                RotationAngle.fromDegrees(leftForeArm, -6.4152f, 4.8812f, 2.5462f),
                RotationAngle.fromDegrees(rightArm, -66.8616f, -15.8582f, 38.2406f),
                RotationAngle.fromDegrees(rightForeArm, -60.0f, 0.0f, 0.0f),
                RotationAngle.fromDegrees(leftLeg, 1.0373f, 0.5376f, -3.6957f),
                RotationAngle.fromDegrees(leftLowerLeg, 0.0f, 0.0f, 2.5f),
                RotationAngle.fromDegrees(rightLeg, 0.7953f, 6.6048f, 4.1989f),
                RotationAngle.fromDegrees(rightLowerLeg, 2.4976f, 0.109f, -2.4976f)
        });
        ModelPose<BlackStandEntity> watch7 = new ModelPose<>(new RotationAngle[]{
                RotationAngle.fromDegrees(head, 0.0116f, -2.5545f, 0.541f),
                RotationAngle.fromDegrees(body, 0.0f, -7.5f, 0.0f),
                RotationAngle.fromDegrees(torso, 0.0f, 2.5f, 0.0f),
                RotationAngle.fromDegrees(leftArm, -4.7904f, 11.3931f, -8.3292f),
                RotationAngle.fromDegrees(leftForeArm, -6.4152f, 4.8812f, 2.5462f),
                RotationAngle.fromDegrees(rightArm, -12.826f, -2.6254f, 12.7681f),
                RotationAngle.fromDegrees(rightForeArm, -22.5f, 0.0f, 0.0f),
                RotationAngle.fromDegrees(leftLeg, 1.0373f, 0.5376f, -3.6957f),
                RotationAngle.fromDegrees(leftLowerLeg, 0.0f, 0.0f, 2.5f),
                RotationAngle.fromDegrees(rightLeg, 0.7953f, 6.6048f, 4.1989f),
                RotationAngle.fromDegrees(rightLowerLeg, 2.4976f, 0.109f, -2.4976f)
        });

        actionAnim.put(BitesTheDust.WATCH, new PosedActionAnimation.Builder<BlackStandEntity>()
                .addPose(StandEntityAction.Phase.BUTTON_HOLD, new ModelPoseTransitionMultiple.Builder<>(watch1)
                        .addPose(0.025f, watch1)
                        .addPose(0.05f, watch2)
                        .addPose(0.075f, watch3)
                        .addPose(0.1f, watch4)
                        .addPose(0.725f, watch4)
                        .addPose(0.75f, watch5)
                        .addPose(0.775f, watch6)
                        .addPose(0.8f, watch7)
                        .build(watch7))
                .addPose(StandEntityAction.Phase.RECOVERY, new ModelPoseTransitionMultiple.Builder<>(watch7)
                        .addPose(0.2F, idlePose)
                        .build(idlePose))
                .build(idlePose));

        super.initActionPoses();


        actionAnim.put(StandPose.RANGED_ATTACK, new PosedActionAnimation.Builder<BlackStandEntity>()
                .addPose(StandEntityAction.Phase.WINDUP, new ModelPoseTransition<>(idlePose, shoot1))
                .addPose(StandEntityAction.Phase.PERFORM, new ModelPoseTransition<>(shoot1, shoot2))
                .addPose(StandEntityAction.Phase.RECOVERY, new ModelPoseTransitionMultiple.Builder<>(shoot3)
                        .addPose(0.5F, shoot3)
                        .build(idlePose))
                .build(idlePose));

        actionAnim.put(FireballRain.FIRE_COMMAND_POSE, new PosedActionAnimation.Builder<BlackStandEntity>()
                .addPose(StandEntityAction.Phase.PERFORM, new ModelPoseTransitionMultiple.Builder<>(fire1)
                    .addPose(0.002f, fire2)
                    .addPose(0.004f, fire3)
                    .addPose(0.006f, fire4)
                .build(fire4))
                .addPose(StandEntityAction.Phase.RECOVERY, new ModelPoseTransitionMultiple.Builder<>(fire4)
                        .addPose(0.004F, fire4)
                        .build(idlePose))
                .build(idlePose));

        ModelPose<BlackStandEntity> jumpscare1 = new ModelPose<>(new RotationAngle[]{
                RotationAngle.fromDegrees(head, -5.0f, -14.9416f, 0.0f),
                RotationAngle.fromDegrees(body, 0.0f, 20.0f, 0.0f),
                RotationAngle.fromDegrees(upperPart, -5.0f, 0.0f, 0.0f),
                RotationAngle.fromDegrees(leftArm, 19.8921f, -1.9329f, -5.2668f),
                RotationAngle.fromDegrees(leftForeArm, -27.5f, 0.0f, 0.0f),
                RotationAngle.fromDegrees(rightArm, 0.5484f, -4.2042f, 2.9668f),
                RotationAngle.fromDegrees(rightForeArm, -14.9093f, -3.917f, -6.4207f)
        });
        ModelPose<BlackStandEntity> jumpscare2 = new ModelPose<>(new RotationAngle[]{
                RotationAngle.fromDegrees(head, -20.07f, -4.37f, -0.68f),
                RotationAngle.fromDegrees(body, 0.0f, 20.0f, 0.0f),
                RotationAngle.fromDegrees(upperPart, 9.76f, -5.58f, 0.17f),
                RotationAngle.fromDegrees(leftArm, -59.9649f, 7.3881f, -11.434f),
                RotationAngle.fromDegrees(leftForeArm, -40.0f, 0.0f, 0.0f),
                RotationAngle.fromDegrees(rightArm, -69.4329f, -12.9763f, 5.0309f),
                RotationAngle.fromDegrees(rightForeArm, -19.9093f, -3.917f, -6.4207f)
        });
        ModelPose<BlackStandEntity> jumpscare3 = new ModelPose<>(new RotationAngle[]{
                RotationAngle.fromDegrees(head, -15.1497f, -3.7469f, -1.3669f),
                RotationAngle.fromDegrees(body, 0.0f, 20.0f, 0.0f),
                RotationAngle.fromDegrees(upperPart, 24.5287f, -11.1637f, 0.3435f),
                RotationAngle.fromDegrees(leftArm, -52.4671f, -45.9614f, -31.5387f),
                RotationAngle.fromDegrees(leftForeArm, -47.5f, 0.0f, 0.0f),
                RotationAngle.fromDegrees(rightArm, -65.7079f, 33.6808f, 23.8996f),
                RotationAngle.fromDegrees(rightForeArm, -34.9093f, -3.917f, -6.4207f)
        });
        ModelPose<BlackStandEntity> jumpscare4 = new ModelPose<>(new RotationAngle[]{
                RotationAngle.fromDegrees(head, -16.21f, -5.36f, 10.8f),
                RotationAngle.fromDegrees(body, 0.0f, 20.0f, 0.0f),
                RotationAngle.fromDegrees(upperPart, 26.0166f, -13.4127f, -0.7739f),
                RotationAngle.fromDegrees(leftArm, -44.63f, -50.99f, -41.14f),
                RotationAngle.fromDegrees(leftForeArm, -42.13f, 0.0f, 0.0f),
                RotationAngle.fromDegrees(rightArm, -60.67f, 41.58f, 30.77f),
                RotationAngle.fromDegrees(rightForeArm, -31.58f, -3.92f, -6.42)
        });
        ModelPose<BlackStandEntity> jumpscare5 = new ModelPose<>(new RotationAngle[]{
                RotationAngle.fromDegrees(head, -17.7389f, -6.9153f, 16.8783f),
                RotationAngle.fromDegrees(body, 0.0f, 20.0f, 0.0f),
                RotationAngle.fromDegrees(upperPart, 26.4f, -10.96f, 0.49f),
                RotationAngle.fromDegrees(leftArm, -40.71f, 53.51f, -45.94f),
                RotationAngle.fromDegrees(leftForeArm, -38.78f, 0.0f, 0.0f),
                RotationAngle.fromDegrees(rightArm, -58.15f, 45.53f, 34.21f),
                RotationAngle.fromDegrees(rightForeArm, -28.98f, -3.92f, -6.42f)
        });
        ModelPose<BlackStandEntity> jumpscare6 = new ModelPose<>(new RotationAngle[]{
                RotationAngle.fromDegrees(head, -20.07f, -4.37f, -0.68f),
                RotationAngle.fromDegrees(body, 0.0f, 20.0f, 0.0f),
                RotationAngle.fromDegrees(upperPart, 9.76f, -5.58f, 0.17f),
                RotationAngle.fromDegrees(leftArm, -59.9649f, 7.3881f, -11.434f),
                RotationAngle.fromDegrees(leftForeArm, -40.0f, 0.0f, 0.0f),
                RotationAngle.fromDegrees(rightArm, -69.4329f, -12.9763f, 5.0309f),
                RotationAngle.fromDegrees(rightForeArm, -19.9093f, -3.917f, -6.4207f)
        });
        ModelPose<BlackStandEntity> jumpscare7 = new ModelPose<>(new RotationAngle[]{
                RotationAngle.fromDegrees(head, -15.43f, -2.33f, 8.66f),
                RotationAngle.fromDegrees(body, 0.0f, 20.0f, 0.0f),
                RotationAngle.fromDegrees(upperPart, 26.7883f, -8.5074f, 1.7597f),
                RotationAngle.fromDegrees(leftArm, -36.79f, -56.03f, -50.74f),
                RotationAngle.fromDegrees(leftForeArm, -35.19f, 0.0f, 0.0f),
                RotationAngle.fromDegrees(rightArm, -55.63f, -49.48f, 37.65f),
                RotationAngle.fromDegrees(rightForeArm, -26.1f, -3.92f, -6.42f)
        });
        ModelPose<BlackStandEntity> jumpscare8 = new ModelPose<>(new RotationAngle[]{
                RotationAngle.fromDegrees(head, -12.8215f, 8.8079f, -7.7787f),
                RotationAngle.fromDegrees(body, 0.0f, 20.0f, 0.0f),
                RotationAngle.fromDegrees(upperPart, 28.5761f, -13.573f, -1.0146f),
                RotationAngle.fromDegrees(leftArm, -28.9424f, -61.0574f, -60.3388f),
                RotationAngle.fromDegrees(leftForeArm, -27.5f, 0.0f, 0.0f),
                RotationAngle.fromDegrees(rightArm, -50.5954f, 57.3652f, 44.5241f),
                RotationAngle.fromDegrees(rightForeArm, -19.9093f, -3.917f, -6.4207f)
        });
        ModelPose<BlackStandEntity> jumpscare9 = new ModelPose<>(new RotationAngle[]{
                RotationAngle.fromDegrees(head, -6.1609f, -2.5351f, 9.3505f),
                RotationAngle.fromDegrees(body, 0.0f, 20.0f, 0.0f),
                RotationAngle.fromDegrees(upperPart, 30.23f, -11.25f, 0.23),
                RotationAngle.fromDegrees(leftArm, -28.9424f, -61.0574f, -60.3388f),
                RotationAngle.fromDegrees(leftForeArm, -27.5f, 0.0f, 0.0f),
                RotationAngle.fromDegrees(rightArm, -50.5954f, 57.3652f, 44.5241f),
                RotationAngle.fromDegrees(rightForeArm, -19.9093f, -3.917f, -6.4207f)
        });
        ModelPose<BlackStandEntity> jumpscare10 = new ModelPose<>(new RotationAngle[]{
                RotationAngle.fromDegrees(head, -8.34f, 0.38f, 5.17),
                RotationAngle.fromDegrees(body, 0.0f, 20.0f, 0.0f),
                RotationAngle.fromDegrees(upperPart, 31.1909f, -14.0808f, -1.4825),
                RotationAngle.fromDegrees(leftArm, -28.9424f, -61.0574f, -60.3388f),
                RotationAngle.fromDegrees(leftForeArm, -27.5f, 0.0f, 0.0f),
                RotationAngle.fromDegrees(rightArm, -50.5954f, 57.3652f, 44.5241f),
                RotationAngle.fromDegrees(rightForeArm, -19.9093f, -3.917f, -6.4207f)
        });
        ModelPose<BlackStandEntity> jumpscare11 = new ModelPose<>(new RotationAngle[]{
                RotationAngle.fromDegrees(head, 27.7059f, 4.083f, -3.197),
                RotationAngle.fromDegrees(body, 0.0f, 20.0f, 0.0f),
                RotationAngle.fromDegrees(upperPart, 32.0287f, -11.1637f, 0.3435),
                RotationAngle.fromDegrees(leftArm, -28.9424f, -61.0574f, -60.3388f),
                RotationAngle.fromDegrees(leftForeArm, -27.5f, 0.0f, 0.0f),
                RotationAngle.fromDegrees(rightArm, -50.5954f, 57.3652f, 44.5241f),
                RotationAngle.fromDegrees(rightForeArm, -19.9093f, -3.917f, -6.4207f)
        });
        actionAnim.put(Jumpscare.JUMPSCARE, new PosedActionAnimation.Builder<BlackStandEntity>()
                .addPose(StandEntityAction.Phase.PERFORM, new ModelPoseTransitionMultiple.Builder<>(idlePose)
                        .addPose(0.08f, jumpscare1)
                        .addPose(0.17f, jumpscare2)
                        .addPose(0.25f, jumpscare3)
                        .addPose(0.33f, jumpscare4)
                        .addPose(0.38f, jumpscare5)
                        .addPose(0.42f, jumpscare6)
                        .addPose(0.5f, jumpscare7)
                        .addPose(0.58f, jumpscare8)
                        .addPose(0.63f, jumpscare9)
                        .addPose(0.67f, jumpscare10)
                        .addPose(0.75f, jumpscare11)
                        .build(jumpscare11))
                .addPose(StandEntityAction.Phase.RECOVERY, new ModelPoseTransitionMultiple.Builder<>(jumpscare11)
                        .addPose(0.02F, idlePose)
                        .build(idlePose))
                .build(idlePose));
        
        super.initActionPoses();
    }

    @Override
    public void prepareMobModel(BlackStandEntity entity, float walkAnimPos, float walkAnimSpeed, float partialTick) {
        super.prepareMobModel(entity, walkAnimPos, walkAnimSpeed, partialTick);
        if (watch != null) {
            watch.visible = entity.hasWatch();
        }
        if (commandBlock != null) {
            commandBlock.visible = entity.hasCC();
        }
    }



    @Override
    protected ModelPose<BlackStandEntity> initIdlePose() {
        return new ModelPose<>(new RotationAngle[]{
                RotationAngle.fromDegrees(body, 0.0f, 20.0f, 0.0f),
                RotationAngle.fromDegrees(upperPart, 0.0f, 20.0f, 0.0f),
                RotationAngle.fromDegrees(leftArm, 12.4539f, -1.0809f, -7.6179),
                RotationAngle.fromDegrees(leftForeArm, -25.0f, 0.0f, 0.0f),
                RotationAngle.fromDegrees(rightArm, -4.8207f, -4.2359f, 7.9803f),
                RotationAngle.fromDegrees(rightForeArm, -9.9093f, -3.917f, -6.4207f),
                RotationAngle.fromDegrees(leftLeg, -6.2196f, -16.5425f, -1.9606f),
                RotationAngle.fromDegrees(leftLowerLeg, 10.0f, -7.5f, 0.0f),
                RotationAngle.fromDegrees(rightLeg, -2.3179f, -10.1954f, -2.0747f),
                RotationAngle.fromDegrees(rightLowerLeg, 12.5f, 7.5f, 0.0f)
        });
    }
    @Override
    protected ModelPose<BlackStandEntity> initIdlePose2Loop() {
        return new ModelPose<>(new RotationAngle[]{
                RotationAngle.fromDegrees(leftArm, 12.4885f, -0.5409f, -10.0592f),
                RotationAngle.fromDegrees(rightArm, -5.0006, -4.0219f, 10.4776f)
        });
    }
}