package com.h2sxxa.reed.cretivetab;

import com.h2sxxa.reed.init.ModItem;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class MaterialTab {
    public static final CreativeTabs MaterialTab = new CreativeTabs(CreativeTabs.getNextID(),"MaterialTab")
    {
        @SideOnly(Side.CLIENT)
        public ItemStack getTabIconItem(){
            return new ItemStack(ModItem.REED_POWDER);
        }
    };
}
