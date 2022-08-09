package com.h2sxxa.reed.init;

import java.util.ArrayList;
import java.util.List;

import com.h2sxxa.reed.block.block.special.SiltBlock;
import com.h2sxxa.reed.block.herb.HerbBase;
import com.h2sxxa.reed.cretivetab.BlockTab;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlock {
    //Block
    public static final List<Block> BLOCKS = new ArrayList<Block>();
    //common
    public static final Block SILT = new SiltBlock("silt", BlockTab.BlockTab, Material.GOURD);
    //herb
    public static final Block REED_HERB = new HerbBase("reed_herb", ModItem.REED_SEED, ModItem.REED);
}
