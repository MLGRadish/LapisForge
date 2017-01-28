package com.radish.lapisforge.proxy;

import com.radish.lapisforge.event.Client;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

public class ClientProxy extends CommonProxy{

    @Override
    public void preInit(FMLInitializationEvent event) {

    }

    @Override
    public void init(FMLInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(new Client());
    }

    @Override
    public void postInit(FMLInitializationEvent event) {

    }
}