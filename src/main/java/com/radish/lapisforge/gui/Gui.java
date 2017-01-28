package com.radish.lapisforge.gui;

import net.minecraft.client.gui.GuiScreen;

public class Gui extends GuiScreen{

    @Override
    public void drawScreen(int mouseX, int mouseY, float partialTicks) {
        //drawDefaultBackground();
        int centerY = height / 2;
        int centerX = width / 2;
        drawString(fontRendererObj, "Lapis Forge", (width / 2) - fontRendererObj.getStringWidth("Lapis Forge") / 2, 3,0xFFFFFF);
        drawRect(3,3, 100, 25, 0xFFFF0000);
        super.drawScreen(mouseX, mouseY, partialTicks);
    }

    @Override
    public void initGui() {
        super.initGui();
    }

    @Override
    public boolean doesGuiPauseGame(){
        return false;
    }

    public void drawCategory() {

    }
}