package com.h2sxxa.reed.cretivetab;

import com.h2sxxa.reed.init.ModItem;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class FoodTab{
    public static final CreativeTabs FoodTab = new CreativeTabs(CreativeTabs.getNextID(),"FoodTab")
    {
        @SideOnly(Side.CLIENT)
        public ItemStack getTabIconItem()
        {
            return new ItemStack(ModItem.REED_COOKIE);
        }
    };
    
}
