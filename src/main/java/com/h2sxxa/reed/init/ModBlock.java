package com.h2sxxa.reed.init;

import java.util.ArrayList;
import java.util.List;

import com.h2sxxa.reed.block.herb.HerbBase;

import net.minecraft.block.Block;

public class ModBlock {
    //Block
    public static final List<Block> BLOCKS = new ArrayList<Block>();
    //common

    //herb
    public static final Block REED_HERB = new HerbBase("reed_herb", ModItem.REED_SEED, ModItem.REED);
}
