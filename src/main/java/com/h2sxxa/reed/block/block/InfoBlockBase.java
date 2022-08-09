package com.h2sxxa.reed.block.block;

import java.util.List;

import net.minecraft.block.material.Material;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import org.lwjgl.input.Keyboard;

public class InfoBlockBase extends BlockBase{
    String key;
    public InfoBlockBase(String name, CreativeTabs tab, Material materialIn) {
        super(name, tab, materialIn);
        this.key=name.concat(".info.reed");
    }
    
    @SideOnly(Side.CLIENT)
    @Override
    public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
        super.addInformation(stack, worldIn, tooltip, flagIn);
        if(Keyboard.isKeyDown(Keyboard.KEY_LSHIFT) && I18n.hasKey(key.concat(".hide")))
        {
            for (String strline:I18n.format(key.concat(".hide")).split("/n"))
            {
                tooltip.add(strline);
            }
        }
        else if (I18n.hasKey(key))
        {
            for (String strline:I18n.format(key).split("/n"))
            {
                tooltip.add(strline);
            }
        }
    }
}
