package com.dikiytechies.foolish.action;

import com.dikiytechies.foolish.entity.BlackStandEntity;
import com.github.standobyte.jojo.action.ActionConditionResult;
import com.github.standobyte.jojo.action.ActionTarget;
import com.github.standobyte.jojo.action.stand.StandEntityAction;
import com.github.standobyte.jojo.entity.stand.StandEntity;
import com.github.standobyte.jojo.entity.stand.StandEntityTask;
import com.github.standobyte.jojo.entity.stand.StandPose;
import com.github.standobyte.jojo.power.impl.stand.IStandPower;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.DamageSource;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class BitesTheDust extends StandEntityAction {
    public BitesTheDust(StandEntityAction.Builder builder) { super(builder); }

    public static final StandPose WATCH = new StandPose("WATCH_POSE");

    @Override
    protected ActionConditionResult checkStandConditions(StandEntity stand, IStandPower power, ActionTarget target) {
        if (power.getStamina() < power.getMaxStamina() * 0.95f) return ActionConditionResult.NEGATIVE;
        return ActionConditionResult.POSITIVE;
    }

    @Override
    public void onTaskSet(World world, StandEntity standEntity, IStandPower standPower, Phase phase, StandEntityTask task, int ticks) {
        ((BlackStandEntity)standEntity).setHasWatch(true);
    }

    @Override
    public void standPerform(World world, StandEntity standEntity, IStandPower userPower, StandEntityTask task) {
        if (!world.isClientSide) {
            userPower.consumeStamina(userPower.getMaxStamina() * 0.95f);
            userPower.getUser().setInvulnerable(true);
            userPower.getUser().addEffect(new EffectInstance(Effects.SLOW_FALLING, 100, 2, true, false));
            userPower.getUser().level.explode(standEntity, standEntity.getX(), standEntity.getY(), standEntity.getZ(), 75, Explosion.Mode.DESTROY);
            userPower.getUser().setInvulnerable(false);
        }
    }

    @Override
    public boolean cancelHeldOnGettingAttacked(IStandPower power, DamageSource dmgSource, float dmgAmount) {
        power.setCooldownTimer(power.getHeldAction(), 6000);
        return true;
    }

    @Override
    protected void onTaskStopped(World world, StandEntity standEntity, IStandPower standPower, StandEntityTask task, @Nullable StandEntityAction newAction) {
        ((BlackStandEntity)standEntity).setHasWatch(false);
    }
}
