package com.h2sxxa.reed.item.special;

import com.h2sxxa.reed.item.InfoFoodBase;

import net.minecraft.client.resources.I18n;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;


public class BeforeFoodItem extends InfoFoodBase{
    public BeforeFoodItem(String name, int amount, float saturation, boolean iswolfFood, CreativeTabs tab) {
        super(name, amount, saturation, iswolfFood, tab, amount);
    }
    
    @Override
    protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player) {
        super.onFoodEaten(stack, worldIn, player);
        if (!worldIn.isRemote){
            player.setHealth(0);
            ITextComponent message = new TextComponentString(I18n.format("dead.beforefood.message").replaceAll("<player_name>", player.getDisplayNameString()));
            player.sendMessage(message);
        }
    }
}
