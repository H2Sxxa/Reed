package com.h2sxxa.reed.item.special;

import javax.annotation.Nullable;

import com.h2sxxa.reed.entity.item.EntityItemConventer;
import com.h2sxxa.reed.init.ModItem;
import com.h2sxxa.reed.item.InfoFoodBase;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
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

    @Nullable
    @Override
    public Entity createEntity(World world, Entity location, ItemStack itemstack) {
        return new EntityItemConventer(world, location, itemstack,ModItem.FOOD_BEFORE);
    }

    @Override
    public boolean hasCustomEntity(ItemStack stack) {
        return true;
    }
}
