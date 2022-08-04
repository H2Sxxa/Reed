package com.h2sxxa.reed.recipe.smelt;

import com.h2sxxa.reed.init.ModItem;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModSmelt {
    public static void ModSmeltInit() {
        GameRegistry.addSmelting(ModItem.REED_COOKIE, new ItemStack(ModItem.BAKED_REED_COOKIE), 4.0f);
        GameRegistry.addSmelting(ModItem.BAKED_REED_COOKIE, new ItemStack(ModItem.BLACK_REED_COOKIE), 4.0f);
    }
}
