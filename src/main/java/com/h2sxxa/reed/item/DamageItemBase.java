package com.h2sxxa.reed.item;

import net.minecraft.creativetab.CreativeTabs;

public class DamageItemBase extends InfoItemBase{

    public DamageItemBase(String name, CreativeTabs tab,int maxDamageIn) {
        super(name, tab);
        setMaxDamage(maxDamageIn);
    }

    @Override
    public boolean isDamageable() {
        return true;
    }
}
