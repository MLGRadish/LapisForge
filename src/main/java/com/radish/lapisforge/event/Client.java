package com.radish.lapisforge.event;

import com.radish.lapisforge.gui.Gui;
import net.minecraft.client.Minecraft;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import org.lwjgl.input.Keyboard;

public class Client {

    @SubscribeEvent
    public void onUpdate(TickEvent.ClientTickEvent event)
    {
        if (Keyboard.isKeyDown(Keyboard.KEY_LCONTROL))
        {
            Minecraft.getMinecraft().displayGuiScreen(new Gui());
        }
    }
}
