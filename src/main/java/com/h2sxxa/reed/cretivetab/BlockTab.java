package com.h2sxxa.reed.cretivetab;

import com.h2sxxa.reed.init.ModBlock;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockTab {
    public static final CreativeTabs BlockTab = new CreativeTabs(CreativeTabs.getNextID(),"BlockTab")
    {
        @SideOnly(Side.CLIENT)
        public ItemStack getTabIconItem(){
            return new ItemStack(Item.getItemFromBlock(ModBlock.SILT));
        }
    };
}
