package utils;

import graphics.Brush;
import graphics.Grid;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

public class Painter implements KeyboardHandler {

    private Brush brush;
    private Grid grid;

    public Painter(Brush brush, Grid grid) {
        this.brush = brush;
        this.grid = grid;
    }

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {
        switch (keyboardEvent.getKey()) {
            case KeyboardEvent.KEY_SPACE:
                brush.setPainting(true);
                grid.paintCell(brush.getRow(), brush.getColumn());
                break;
        }

    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {
        switch (keyboardEvent.getKey()) {
            case KeyboardEvent.KEY_UP:
                brush.goUp();
                if(brush.isPainting()){
                    grid.paintCell(brush.getRow(), brush.getColumn());
                }
                break;
            case KeyboardEvent.KEY_DOWN:
                brush.goDown();
                if(brush.isPainting()){
                    grid.paintCell(brush.getRow(), brush.getColumn());
                }
                break;
            case KeyboardEvent.KEY_LEFT:
                brush.goLeft();
                if(brush.isPainting()){
                    grid.paintCell(brush.getRow(), brush.getColumn());
                }
                break;
            case KeyboardEvent.KEY_RIGHT:
                brush.goRight();
                if(brush.isPainting()){
                    grid.paintCell(brush.getRow(), brush.getColumn());
                }
                break;
            case KeyboardEvent.KEY_SPACE:
                brush.setPainting(false);
                break;

        }
    }
}
