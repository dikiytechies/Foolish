package com.dikiytechies.foolish.init;

import com.dikiytechies.foolish.AddonMain;

import com.dikiytechies.foolish.entity.CommandBlockEntity;
import com.github.standobyte.jojo.JojoMod;
import com.github.standobyte.jojo.entity.itemprojectile.BladeHatEntity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class InitEntities {
    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(
            ForgeRegistries.ENTITIES, AddonMain.MOD_ID);

    public static final RegistryObject<EntityType<CommandBlockEntity>> COMMAND_BLOCK = ENTITIES.register("command_block",
            () -> EntityType.Builder.<CommandBlockEntity>of(CommandBlockEntity::new, EntityClassification.MISC).sized(1.0F, 1.0F).setUpdateInterval(20)
                    .build(new ResourceLocation(JojoMod.MOD_ID, "command_block").toString()));
}
