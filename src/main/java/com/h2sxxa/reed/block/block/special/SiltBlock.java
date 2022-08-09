package com.h2sxxa.reed.block.block.special;

import com.h2sxxa.reed.block.block.InfoBlockBase;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class SiltBlock extends InfoBlockBase{

    public SiltBlock(String name, CreativeTabs tab, Material materialIn) {
        super(name, tab, materialIn);
    }

    @Override
    public void onEntityWalk(World worldIn, BlockPos pos, Entity entityIn) {
        super.onEntityWalk(worldIn, pos, entityIn);
        System.out.println(entityIn);
    }
}
