package com.radish.lapisforge.gui;

import net.minecraft.client.gui.GuiScreen;

import java.io.IOException;

public class Gui extends GuiScreen{

    int x1 = 3;
    int y1 = 3;
    int x2 = x1 + 100;
    int y2 = y1 + 15;

    @Override
    public void drawScreen(int mouseX, int mouseY, float partialTicks) {
        drawDefaultBackground();
        drawString(fontRendererObj, "Lapis Forge", (width / 2) - fontRendererObj.getStringWidth("Lapis Forge") / 2, 3,0xFFFFFF);
        drawRect(x1, y1, x2, y2, 0xFFFF0000);
        super.drawScreen(mouseX, mouseY, partialTicks);
    }

    @Override
    protected void mouseClickMove(int mouseX, int mouseY, int clickedMouseButton, long timeSinceLastClick) {

        x1 = mouseX;
        y1 = mouseY;

        x2 = x1 + 100;
        y2 = y1 + 15;

        super.mouseClickMove(mouseX, mouseY, clickedMouseButton, timeSinceLastClick);
    }

    @Override
    public boolean doesGuiPauseGame(){
        return false;
    }

    @Override
    public void initGui() {
        super.initGui();
    }
}