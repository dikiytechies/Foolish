package com.dikiytechies.foolish.init;

import com.dikiytechies.foolish.AddonMain;
import com.dikiytechies.foolish.effect.ModEffects;
import com.dikiytechies.foolish.item.ModItems;
import com.github.standobyte.jojo.crafting.PotionBrewingRecipe;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Potion;
import net.minecraft.potion.Potions;
import net.minecraftforge.common.brewing.BrewingRecipeRegistry;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import javax.annotation.Nullable;

public class InitPotions {
    public static final DeferredRegister<Potion> POTIONS = DeferredRegister.create(ForgeRegistries.POTION_TYPES, AddonMain.MOD_ID);

    public static final RegistryObject<Potion> DIARRHEA_POTION = POTIONS.register("diarrhea",
            () -> new Potion(new EffectInstance(ModEffects.DIARRHEA.get(), 9600, 0)));

    public static final RegistryObject<Potion> DIARRHEA_LONG_POTION = POTIONS.register("long_diarrhea",
            () -> new Potion(new EffectInstance(ModEffects.DIARRHEA.get(), 28800, 0)));

    public static final RegistryObject<Potion> DIARRHEA_STRONG_POTION = POTIONS.register("strong_diarrhea",
            () -> new Potion(new EffectInstance(ModEffects.DIARRHEA.get(), 9600

                    , 1)));


    public static void registerRecipes() {
        registerRecipes(Potions.AWKWARD, ModItems.DIARY.get(), DIARRHEA_POTION.get(), DIARRHEA_LONG_POTION.get(), DIARRHEA_STRONG_POTION.get());
    }

    private static void registerRecipes(Potion initialPotion, Item initialIngredient,
                                        Potion basePotion, @Nullable Potion longPotion, @Nullable Potion strongPotion) {
        BrewingRecipeRegistry.addRecipe(new PotionBrewingRecipe(initialPotion, initialIngredient, basePotion)
                .withLongPotion(longPotion).withStrongPotion(strongPotion));
    }
}
