package com.h2sxxa.reed.entity.item;

import com.h2sxxa.reed.init.ModItem;
import com.h2sxxa.reed.item.special.DeadlyFoodItem;

import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

public class EntityItemConventer extends EntityItem{
    private ItemStack stack;

    public EntityItemConventer(World world, Entity location, ItemStack stack) {
        this(world, location.posX, location.posY, location.posZ, stack);
        if (location instanceof EntityItem){
            NBTTagCompound tag = new NBTTagCompound();
            location.writeToNBT(tag);
            this.setPickupDelay(tag.getShort("PickupDelay"));
        }
        this.motionX = location.motionX;
        this.motionY = location.motionY;
        this.motionZ = location.motionZ;
        this.stack = stack;
    }

    public EntityItemConventer(World worldIn) {
        super(worldIn);
    }
    public EntityItemConventer(World worldIn, double x, double y, double z){
        super(worldIn,x,y,z);
    }

    public EntityItemConventer(World worldIn, double x, double y, double z, ItemStack stack){
        super(worldIn,x,y,z,stack);
    }

    @Override
    public void onUpdate() {
        super.onUpdate();
        int conventsize = this.stack.getCount();
        ItemStack itemstack;
        if (this.stack.getItem() instanceof DeadlyFoodItem){
            itemstack = new ItemStack(ModItem.FOOD_BEFORE);
        }
        else{
            itemstack = null;
        }
        if (itemstack != null){
            itemstack.setCount(conventsize);
            if (isInWater()){
                setItem(itemstack);
            }
        }
    }
}
