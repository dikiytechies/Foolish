package com.dikiytechies.foolish;

import com.dikiytechies.foolish.effect.ModEffects;
import com.dikiytechies.foolish.init.*;
import com.dikiytechies.foolish.item.ModItems;
import net.minecraft.item.ItemGroup;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import static com.github.standobyte.jojo.JojoMod.MAIN_TAB;

// Your addon's main file

@Mod(AddonMain.MOD_ID)
public class AddonMain {
    // The mod's id. Used quite often, mostly when creating ResourceLocation (objects).
    // Its value should match the "modid" entry in the META-INF/mods.toml file
    public static final ItemGroup GROUP = MAIN_TAB;
    public static final String MOD_ID = "foolish";
    public static final Logger LOGGER = LogManager.getLogger();

    public AddonMain() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        // All DeferredRegister objects are registered here.
        // A DeferredRegister needs to be created for each type of objects that need to be registered in the game 
        // (see ForgeRegistries or JojoCustomRegistries)
        InitEntities.ENTITIES.register(modEventBus);
        InitSounds.SOUNDS.register(modEventBus);
        InitStands.ACTIONS.register(modEventBus);
        // InitParticles.PARTICLES.register(modEventBus);
        InitStands.STANDS.register(modEventBus);
        ModEffects.EFFECT.register(modEventBus);
        ModItems.ITEMS.register(modEventBus);

        registerVanillaDeferredRegisters(modEventBus);
    }
    private void registerVanillaDeferredRegisters(IEventBus modEventBus){
        InitPotions.POTIONS.register(modEventBus);
    }

}
