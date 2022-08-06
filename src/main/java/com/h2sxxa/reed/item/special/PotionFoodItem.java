package com.h2sxxa.reed.item.special;

import com.h2sxxa.reed.item.InfoFoodBase;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class PotionFoodItem extends InfoFoodBase{
    PotionEffect effect;
    public PotionFoodItem(String name, int amount, float saturation, boolean iswolfFood, CreativeTabs tab,PotionEffect effect,int use_tick) {
        super(name, amount, saturation, iswolfFood, tab,use_tick);
        this.effect=effect;
    }
    
    @Override
    protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player) {
        super.onFoodEaten(stack, worldIn, player);
        if (!worldIn.isRemote){
            player.addPotionEffect(effect);
        }
    }
}
