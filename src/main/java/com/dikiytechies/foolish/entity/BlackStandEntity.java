package com.dikiytechies.foolish.entity;

import com.github.standobyte.jojo.entity.stand.StandEntity;
import com.github.standobyte.jojo.entity.stand.StandEntityType;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.world.World;

public class BlackStandEntity extends StandEntity {
    private static final DataParameter<Boolean> HAS_WATCH =
            EntityDataManager.defineId(BlackStandEntity.class, DataSerializers.BOOLEAN);

    private static final DataParameter<Boolean> HAS_CC =
            EntityDataManager.defineId(BlackStandEntity.class, DataSerializers.BOOLEAN);

    public BlackStandEntity(StandEntityType<BlackStandEntity> type, World world) {
        super(type, world);
    }

    @Override
    protected void defineSynchedData() {
        super.defineSynchedData();
        entityData.define(HAS_WATCH, false);
        entityData.define(HAS_CC, false);
    }
    
    public boolean hasWatch() {
        return entityData.get(HAS_WATCH);
    }

    public boolean hasCC() {
        return entityData.get(HAS_CC);
    }
    
    public void setHasWatch(boolean hasWatch) {
        entityData.set(HAS_WATCH, hasWatch);
    }

    public void setHasCC(boolean hasCC) { entityData.set(HAS_CC, hasCC); }
}
