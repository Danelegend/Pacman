package me.dane.pacman.events;

import me.dane.pacman.statics.ScreenHandler;
import me.dane.pacman.util.Window;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ButtonClickEvent implements MouseListener {

    private JFrame f;
    private Window w;

    public ButtonClickEvent(JFrame f, Window w) {
        this.f = f;
        this.w = w;
    }

    public void mouseClicked(MouseEvent e) {
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
