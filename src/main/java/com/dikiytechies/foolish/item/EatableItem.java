package com.dikiytechies.foolish.item;

import com.dikiytechies.foolish.effect.ModEffects;
import com.github.standobyte.jojo.action.ActionConditionResult;
import com.github.standobyte.jojo.init.power.non_stand.ModPowers;
import com.github.standobyte.jojo.init.power.stand.ModStands;
import com.github.standobyte.jojo.power.IPower;
import com.github.standobyte.jojo.power.impl.nonstand.INonStandPower;
import com.github.standobyte.jojo.power.impl.stand.IStandPower;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;

import java.util.UUID;

import static com.github.standobyte.jojo.action.Action.conditionMessage;
import static com.github.standobyte.jojo.init.power.stand.ModStands.THE_WORLD;

public class EatableItem extends Item {
    public EatableItem(Properties p_i48487_1_) { super(p_i48487_1_); }

    @Override
    public ActionResult<ItemStack> use(World world, PlayerEntity player, Hand hand) {
        ItemStack item = player.getItemInHand(hand);
        int exitCode = 1;
        if (IStandPower.getPlayerStandPower(player).getType() == ModStands.THE_WORLD.getStandType()) {
            exitCode = 2;
            if (IStandPower.getPlayerStandPower(player).getResolveLevel() == 4) {
                exitCode = 3;
                if (player.getY() >= 200) {
                    exitCode = 4;
                    if (world.getDayTime() % 24000 >= 13000 && world.getDayTime() % 24000 <= 23500) {
                        exitCode = 5;
                        if (player.getHealth() >= player.getMaxHealth()) {
                            exitCode = 6;
                            if (player.getFoodData().getFoodLevel() >= 20 ||
                                    (INonStandPower.getPlayerNonStandPower(player).getType() == ModPowers.VAMPIRISM.get() &&
                                            INonStandPower.getPlayerNonStandPower(player).getEnergy() >= INonStandPower.getPlayerNonStandPower(player).getMaxEnergy() * 0.99)) {
                                exitCode = 7;
                                if (player.experienceLevel >= 25) {
                                    exitCode = 8;
                                    if (IStandPower.getPlayerStandPower(player).getStamina() <= IStandPower.getPlayerStandPower(player).getMaxStamina() / 20) {
                                        player.startUsingItem(hand);
                                        return ActionResult.consume(item);
                                    }
                                }
                                System.out.println(exitCode);
                            }
                        }
                    }
                }
            }
        }
        switch (exitCode) {
            case 1:
                player.displayClientMessage(new TranslationTextComponent("foolish.message.no_the_world"), true);
                break;
            case 2:
                player.displayClientMessage(new TranslationTextComponent("foolish.message.no_resolve_level"), true);
                break;
            case 3:
                player.displayClientMessage(new TranslationTextComponent("foolish.message.no_y"), true);
                break;
            case 4:
                player.displayClientMessage(new TranslationTextComponent("foolish.message.no_night"), true);
                break;
            case 5:
                player.displayClientMessage(new TranslationTextComponent("foolish.message.no_max_health"), true);
                break;
            case 6:
                player.displayClientMessage(new TranslationTextComponent("foolish.message.no_food_level"), true);
                break;
            case 7:
                player.displayClientMessage(new TranslationTextComponent("foolish.message.no_experience"), true);
                break;
            case 8:
                player.displayClientMessage(new TranslationTextComponent("foolish.message.no_weakness"), true);
                break;
        }
        return ActionResult.fail(item);
    }
    @Override
    public ItemStack finishUsingItem(ItemStack stack, World world, LivingEntity entityLiving) {
        super.finishUsingItem(stack,world,entityLiving);
        entityLiving.addEffect(new EffectInstance(ModEffects.DIARRHEA.get(), 999999, 0, true, false));
        return stack;
    }
}
