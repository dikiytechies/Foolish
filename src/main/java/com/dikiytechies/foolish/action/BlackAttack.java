package com.dikiytechies.foolish.action;

import com.dikiytechies.foolish.init.InitSounds;
import com.github.standobyte.jojo.action.ActionTarget;
import com.github.standobyte.jojo.action.stand.*;
import com.github.standobyte.jojo.entity.stand.StandEntity;
import com.github.standobyte.jojo.entity.stand.StandEntityTask;
import com.github.standobyte.jojo.init.ModStatusEffects;
import com.github.standobyte.jojo.power.impl.stand.IStandPower;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EntityDamageSource;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class BlackAttack extends StandEntityHeavyAttack {

    public BlackAttack(Builder builder) {
        super(builder);
    }


    //ctrl + c, ctrl + v

    private Vector3d pos;


    @Override
    protected void preTaskInit(World world, IStandPower standPower, StandEntity standEntity, ActionTarget target) {
        standEntity.playSound(InitSounds.NUMERO.get(), 2.0f, 1.0f);
    }

    @Override
    protected void onTaskStopped(World world, StandEntity standEntity, IStandPower standPower, StandEntityTask task, @Nullable StandEntityAction newAction) {
        if (!world.isClientSide && task.getTarget().getEntity() != null && task.getTarget().getEntity() instanceof LivingEntity) {
            standEntity.playSound(InitSounds.ALERT.get(), 1.6f, 1.0f);
            task.getTarget().getEntity().hurt(new EntityDamageSource(DamageSource.mobAttack(standEntity).getMsgId(), standPower.getUser()), (float) standEntity.getAttackDamage() / 8);
            Entity entity = task.getTarget().getEntity();
            LivingEntity targetEntity = (LivingEntity) entity;
            targetEntity.addEffect(new EffectInstance(Effects.MOVEMENT_SLOWDOWN, 68, 0, true, false));
            targetEntity.addEffect(new EffectInstance(Effects.WEAKNESS, 250, 1, true, false));
            targetEntity.addEffect(new EffectInstance(Effects.DIG_SLOWDOWN, 250, 1, true, false));
            targetEntity.addEffect(new EffectInstance(ModStatusEffects.HAMON_SHOCK.get(), 35, 3, true, false));
        }
    }
}


