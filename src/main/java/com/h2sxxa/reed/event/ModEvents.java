package com.h2sxxa.reed.event;

import java.util.Random;

import com.h2sxxa.reed.Main;
import com.h2sxxa.reed.init.ModItem;
import com.h2sxxa.reed.item.special.DeadlyFoodItem;

import net.minecraft.block.BlockTallGrass;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.item.ItemEvent;
import net.minecraftforge.event.world.BlockEvent.HarvestDropsEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;


@Mod.EventBusSubscriber(modid = Main.MODID)
public final class ModEvents {
    private static Random EventRandom = new Random();
    /*
    * @SubscribeEvent
    * public static void onEventDeath(LivingDeathEvent event){}
    */
    @SubscribeEvent
    public static void DropSeed(HarvestDropsEvent event) {
        if(event.getState().getBlock() instanceof BlockTallGrass)
        {
            if (EventRandom.nextInt(7) == 0) {
                event.getDrops().add(new ItemStack(ModItem.REED_SEED));
            }
        }
    }

    @SubscribeEvent
    public static void ItemConvent(ItemEvent event){
        if (event.getEntityItem().getItem().getItem() instanceof DeadlyFoodItem){
            if (event.getEntityItem().isOverWater()){
                event.getEntityItem().setItem(new ItemStack(ModItem.FOOD_BEFORE));
            }
        }
    }

    /* pre to use
     * @SubscribeEvent
     * @SideOnly(Side.CLIENT)
     * public static void ToolTipHandle(ItemTooltipEvent event) {
     *      if (event.getEntityPlayer() != null){
     *      ...
     *   }
     * }
     */
}
