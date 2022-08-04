package com.h2sxxa.reed.item;

import com.h2sxxa.reed.Main;
import com.h2sxxa.reed.init.ModItem;
import com.h2sxxa.reed.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

public class FoodBase extends ItemFood implements IHasModel{
    public FoodBase(String name, int amount, float saturation, boolean iswolfFood,CreativeTabs tab){
        super(amount,saturation,iswolfFood);
        setCreativeTab(tab);
        setUnlocalizedName(name);
        setRegistryName(name);

        ModItem.ITEMS.add(this);
    }

    @Override
    public void registerModels() {
        Main.proxy.registerItemRenderer(this, 0, "inventory");
    }

}
