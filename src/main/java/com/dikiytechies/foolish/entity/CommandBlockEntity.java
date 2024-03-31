package com.dikiytechies.foolish.entity;

import com.dikiytechies.foolish.init.InitEntities;
import com.github.standobyte.jojo.entity.itemprojectile.ItemNbtProjectileEntity;
import com.github.standobyte.jojo.entity.mob.HungryZombieEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.monster.ZombieEntity;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.IPacket;
import net.minecraft.network.PacketBuffer;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.IEntityAdditionalSpawnData;

import java.util.Optional;
import java.util.UUID;

public class CommandBlockEntity extends Entity implements IEntityAdditionalSpawnData {
    protected static final DataParameter<Optional<UUID>> OWNER_UUID = EntityDataManager.defineId(CommandBlockEntity.class, DataSerializers.OPTIONAL_UUID);

    public CommandBlockEntity(World world) {
        super(InitEntities.COMMAND_BLOCK.get(), world);
        this.setNoGravity(true);
        this.setGlowing(true);
    }

    public CommandBlockEntity(EntityType<?> type, World world) {
        super(type, world);
    }

    @Override
    protected void defineSynchedData() {
        entityData.define(OWNER_UUID, Optional.empty());
    }

    public static AttributeModifierMap.MutableAttribute createAttributes() {
        return CommandBlockEntity.createAttributes()
                .add(Attributes.MAX_HEALTH, 10.0D)
                .add(Attributes.KNOCKBACK_RESISTANCE, 10.0D);
    }

    @Override
    protected void readAdditionalSaveData(CompoundNBT p_70037_1_) {

    }

    @Override
    protected void addAdditionalSaveData(CompoundNBT p_213281_1_) {

    }

    @Override
    public IPacket<?> getAddEntityPacket() {
        return null;
    }

    @Override
    public void writeSpawnData(PacketBuffer buffer) {

    }

    @Override
    public void readSpawnData(PacketBuffer additionalData) {

    }
}
