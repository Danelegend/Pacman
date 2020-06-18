package me.dane.pacman.events;

import me.dane.pacman.statics.ScreenHandler;
import me.dane.pacman.statics.StaticWindow;
import me.dane.pacman.util.Window;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ButtonClickEvent implements MouseListener {

    private JFrame menu;

    public ButtonClickEvent(JFrame menu) {
        System.out.println("yo");
        this.menu = menu;
    }

    public void mouseClicked(MouseEvent e) {
        if (ScreenHandler.getScreenNum() == 1) {

            if (e.getX() >= 160 + 450 && e.getX() <= 160+700+450 && e.getY() >= 500 && e.getY() <= 500 + 100) {
                ScreenHandler.setScreenNum(2);
                System.out.println("test");
                menu.dispose();
                StaticWindow.getWindow().checker();
            }
        }

        if (ScreenHandler.getScreenNum() == 2) {

        }
    }

    public void mousePressed(MouseEvent e) {

    }

    public void mouseExited(MouseEvent e) {

    }

    public void mouseEntered(MouseEvent e) {

    }

    public void mouseReleased(MouseEvent e) {

    }

}
