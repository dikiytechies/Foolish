package com.dikiytechies.foolish.client.particle.custom;

import com.github.standobyte.jojo.client.particle.BloodParticle;
import net.minecraft.client.world.ClientWorld;

public class Poo extends BloodParticle {
    protected Poo(ClientWorld world, double x, double y, double z, double xSpeed, double ySpeed, double zSpeed) {
        super(world, x, y, z, xSpeed, ySpeed, zSpeed);
    }
}
