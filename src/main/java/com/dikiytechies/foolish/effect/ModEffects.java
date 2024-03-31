package com.dikiytechies.foolish.effect;

import com.dikiytechies.foolish.AddonMain;
import com.dikiytechies.foolish.effect.Diarrhea;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import com.dikiytechies.foolish.effect.Diarrhea;

public class ModEffects {
    public static final DeferredRegister<Effect> EFFECT = DeferredRegister.create(ForgeRegistries.POTIONS, AddonMain.MOD_ID);

    public static final RegistryObject<Effect> DIARRHEA = EFFECT.register("diarrhea",
            () -> new Diarrhea(EffectType.HARMFUL, 0x635342));

    public static void register(IEventBus eventBus) {
        EFFECT.register(eventBus);
    }
}
