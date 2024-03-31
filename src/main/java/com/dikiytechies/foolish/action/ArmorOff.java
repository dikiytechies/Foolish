package com.dikiytechies.foolish.action;

import com.github.standobyte.jojo.action.stand.StandEntityAction;
import com.github.standobyte.jojo.entity.stand.StandEntity;
import com.github.standobyte.jojo.entity.stand.StandEntityTask;
import com.github.standobyte.jojo.power.impl.stand.IStandPower;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.world.World;


public class ArmorOff extends StandEntityAction {
    public ArmorOff(StandEntityAction.Builder builder) { super(builder); }

    @Override
    public void standPerform(World world, StandEntity standEntity, IStandPower userPower, StandEntityTask task) {

    }
}
