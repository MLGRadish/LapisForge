package com.radish.lapisforge;

import com.radish.lapisforge.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = LapisForge.MODID, version = LapisForge.VERSION, name = LapisForge.NAME)
public class LapisForge {
    public static final String MODID = "lapisforge";
    public static final String VERSION = "1.0";
    public static final String NAME = "Lapis Forge";

    @SidedProxy(clientSide = "com.radish.lapisforge.proxy.ClientProxy", serverSide = "com.radish.lapisforge.proxy.CommonProxy")
    public static CommonProxy proxy;

    @Mod.Instance
    public static LapisForge instance;

    @Mod.EventHandler
    public void preInit(FMLInitializationEvent event) {
        proxy.preInit(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init(event);
        System.out.println("Lapis Forge Loaded!");
    }

    @Mod.EventHandler
    public void postInit(FMLInitializationEvent event) {
        proxy.postInit(event);
    }
}
