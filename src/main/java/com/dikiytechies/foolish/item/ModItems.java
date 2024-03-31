package com.dikiytechies.foolish.item;

import com.dikiytechies.foolish.AddonMain;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.Rarity;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, AddonMain.MOD_ID);


    public static final RegistryObject<Item> DIARY = ITEMS.register("diary", () -> new
            EatableItem(new Item.Properties().rarity(Rarity.EPIC).stacksTo(1).tab(AddonMain.GROUP).
            food(new Food.Builder().saturationMod(20).nutrition(20).alwaysEat().build())));


    public static void register(IEventBus modEventbus) {
        ITEMS.register(modEventbus);
    }
}
