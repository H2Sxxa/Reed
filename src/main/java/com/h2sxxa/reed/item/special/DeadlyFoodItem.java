package com.h2sxxa.reed.item.special;

import com.h2sxxa.reed.item.InfoFoodBase;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class DeadlyFoodItem extends InfoFoodBase{

    public DeadlyFoodItem(String name, int amount, float saturation, boolean iswolfFood, CreativeTabs tab) {
        super(name, amount, saturation, iswolfFood, tab);
    }

    @Override
    protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player) {
        super.onFoodEaten(stack, worldIn, player);
        if (!worldIn.isRemote){
            player.setHealth(1f);
            player.addPotionEffect(new PotionEffect(MobEffects.POISON, 60, 4));
        }
    }
}
