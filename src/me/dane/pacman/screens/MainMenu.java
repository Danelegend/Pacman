package me.dane.pacman.screens;

import java.awt.*;

public class MainMenu extends Menu {

    public MainMenu() {
        inMain();
    }

    private void inMain() {
        this.setBackground(Color.BLUE);
        setBackground("...");
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        for(int i = 0; i < this.getHeight(); i = i + 50) {
            g.setColor(Color.YELLOW);
            g.fillRect(25, i, 25, 25);
            g.fillRect(this.getWidth()-25, i, 25, 25);
        }
    }
}
