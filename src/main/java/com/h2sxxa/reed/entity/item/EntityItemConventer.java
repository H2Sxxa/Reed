package com.h2sxxa.reed.entity.item;

import javax.annotation.Nullable;

import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.world.World;

public class EntityItemConventer extends EntityItem{
    private ItemStack stack;
    private Item targetitem;

    public EntityItemConventer(World world, Entity location, ItemStack stack,@Nullable Item targetitem) {
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
        this.targetitem=targetitem;
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
        ItemStack targetstack;
        if (this.targetitem != null) {
            targetstack = new ItemStack(this.targetitem);
        }
        else {
            targetstack = null;
        }

        if (targetstack != null) {
            //if (this.world.isRemote){this.world.spawnParticle(EnumParticleTypes.EXPLOSION_NORMAL,this.posX,this.posY,this.posZ, 1d, 1d,1d, null);}
            targetstack.setCount(this.stack.getCount());
            if (isInWater()){
                setItem(targetstack);
            }
        }
    }
}
