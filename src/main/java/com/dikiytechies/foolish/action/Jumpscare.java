package com.dikiytechies.foolish.action;

import com.dikiytechies.foolish.init.InitSounds;
import com.github.standobyte.jojo.action.ActionConditionResult;
import com.github.standobyte.jojo.action.ActionTarget;
import com.github.standobyte.jojo.action.stand.StandEntityAction;
import com.github.standobyte.jojo.entity.stand.StandEntity;
import com.github.standobyte.jojo.entity.stand.StandEntityTask;
import com.github.standobyte.jojo.entity.stand.StandPose;
import com.github.standobyte.jojo.init.ModStatusEffects;
import com.github.standobyte.jojo.power.impl.stand.IStandPower;
import com.github.standobyte.jojo.util.mod.JojoModUtil;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.item.BoatEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EntityDamageSource;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.World;

import java.util.Random;

public class Jumpscare extends StandEntityAction {
    public Jumpscare(Builder builder) {
        super(builder);
    }

    public static final StandPose JUMPSCARE = new StandPose("JUMPSCARE");

    private Vector3d pos;

    public boolean cheetahFreddyFazbear; //I'll regret for this stupid naming
    private boolean musicbox = true;
    private int cnt = 0;
    private int musicTicks[] = new int[]{180, 380 ,600};
    private int endTick;
    private static int randIndex;
    private int silenceTicks;
    private ActionTarget tarkhun;
    Random random = new Random();

    @Override
    protected ActionConditionResult checkStandConditions(StandEntity stand, IStandPower power, ActionTarget target) {
        if (power.getStamina() < 250) return ActionConditionResult.NEGATIVE;
        return ActionConditionResult.POSITIVE;
    }

    @Override
    protected void preTaskInit(World world, IStandPower standPower, StandEntity standEntity, ActionTarget target) {
        tarkhun = null;
        if (musicbox) {
            if (!world.isClientSide) {
                cnt = 0;
                silenceTicks = 10 + random.nextInt(40);
                randIndex = random.nextInt(3);
                endTick = musicTicks[randIndex];
                System.out.println(silenceTicks + " " + randIndex + " " + endTick);
            }
        }
    }

    @Override
    public void onTaskSet(World world, StandEntity standEntity, IStandPower standPower, Phase phase, StandEntityTask task, int ticks) {
        ActionTarget target = ActionTarget.fromRayTraceResult(JojoModUtil.rayTrace(standEntity,
                4.5, standEntity.canTarget(), standEntity.getPrecision() / 16F, standEntity.getPrecision()));
        cheetahFreddyFazbear = (standEntity.getFinisherMeter() >= 0.95f) && (target.getEntity() instanceof LivingEntity);
        if (musicbox && cheetahFreddyFazbear && !world.isClientSide) {
            playMusicBoxSound(world, standEntity, standPower, randIndex);

            if (target.getEntity() != standEntity) {
                tarkhun = target;
                pos = target.getTargetPos(true);
                Vector3d shootingVec = Vector3d.directionFromRotation(standEntity.xRot, standEntity.yRot);
                if (!world.isClientSide) {
                    LivingEntity targetEntity = (LivingEntity) target.getEntity();
                    targetEntity.addEffect(new EffectInstance(ModStatusEffects.STUN.get(), (endTick + silenceTicks), 3, true, false));
                    targetEntity.addEffect(new EffectInstance(Effects.BLINDNESS, (endTick + silenceTicks), 3, true, false));
                    targetEntity.addEffect(new EffectInstance(Effects.DAMAGE_RESISTANCE, (endTick + silenceTicks), 255, true, false));
                    standPower.getUser().addEffect(new EffectInstance(Effects.WEAKNESS, (endTick + silenceTicks), 3, true, false));
                    standPower.getUser().addEffect(new EffectInstance(Effects.BLINDNESS, (endTick + silenceTicks), 3, true, false));
                    standPower.getUser().addEffect(new EffectInstance(Effects.DAMAGE_RESISTANCE, (endTick + silenceTicks), 255, true, false));
                    targetEntity.addEffect(new EffectInstance(ModStatusEffects.SPIRIT_VISION.get(), (endTick + silenceTicks), 3, true, false));
                    targetEntity.addEffect(new EffectInstance(Effects.MOVEMENT_SLOWDOWN, (endTick + silenceTicks), 255, true, false));
                    standPower.getUser().addEffect(new EffectInstance(Effects.MOVEMENT_SLOWDOWN, (endTick + silenceTicks), 255, true, false));
                }
            }
            musicbox = false;
        }
        if (!cheetahFreddyFazbear) task.moveToPhase(Phase.PERFORM,standPower,standEntity);
    }

    @Override
    public void standPerform(World world, StandEntity standEntity, IStandPower userPower, StandEntityTask task) {
        standEntity.playSound(InitSounds.SCREAM.get(), 0.8f, 1.0f);
        //userPower.getUser().addEffect(new EffectInstance(ModStatusEffects.FULL_INVISIBILITY.get(), 5,0,false, false));
        //standEntity.addEffect(new EffectInstance(ModStatusEffects.FULL_INVISIBILITY.get(), 5,0,false, false));
        if (tarkhun == null) tarkhun = ActionTarget.fromRayTraceResult(JojoModUtil.rayTrace(standEntity,
                1.5, standEntity.canTarget(), standEntity.getPrecision() / 16F, standEntity.getPrecision()));
        if (tarkhun.getEntity() != null && tarkhun.getEntity() != standEntity) {
            pos = tarkhun.getTargetPos(true);
            Vector3d shootingVec = Vector3d.directionFromRotation(standEntity.xRot, standEntity.yRot);
            if (!world.isClientSide && task.getTarget() != null) {
                tarkhun.getEntity().hurt(new EntityDamageSource(DamageSource.mobAttack(standEntity).getMsgId(), userPower.getUser()).bypassArmor(), (float) (10 * standEntity.getAttackDamage() / 16));
                //tarkhun.getEntity().push(shootingVec.x * 0.8, 0.35f, shootingVec.z * 0.8);
                if (tarkhun.getEntity() instanceof LivingEntity) {
                    LivingEntity targetEntity = (LivingEntity) tarkhun.getEntity();
                    targetEntity.addEffect(new EffectInstance(Effects.MOVEMENT_SLOWDOWN, 140, 3, true, false));
                    targetEntity.addEffect(new EffectInstance(Effects.CONFUSION, 140, 3, true, false));
                    targetEntity.addEffect(new EffectInstance(Effects.BLINDNESS, 140, 3, true, false));
                    targetEntity.addEffect(new EffectInstance(Effects.WEAKNESS, 140, 3, true, false));
                    targetEntity.addEffect(new EffectInstance(ModStatusEffects.SPIRIT_VISION.get(), 140, 3, true, false));
                }
            }

        }
        musicbox = true;
    }

    @Override
    public void standTickWindup(World world, StandEntity standEntity, IStandPower userPower, StandEntityTask task) {
        if (cnt - silenceTicks <= endTick * 2) {
            task.moveToPhase(Phase.WINDUP, userPower, standEntity);
            if (cnt % 6 == 0 && cnt / 2 < endTick + silenceTicks) {
                userPower.getUser().addEffect(new EffectInstance(ModStatusEffects.FULL_INVISIBILITY.get(), 1, 0, false, false));
                standEntity.addEffect(new EffectInstance(ModStatusEffects.FULL_INVISIBILITY.get(), 1, 0, false, false));
            } else if (cnt % 17 == 0 && cnt / 2 < endTick + silenceTicks) {
                userPower.getUser().addEffect(new EffectInstance(ModStatusEffects.FULL_INVISIBILITY.get(), 3, 0, false, false));
                standEntity.addEffect(new EffectInstance(ModStatusEffects.FULL_INVISIBILITY.get(), 3, 0, false, false));
            } else if (cnt / 2 == endTick) {
                userPower.getUser().addEffect(new EffectInstance(ModStatusEffects.FULL_INVISIBILITY.get(), silenceTicks - 8, 0, false, false));
                standEntity.addEffect(new EffectInstance(ModStatusEffects.FULL_INVISIBILITY.get(), silenceTicks - 8, 0, false, false));
//            task.moveToPhase(Phase.PERFORM,userPower,standEntity);
            }
        }
        cheetahFreddyFazbear = false;
        cnt++;
    }

    public void playMusicBoxSound(World world, StandEntity standEntity, IStandPower standPower, int randIndex) {
        switch (randIndex) {
            case 0:
                standEntity.playSound(InitSounds.MUSIC_BOX_S.get(), 1.0f, 1.0f);
                //playSoundAtStand(world, standEntity, InitSounds.MUSIC_BOX_S.get(), standPower, Phase.WINDUP);
                break;
            case 1:
                standEntity.playSound(InitSounds.MUSIC_BOX_M.get(), 1.0f, 1.0f);
                //playSoundAtStand(world, standEntity, InitSounds.MUSIC_BOX_M.get(), standPower, Phase.WINDUP);
                break;
            case 2:
                standEntity.playSound(InitSounds.MUSIC_BOX_L.get(), 1.0f, 1.0f);
                //playSoundAtStand(world, standEntity, InitSounds.MUSIC_BOX_L.get(), standPower, Phase.WINDUP);
                break;
        }
    }

}
