package com.dikiytechies.foolish.init;

import com.dikiytechies.foolish.action.*;
import com.dikiytechies.foolish.entity.BlackStandEntity;
import com.github.standobyte.jojo.action.Action;
import com.github.standobyte.jojo.action.stand.StandEntityAction;
import com.github.standobyte.jojo.action.stand.StandEntityBlock;
import com.github.standobyte.jojo.action.stand.StandEntityHeavyAttack;
import com.github.standobyte.jojo.action.stand.StandEntityLightAttack;
import com.github.standobyte.jojo.action.stand.StandEntityMeleeBarrage;
import com.github.standobyte.jojo.entity.stand.StandEntityType;
import com.github.standobyte.jojo.entity.stand.StandPose;
import com.github.standobyte.jojo.init.power.stand.EntityStandRegistryObject;
import com.github.standobyte.jojo.power.impl.stand.StandInstance.StandPart;
import com.github.standobyte.jojo.power.impl.stand.stats.ArmoredStandStats;
import com.github.standobyte.jojo.power.impl.stand.stats.StandStats;
import com.github.standobyte.jojo.power.impl.stand.type.EntityStandType;
import com.github.standobyte.jojo.power.impl.stand.type.StandType;
import com.dikiytechies.foolish.AddonMain;
import com.dikiytechies.foolish.entity.PineConeStandEntity;

import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;


public class InitStands {
    @SuppressWarnings("unchecked")
    public static final DeferredRegister<Action<?>> ACTIONS = DeferredRegister.create(
            (Class<Action<?>>) ((Class<?>) Action.class), AddonMain.MOD_ID);
    @SuppressWarnings("unchecked")
    public static final DeferredRegister<StandType<?>> STANDS = DeferredRegister.create(
            (Class<StandType<?>>) ((Class<?>) StandType.class), AddonMain.MOD_ID);

    public static final ITextComponent PART_DISCORD_NAME = new TranslationTextComponent("jojo.story_part.discord").withStyle(TextFormatting.GREEN);
    
 // ======================================== Example Stand ========================================
    
    
    // Create all the abilities here...
    /*public static final RegistryObject<StandEntityAction> PINE_CONE_STAND_PUNCH = ACTIONS.register("pine_cone_stand_punch",
            () -> new StandEntityLightAttack(new StandEntityLightAttack.Builder()
                    .punchSound(InitSounds.PINE_CONE_STAND_PUNCH_LIGHT)));
    
    public static final RegistryObject<StandEntityAction> PINE_CONE_STAND_BARRAGE = ACTIONS.register("pine_cone_stand_barrage", 
            () -> new StandEntityMeleeBarrage(new StandEntityMeleeBarrage.Builder()
                    .barrageHitSound(InitSounds.PINE_CONE_STAND_PUNCH_BARRAGE)));

    public static final RegistryObject<StandEntityHeavyAttack> PINE_CONE_STAND_FINISHER_PUNCH = ACTIONS.register("pine_cone_stand_finisher_punch", 
            () -> new StandEntityHeavyAttack(new StandEntityHeavyAttack.Builder() // TODO finisher ability
                    .punchSound(InitSounds.PINE_CONE_STAND_PUNCH_HEAVY)
                    .partsRequired(StandPart.ARMS)));

    public static final RegistryObject<StandEntityHeavyAttack> PINE_CONE_STAND_HEAVY_PUNCH = ACTIONS.register("pine_cone_stand_heavy_punch", 
            () -> new StandEntityHeavyAttack(new StandEntityHeavyAttack.Builder()
                    .shiftVariationOf(PINE_CONE_STAND_PUNCH).shiftVariationOf(PINE_CONE_STAND_BARRAGE)
                    .setFinisherVariation(PINE_CONE_STAND_FINISHER_PUNCH)
                    .punchSound(InitSounds.PINE_CONE_STAND_PUNCH_HEAVY)
                    .partsRequired(StandPart.ARMS)));
    
    public static final RegistryObject<StandEntityAction> PINE_CONE_STAND_BLOCK = ACTIONS.register("pine_cone_stand_block", 
            () -> new StandEntityBlock());
    
    public static final RegistryObject<StandEntityAction> PINE_CONE_STAND_THROW_PICKAXE = ACTIONS.register("pine_cone_stand_throw_pickaxe", 
            () -> new ExampleStandThrowPickaxe(new StandEntityAction.Builder()
                    .holdToFire(20, true)
                    .standSound(InitSounds.PINE_CONE_STAND_THROW_PICKAXE)
                    .staminaCost(75)
                    .partsRequired(StandPart.ARMS)));

    public static final RegistryObject<StandEntityAction> PINE_CONE_STAND_LICK = ACTIONS.register("pine_cone_stand_lick",
            () -> new Lick(new StandEntityAction.Builder()
                    .holdToFire(20, true)
                    .standSound(InitSounds.PINE_CONE_STAND_THROW_PICKAXE)
                    .staminaCost(75)
                    .partsRequired(StandPart.MAIN_BODY)));
*/
    //Black
    public static final RegistryObject<StandEntityAction> BLACK_STAND_PUNCH = ACTIONS.register("black_stand_punch",
            () -> new StandEntityLightAttack(new StandEntityLightAttack.Builder()
                    .punchSound(InitSounds.BLACK_STAND_PUNCH_LIGHT)));

    public static final RegistryObject<StandEntityAction> BLACK_STAND_BARRAGE = ACTIONS.register("black_stand_barrage",
            () -> new StandEntityMeleeBarrage(new StandEntityMeleeBarrage.Builder()
                    .barrageHitSound(InitSounds.BLACK_STAND_PUNCH_BARRAGE)));

    public static final RegistryObject<StandEntityAction> BLACK_JUMPSCARE = ACTIONS.register("black_jumpscare",
            () -> new Jumpscare(new StandEntityAction.Builder()
                    .standUserWalkSpeed(0.0f)
                    .partsRequired(StandPart.ARMS)
                    .standPose(Jumpscare.JUMPSCARE)
                    .standWindupDuration(2)
                    .cooldown(500)
                    .staminaCost(250)
                    .autoSummonStand()
                    .standOffsetFront()
                    .standPerformDuration(10)
                    .resolveLevelToUnlock(3)
            ));
    public static final RegistryObject<BlackAttack> BLACK_STAND_HEAVY_PUNCH_FINISHER = ACTIONS.register("black_stand_heavy_punch_finisher",
            () -> new BlackAttack(new BlackAttack.Builder()
                    .shiftVariationOf(BLACK_STAND_PUNCH).shiftVariationOf(BLACK_STAND_BARRAGE)
                    .punchSound(InitSounds.BLACK_STAND_PUNCH_HEAVY)
                    .cooldown(500)
                    .standRecoveryTicks(10)
                    .resolveLevelToUnlock(1)
                    .standPose(Jumpscare.JUMPSCARE)
                    .partsRequired(StandPart.ARMS)));

    public static final RegistryObject<StandEntityHeavyAttack> BLACK_STAND_HEAVY_PUNCH = ACTIONS.register("black_stand_heavy_punch",
            () -> new StandEntityHeavyAttack(new StandEntityHeavyAttack.Builder()
                    .shiftVariationOf(BLACK_STAND_PUNCH).shiftVariationOf(BLACK_STAND_BARRAGE)
                    .setFinisherVariation(BLACK_STAND_HEAVY_PUNCH_FINISHER)
                    .punchSound(InitSounds.BLACK_STAND_PUNCH_HEAVY)
                    .partsRequired(StandPart.ARMS)));

    public static final RegistryObject<StandEntityAction> BLACK_STAND_BLOCK = ACTIONS.register("black_stand_block",
            () -> new StandEntityBlock());

    public static final RegistryObject<StandEntityAction> BLACK_FIREBALL_RAIN = ACTIONS.register("black_fireball_rain",
            () -> new FireballRain(new StandEntityAction.Builder()
                    .standPose(FireballRain.FIRE_COMMAND_POSE)
                    .standUserWalkSpeed(0.8f)
                    .holdType(1000)
                    .partsRequired(StandPart.ARMS)
                    .cooldown(600, 1000, 0.65f)
                    .autoSummonStand()
                    .standOffsetFromUser(-0.3,-0.25,0.75)
                    .standRecoveryTicks(15)
                    .noResolveUnlock()));

    public static final RegistryObject<StandEntityAction> BLACK_FIREBALL = ACTIONS.register("black_fireball",
            () -> new Fireball(new StandEntityAction.Builder()
                    .shiftVariationOf(BLACK_FIREBALL_RAIN)
                    .staminaCost(150)
                    .partsRequired(StandPart.ARMS)
                    .cooldown(600)
                    .autoSummonStand()
                    .standOffsetFront()
                    .isTrained()
                    .standPose(StandPose.RANGED_ATTACK)
                    .standPerformDuration(15)
                    .resolveLevelToUnlock(1)));

    public static final RegistryObject<StandEntityAction> BLACK_BITES_THE_DUST = ACTIONS.register("black_bites_the_dust",
            () -> new BitesTheDust(new StandEntityAction.Builder()
                    .shout(InitSounds.MOMENT_VOICE)
                    .standSound(StandEntityAction.Phase.BUTTON_HOLD, InitSounds.MOMENT_SOUND)
                    .standUserWalkSpeed(0.0f)
                    .holdToFire(95, false)
                    .partsRequired(StandPart.ARMS)
                    .cooldown(12000)
                    .autoSummonStand()
                    .standOffsetFront()
                    .standPose(BitesTheDust.WATCH)
                    .resolveLevelToUnlock(4)
            ));
    
    

    // ...then create the Stand type instance. Moves, stats, entity sizes, and a few other things are determined here.
    /* public static final EntityStandRegistryObject<EntityStandType<StandStats>, StandEntityType<PineConeStandEntity>> PINE_CONE_STAND =
            new EntityStandRegistryObject<>("pine_cone_stand", 
                    STANDS, 
                    () -> new EntityStandType.Builder<StandStats>()
                    .color(0x836953)
                    .storyPartName(PART_DISCORD_NAME)
                    .leftClickHotbar(
                            PINE_CONE_STAND_PUNCH.get(),
                            PINE_CONE_STAND_BARRAGE.get()
                            )
                    .rightClickHotbar(
                            PINE_CONE_STAND_BLOCK.get(),
                            PINE_CONE_STAND_LICK.get(),
                            BLACK_FIREBALL.get()
                            )
                    .defaultStats(StandStats.class, new ArmoredStandStats.Builder()
                            .tier(5)
                            .power(14)
                            .speed(8)
                            .range(5, 5)
                            .durability(20)
                            .precision(8)
                            .armor(20.0f)
                            .armorToughness(8.0f)
                            .build())
                    .addSummonShout(InitSounds.PINE_CONE_STAND_SUMMON_VOICELINE)
                    .addOst(InitSounds.PINE_CONE_STAND_OST)
                    .build(),
                    
                    InitEntities.ENTITIES,
                    () -> new StandEntityType<PineConeStandEntity>(PineConeStandEntity::new, 0.65F, 1.7F)
                    .summonSound(InitSounds.PINE_CONE_STAND_SUMMON_SOUND)
                    .unsummonSound(InitSounds.PINE_CONE_STAND_UNSUMMON_SOUND))
            .withDefaultStandAttributes();
    

    */
    // ======================================== ??? ========================================
    public static final EntityStandRegistryObject<EntityStandType<StandStats>, StandEntityType<BlackStandEntity>> BLACK_STAND =
            new EntityStandRegistryObject<>("black_stand",
                    STANDS,
                    () -> new EntityStandType.Builder<StandStats>()
                            .color(0x0f3180)
                            .storyPartName(PART_DISCORD_NAME)
                            .leftClickHotbar(
                                    BLACK_STAND_PUNCH.get(),
                                    BLACK_STAND_BARRAGE.get(),
                                    BLACK_FIREBALL.get(),
                                    BLACK_FIREBALL_RAIN.get()
                            )
                            .rightClickHotbar(
                                    BLACK_STAND_BLOCK.get(),
                                    BLACK_JUMPSCARE.get(),
                                    BLACK_BITES_THE_DUST.get()
                            )
                            .defaultStats(StandStats.class, new StandStats.Builder()
                                    .tier(5)
                                    .power(8)
                                    .speed(10)
                                    .range(10, 15)
                                    .durability(8)
                                    .precision(16)
                                    .build())
                            .addSummonShout(InitSounds.BLACK_STAND_SUMMON_VOICELINE)
                            .addOst(InitSounds.BLACK_STAND_OST)
                            .build(),

                    InitEntities.ENTITIES,
                    () -> new StandEntityType<BlackStandEntity>(BlackStandEntity::new, 0.65F, 1.9F)
                            .summonSound(InitSounds.BLACK_STAND_SUMMON_SOUND)
                            .unsummonSound(InitSounds.BLACK_STAND_UNSUMMON_SOUND))
                    .withDefaultStandAttributes();
    
    
}
