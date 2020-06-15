package me.dane.pacman.objects;

import java.awt.*;
import java.util.LinkedList;

public class Wall extends GameObject {

    public Wall(float x, float y, ObjectID id) {
        super(x, y, id);
    }

    public void tick(LinkedList<GameObject> obj) {

    }

    public void render(Graphics g) {
        g.setColor(Color.BLUE);
        g.fillRect((int) x, (int) y, 22, 22);
    }

}
