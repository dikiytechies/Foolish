package com.dikiytechies.foolish.init;

import java.util.function.Supplier;

import com.github.standobyte.jojo.JojoMod;
import com.github.standobyte.jojo.init.ModSounds;
import com.github.standobyte.jojo.util.mc.OstSoundList;
import com.dikiytechies.foolish.AddonMain;

import net.minecraft.client.audio.Sound;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import org.lwjgl.system.CallbackI;

public class InitSounds {
    public static final DeferredRegister<SoundEvent> SOUNDS = DeferredRegister.create(
            ForgeRegistries.SOUND_EVENTS, AddonMain.MOD_ID); // TODO sounds.json
    
    public static final RegistryObject<SoundEvent> PINE_CONE_STAND_SUMMON_VOICELINE = SOUNDS.register("pine_cone_stand_summon_voiceline",
            () -> new SoundEvent(new ResourceLocation(AddonMain.MOD_ID, "pine_cone_stand_summon_voiceline")));

    public static final RegistryObject<SoundEvent> BLACK_STAND_SUMMON_VOICELINE = SOUNDS.register("black_stand_summon_voiceline",
            () -> new SoundEvent(new ResourceLocation(AddonMain.MOD_ID, "black_stand_summon_voiceline")));

    public static final RegistryObject<SoundEvent> FART = SOUNDS.register("fart",
            () -> new SoundEvent(new ResourceLocation(AddonMain.MOD_ID, "fart")));

    public static final RegistryObject<SoundEvent> SCREAM = SOUNDS.register("scream",
            () -> new SoundEvent(new ResourceLocation(AddonMain.MOD_ID, "scream")));

    public static final RegistryObject<SoundEvent> NUMERO = SOUNDS.register("numero",
            () -> new SoundEvent(new ResourceLocation(AddonMain.MOD_ID, "numero")));

    public static final RegistryObject<SoundEvent> ALERT = SOUNDS.register("scary",
            () -> new SoundEvent(new ResourceLocation(AddonMain.MOD_ID, "scary")));

    public static final RegistryObject<SoundEvent> MUSIC_BOX = SOUNDS.register("musicbox",
            () -> new SoundEvent(new ResourceLocation(AddonMain.MOD_ID, "musicbox")));

    public static final RegistryObject<SoundEvent> MUSIC_BOX_S = SOUNDS.register("musicboxs",
            () -> new SoundEvent(new ResourceLocation(AddonMain.MOD_ID, "musicboxs")));

    public static final RegistryObject<SoundEvent> MUSIC_BOX_M = SOUNDS.register("musicboxm",
            () -> new SoundEvent(new ResourceLocation(AddonMain.MOD_ID, "musicboxm")));

    public static final RegistryObject<SoundEvent> MUSIC_BOX_L = SOUNDS.register("musicboxl",
            () -> new SoundEvent(new ResourceLocation(AddonMain.MOD_ID, "musicboxl")));

    public static final RegistryObject<SoundEvent> MOMENT_VOICE = SOUNDS.register("moment_v",
            () -> new SoundEvent(new ResourceLocation(AddonMain.MOD_ID, "moment_v")));

    public static final RegistryObject<SoundEvent> MOMENT_SOUND = SOUNDS.register("moment_s",
            () -> new SoundEvent(new ResourceLocation(AddonMain.MOD_ID, "moment_s")));

    public static final Supplier<SoundEvent> PINE_CONE_STAND_SUMMON_SOUND = ModSounds.STAND_SUMMON_DEFAULT;
    
    public static final Supplier<SoundEvent> PINE_CONE_STAND_UNSUMMON_SOUND = ModSounds.STAND_UNSUMMON_DEFAULT;
    
    public static final Supplier<SoundEvent> PINE_CONE_STAND_PUNCH_LIGHT = ModSounds.STAND_PUNCH_LIGHT;
    
    public static final Supplier<SoundEvent> PINE_CONE_STAND_PUNCH_HEAVY = ModSounds.STAND_PUNCH_HEAVY;
    
    public static final Supplier<SoundEvent> PINE_CONE_STAND_PUNCH_BARRAGE = ModSounds.STAND_PUNCH_LIGHT;
    
    public static final Supplier<SoundEvent> PINE_CONE_STAND_THROW_PICKAXE = ModSounds.STAND_PUNCH_LIGHT;

    public static final Supplier<SoundEvent> BLACK_STAND_SUMMON_SOUND = ModSounds.STAND_SUMMON_DEFAULT;

    public static final Supplier<SoundEvent> BLACK_STAND_UNSUMMON_SOUND = ModSounds.STAND_UNSUMMON_DEFAULT;

    public static final Supplier<SoundEvent> BLACK_STAND_PUNCH_LIGHT = ModSounds.STAND_PUNCH_LIGHT;

    public static final Supplier<SoundEvent> BLACK_STAND_PUNCH_HEAVY = ModSounds.STAND_PUNCH_HEAVY;

    public static final Supplier<SoundEvent> BLACK_STAND_PUNCH_BARRAGE = ModSounds.STAND_PUNCH_LIGHT;

    public static final Supplier<SoundEvent> BLACK_STAND_THROW_PICKAXE = ModSounds.STAND_PUNCH_LIGHT;
    
    public static final OstSoundList PINE_CONE_STAND_OST = new OstSoundList(
            new ResourceLocation(AddonMain.MOD_ID, "pine_cone_stand_ost"), SOUNDS);

    public static final OstSoundList BLACK_STAND_OST = new OstSoundList(
            new ResourceLocation(AddonMain.MOD_ID, "black_stand_ost"), SOUNDS);


    private static RegistryObject<SoundEvent> register(String regPath) {
        return SOUNDS.register(regPath, () -> new SoundEvent(new ResourceLocation(AddonMain.MOD_ID, regPath)));
    }
}
