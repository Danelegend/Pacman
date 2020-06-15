package me.dane.pacman.objects;

import java.awt.*;
import java.util.LinkedList;

public class Special extends GameObject{

    private Image img;

    private boolean isVisible;

    public Special(float x, float y, ObjectID id) {
        super(x, y, id);
        this.isVisible = true;
    }

    public void tick(LinkedList<GameObject> obj) {

    }

    public void render(Graphics g) {
        if (isVisible) {
            g.setColor(Color.RED);
            g.fillRect((int) x, (int) y, 15, 15);
        }
    }

    public void setVisible(boolean visible) {
        this.isVisible = visible;
    }

}
