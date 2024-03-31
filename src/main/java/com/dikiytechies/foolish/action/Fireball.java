package com.dikiytechies.foolish.action;

import com.github.standobyte.jojo.action.ActionConditionResult;
import com.github.standobyte.jojo.action.ActionTarget;
import com.github.standobyte.jojo.action.stand.StandEntityAction;
import com.github.standobyte.jojo.entity.stand.StandEntity;
import com.github.standobyte.jojo.entity.stand.StandEntityTask;
import com.github.standobyte.jojo.power.impl.stand.IStandPower;
import net.minecraft.entity.projectile.FireballEntity;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.World;

import static com.dikiytechies.foolish.init.InitStands.BLACK_FIREBALL_RAIN;

public class Fireball extends StandEntityAction {
    public Fireball(StandEntityAction.Builder builder) { super(builder); }

    protected ActionConditionResult checkStandConditions(StandEntity stand, IStandPower power, ActionTarget target) {
        if (power.getStamina() < 150) return ActionConditionResult.NEGATIVE;
        return ActionConditionResult.POSITIVE;
    }

    @Override
    public void standPerform(World world, StandEntity standEntity, IStandPower userPower, StandEntityTask task) {
        Vector3d shootingVec = Vector3d.directionFromRotation(standEntity.xRot, standEntity.yRot);
        if (!world.isClientSide()) {
            FireballEntity fireball = new FireballEntity(world, standEntity.getX(), standEntity.getY() + 0.5 * standEntity.getEyeHeight(), standEntity.getZ(), shootingVec.x, shootingVec.y, shootingVec.z);
            fireball.explosionPower = 2;
            fireball.setOwner(userPower.getUser());
            fireball.setInvulnerable(true);
            world.addFreshEntity(fireball);
            userPower.addLearningProgressPoints(this, getMaxTrainingPoints(userPower) * 0.05f);
        }
    }

    @Override
    public void onMaxTraining(IStandPower power) {
        if (power.getResolveLevel() >= 2) power.unlockAction(BLACK_FIREBALL_RAIN.get());
    }
}
