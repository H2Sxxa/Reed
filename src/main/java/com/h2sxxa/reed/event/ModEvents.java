package com.h2sxxa.reed.event;

import java.util.Random;

import com.h2sxxa.reed.Main;
import com.h2sxxa.reed.init.ModItem;

import net.minecraft.block.BlockTallGrass;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.world.BlockEvent.HarvestDropsEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;


@Mod.EventBusSubscriber(modid = Main.MODID)
public final class ModEvents {
    private static Random EventRandom = new Random();
    @SubscribeEvent
    public static void DropSeed(HarvestDropsEvent event) {
        if(event.getState().getBlock() instanceof BlockTallGrass)
        {
            if (EventRandom.nextInt(7) == 0) {
                event.getDrops().add(new ItemStack(ModItem.REED_SEED));
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
