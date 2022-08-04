package com.h2sxxa.reed.item;

import java.util.List;
import java.util.Map;

import org.lwjgl.input.Keyboard;

import com.h2sxxa.reed.tool.MiscTool;

import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class DynInfoItemBase extends ItemBase{
    String key;
    Map<String,?> Element;
    public DynInfoItemBase(String name, CreativeTabs tab,Map<String,?> Element) {
        super(name, tab);
        this.key=name.concat(".info.reed");
    }

    @Override
    public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
        super.addInformation(stack, worldIn, tooltip, flagIn);
        if(Keyboard.isKeyDown(Keyboard.KEY_LSHIFT) && I18n.format(key.concat(".hide.ctrl"))=="true"){
            for (String i:I18n.format(key.concat(".hide")).split("/n")){
                i=MiscTool.updateKeyString(Element,i);
                tooltip.add(i);
            }
        }else{
            for (String i:I18n.format(key).split("/n")){
                i=MiscTool.updateKeyString(Element,i);
                tooltip.add(i);
            }
        }
    }
}
