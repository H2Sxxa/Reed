package com.h2sxxa.reed.init;

import java.util.ArrayList;
import java.util.List;

import com.h2sxxa.reed.item.*;

import com.h2sxxa.reed.cretivetab.*;
import net.minecraft.item.Item;



public class ModItem {
    //Item
    public static final List<Item> ITEMS = new ArrayList<Item>();
    //public static final Item MISCANTHUS_SACCHARIFLORUS = new InfoDescBase("miscanthus_sacchariflorus", FoodTab);
    //AgriTab
    public static final Item REED = new InfoDescBase("reed", AgriTab.AgriTab);
    public static final Item REED_SEED = new InfoDescBase("reed_seed", AgriTab.AgriTab);
    //FoodTab
    public static final Item REED_COOKIE = new InfoFoodBase("reed_cookie",5,5f,false,FoodTab.FoodTab);

}
