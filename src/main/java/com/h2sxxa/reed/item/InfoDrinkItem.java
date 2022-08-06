package com.h2sxxa.reed.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemStack;

public class InfoDrinkItem extends InfoFoodBase{


    public InfoDrinkItem(String name, int amount, float saturation, boolean iswolfFood, CreativeTabs tab,int drink_tick) {
        super(name, amount, saturation, iswolfFood, tab, drink_tick);
    }
    
    @Override
    public EnumAction getItemUseAction(ItemStack stack) {
        return EnumAction.DRINK;
    }
}
