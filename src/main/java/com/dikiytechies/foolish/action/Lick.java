package com.dikiytechies.foolish.action;

import com.github.standobyte.jojo.action.stand.StandEntityAction;
import com.github.standobyte.jojo.entity.damaging.projectile.ownerbound.SatiporojaScarfEntity;
import com.github.standobyte.jojo.entity.stand.StandEntity;
import com.github.standobyte.jojo.entity.stand.StandEntityTask;
import com.github.standobyte.jojo.power.impl.stand.IStandPower;
import net.minecraft.util.Hand;
import net.minecraft.util.HandSide;
import net.minecraft.world.World;

public class Lick extends StandEntityAction {
    public Lick(StandEntityAction.Builder builder) { super(builder); }

    @Override
    public void standPerform(World world, StandEntity standEntity, IStandPower userPower, StandEntityTask task) {
        if (!world.isClientSide()) {
                SatiporojaScarfEntity scarf = new SatiporojaScarfEntity(world, standEntity,
                        HandSide.LEFT);
                world.addFreshEntity(scarf);
        }
    }
}
