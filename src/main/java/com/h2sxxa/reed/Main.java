package com.h2sxxa.reed;

import com.h2sxxa.reed.proxy.CommonProxy;
import com.h2sxxa.reed.recipe.smelt.ModSmelt;
import com.h2sxxa.reed.util.*;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import org.apache.logging.log4j.Logger;

@Mod(modid = Main.MODID, name = Main.NAME, version=Main.VERSION)    
public class Main {
    public static final String MODID="reed";
    public static final String NAME="Reed";
    public static final String VERSION="1.0";

    public static Logger logger;
    @Instance
    public static Main instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
    public static CommonProxy proxy;

    @EventHandler
    public static void PreInit(FMLPreInitializationEvent event)
    {
        logger=event.getModLog();
    }
    @EventHandler
    public static void Init(FMLInitializationEvent event)
    {
        ModSmelt.ModSmeltInit();
    }

    @EventHandler
    public static void PostInit(FMLPostInitializationEvent event)
    {

    }

}
