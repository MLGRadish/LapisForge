package com.radish.lapisforge.gui;

import net.minecraft.client.gui.GuiScreen;

import java.io.IOException;

public class Gui extends GuiScreen{

    int x1 = 15;
    int y1 = 15;
    int x2 = x1 + 100;
    int y2 = y1 + 15;

    boolean on = false;

    @Override
    public void drawScreen(int mouseX, int mouseY, float partialTicks) {
        drawDefaultBackground();
        drawString(fontRendererObj, "Lapis Forge", (width / 2) - fontRendererObj.getStringWidth("Lapis Forge") / 2, 3,0xFFFFFF);

        if (on) {
            drawRect(x1, y1, x2, y2, 0xfff00000);
        }else{
            drawRect(x1, y1, x2, y2, 0xff006fff);
        }

        super.drawScreen(mouseX, mouseY, partialTicks);
    }


    @Override
    protected void mouseClickMove(int mouseX, int mouseY, int clickedMouseButton, long timeSinceLastClick) {

        if (on && clickedMouseButton == 0) {
            x1 = mouseX;
            y1 = mouseY;

            x2 = x1 + 100;
            y2 = y1 + 15;
        }

        super.mouseClickMove(mouseX, mouseY, clickedMouseButton, timeSinceLastClick);
    }


    @Override
    protected void mouseClicked(int mouseX, int mouseY, int mouseButton) throws IOException {

        if (mouseX > x1 && x2 > mouseX) {
            if (mouseY > y1 && y2 > mouseY) {
                if (on && mouseButton == 1) {
                    on = false;
                }

                if (on == false && mouseButton == 0){
                    on = true;
                }
            }
        }

        super.mouseClicked(mouseX, mouseY, mouseButton);
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