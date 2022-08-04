package com.h2sxxa.reed.item;

import com.h2sxxa.reed.Main;
import com.h2sxxa.reed.init.ModItem;
import com.h2sxxa.reed.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel{

    public ItemBase(String name,CreativeTabs tab){
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(tab);
        //setMaxDamage(155);
        
        ModItem.ITEMS.add(this);
    }
    @Override
    public void registerModels() {
        Main.proxy.registerItemRenderer(this, 0, "inventory");
    }
    
}