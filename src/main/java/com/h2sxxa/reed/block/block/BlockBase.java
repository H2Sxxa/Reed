package com.h2sxxa.reed.block.block;

import com.h2sxxa.reed.Main;
import com.h2sxxa.reed.init.ModBlock;
import com.h2sxxa.reed.init.ModItem;
import com.h2sxxa.reed.util.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHasModel{

    public BlockBase(String name,CreativeTabs tab,Material materialIn) {
        super(materialIn);
        setUnlocalizedName(name);
        setCreativeTab(tab);
        
        ModBlock.BLOCKS.add(this);
        ModItem.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }

    @Override
    public void registerModels() {
        Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
    }


}
