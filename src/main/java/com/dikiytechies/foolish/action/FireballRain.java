package com.dikiytechies.foolish.action;

import com.github.standobyte.jojo.action.ActionConditionResult;
import com.github.standobyte.jojo.action.ActionTarget;
import com.github.standobyte.jojo.action.stand.StandEntityAction;
import com.github.standobyte.jojo.entity.stand.StandEntity;
import com.github.standobyte.jojo.entity.stand.StandEntityTask;
import com.github.standobyte.jojo.entity.stand.StandPose;
import com.github.standobyte.jojo.power.impl.stand.IStandPower;
import com.github.standobyte.jojo.util.mod.JojoModUtil;
import net.minecraft.entity.projectile.FireballEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.World;

import java.lang.Math;

import java.util.Random;


public class FireballRain extends StandEntityAction {
    public FireballRain(Builder builder) { super(builder); }

    public static final StandPose FIRE_COMMAND_POSE = new StandPose("FIRE_COMMAND_POSE");

    private int currentTick = 0;
    private Vector3d pos;

    private boolean exhausted;

    private float offset;

    private int angle;

    @Override
    public boolean canStaminaRegen(IStandPower standPower, StandEntity standEntity) { return true; }

    protected ActionConditionResult checkStandConditions(StandEntity stand, IStandPower power, ActionTarget target) {
        if (power.getStamina() < 750 && standPerformDuration < 1) return ActionConditionResult.NEGATIVE;
        return ActionConditionResult.POSITIVE;
    }

    @Override
    public void standTickPerform(World world, StandEntity standEntity, IStandPower userPower, StandEntityTask task) {
        ActionTarget target = ActionTarget.fromRayTraceResult(JojoModUtil.rayTrace(standEntity,
                75, standEntity.canTarget(), standEntity.getPrecision() / 16F, standEntity.getPrecision()));
        RayTraceResult targetBlock = standEntity.aimWithStandOrUser(75, task.getTarget());

        if (target.getEntity() != null && target.getEntity() != standEntity) {
            pos = target.getTargetPos(true);
        } else {
            pos = targetBlock.getLocation();
        }

        if (pos != null) {
            Random random = new Random();
            angle = random.nextInt(360);
            offset = 10;
            Vector3d startPos = new Vector3d(pos.x + Math.cos(angle) * offset, pos.y + 20, pos.z + Math.sin(angle) * offset);
            currentTick += random.nextInt(3);
            BlockPos blockPos = new BlockPos(startPos);
            if (!world.isClientSide() && world.canSeeSky(blockPos)) {
                FireballEntity fireball = new FireballEntity(world, startPos.x, startPos.y, startPos.z, pos.x - startPos.x, pos.y - startPos.y, pos.z - startPos.z);
                fireball.explosionPower = 0;
                fireball.setOwner(userPower.getUser());
                fireball.setInvulnerable(true);
                exhausted = (userPower.getStamina() <= userPower.getMaxStamina() * 0.4f);
                if (userPower.getStamina() >= 75) {
                    if (!exhausted) {
                        if (currentTick % 2 == 0 || currentTick >= 25) {
                            world.addFreshEntity(fireball);
                            userPower.consumeStamina(15);
                            currentTick = 0;
                        }
                    } else {
                        if (currentTick * 5 * userPower.getStamina() / userPower.getMaxStamina() >= 25) {
                            world.addFreshEntity(fireball);
                            userPower.consumeStamina(26 * userPower.getMaxStamina() / userPower.getStamina());
                            currentTick = 0;
                        }
                    }
                }
            }
        }
    }
}
