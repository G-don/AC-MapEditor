package utils;

import graphics.Brush;
import graphics.Grid;

public class Playground {

    public static void main(String[] args) {
        Grid grid = new Grid(30, 30);
        Brush brush = new Brush(15, 15, grid);
        Painter painter = new Painter(brush, grid);
        KeyboardManager.initKeyEvents(painter);
    }
}
