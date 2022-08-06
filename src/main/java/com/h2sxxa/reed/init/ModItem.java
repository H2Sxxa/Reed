package com.h2sxxa.reed.init;

import java.util.ArrayList;
import java.util.List;

import com.h2sxxa.reed.item.*;
import com.h2sxxa.reed.item.special.*;
import com.h2sxxa.reed.cretivetab.*;

import net.minecraft.init.MobEffects;
import net.minecraft.item.Item;
import net.minecraft.potion.PotionEffect;


public class ModItem {
    //Item
    public static final List<Item> ITEMS = new ArrayList<Item>();
    //AgriTab
    public static final Item REED = new InfoItemBase("reed", AgriTab.AgriTab);
    public static final Item REED_SEED = new CropSeedItem("reed_seed", AgriTab.AgriTab,ModBlock.REED_HERB);
    //FoodTab
    public static final Item REED_COOKIE = new PotionFoodItem("reed_cookie",5,5f,true,FoodTab.FoodTab,new PotionEffect(MobEffects.REGENERATION, 60, 2));
    public static final Item BAKED_REED_COOKIE = new InfoFoodBase("baked_reed_cookie",3,3f,true,FoodTab.FoodTab);
    public static final Item BLACK_REED_COOKIE = new DeadlyFoodItem("black_reed_cookie", 1, 0, true, FoodTab.FoodTab);
    public static final Item FOOD_BEFORE = new BeforeFoodItem("food_before", 0, 0, true, FoodTab.FoodTab);

    //OtherTab
    public static final Item REED_POWDER = new InfoItemBase("reed_powder",MaterialTab.MaterialTab);
}
