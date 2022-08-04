package com.h2sxxa.reed.item.special;

import java.util.ArrayList;

import com.h2sxxa.reed.item.InfoFoodBase;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class MultPotionFoodItem extends InfoFoodBase{

    ArrayList<PotionEffect> effectlist;

    public MultPotionFoodItem(String name, int amount, float saturation, boolean iswolfFood, CreativeTabs tab, ArrayList<PotionEffect> effectlist) {
        super(name, amount, saturation, iswolfFood, tab);
        this.effectlist=effectlist;
    }
    @Override
    protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player) {
        super.onFoodEaten(stack, worldIn, player);
        if (!worldIn.isRemote){
            for (PotionEffect effect:effectlist){
                player.addPotionEffect(effect);
            }
        }
    }
}
