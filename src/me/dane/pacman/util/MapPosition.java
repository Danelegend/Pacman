package me.dane.pacman.util;

public class MapPosition {

    private static int xOffset = 300;
    private static int yOffset = 82;
    private static int cellSize = 22;

    private static int xToCol(int x) {
        int col = (x - xOffset)/cellSize;
        return col;
    }

    private static int yToRow(int y) {
        int row = (y - yOffset)/cellSize;
        return row;
    }

    private static int colToX(int col) {
        int x = xOffset +  col*cellSize;
        return x;
    }

    private static int rowToY(int row) {
        int y = yOffset + row*cellSize;
        return y;
    }

    public static Coordinate getMapPos(int x, int y) {
        Coordinate coord = new Coordinate(xToCol(x), yToRow(y));
        return coord;
    }

    public static Coordinate getXYPos(int row, int col) {
        Coordinate coord = new Coordinate(colToX(col), rowToY(row));
        return coord;
    }


}
