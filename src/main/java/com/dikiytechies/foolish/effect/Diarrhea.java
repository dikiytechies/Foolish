package com.dikiytechies.foolish.effect;

import com.dikiytechies.foolish.init.InitSounds;
import com.github.standobyte.jojo.init.ModParticles;
import com.github.standobyte.jojo.power.impl.stand.IStandPower;
import net.minecraft.block.Blocks;
import net.minecraft.client.particle.Particle;
import net.minecraft.client.particle.ParticleManager;
import net.minecraft.entity.LivingEntity;
import net.minecraft.particles.BlockParticleData;
import net.minecraft.particles.ParticleType;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectType;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.server.ServerWorld;

import java.util.Random;

import static java.lang.Math.pow;


public class Diarrhea extends Effect {
    protected Diarrhea(EffectType type, int color) { super(type, color); }

    Random random = new Random();

    private float cooldown = 0f;
    @Override
    public void applyEffectTick(LivingEntity entityLiving, int pAmplifier) {
           if (100 - pow(pAmplifier + 1, 10) * cooldown <= 0) {
               if (!entityLiving.level.isClientSide()) {
                   ((ServerWorld) entityLiving.level).sendParticles(new BlockParticleData(ParticleTypes.BLOCK, Blocks.DIRT.defaultBlockState()), entityLiving.getX(), entityLiving.getY() + 0.5, entityLiving.getZ(), 15, 0.05, 0.05, 0.05, 0.25);
                   entityLiving.level.playSound(null, entityLiving, InitSounds.FART.get(), entityLiving.getSoundSource(), Math.min(0.65F * pAmplifier, 1.0F), 1.0F + (random.nextFloat() - random.nextFloat()) * 0.1F);
                   cooldown = 0f;
               }
        }
        cooldown += 0.05f;
    }

    @Override
    public boolean isDurationEffectTick(int pDuration, int pAmplifier) { return true; }
}
