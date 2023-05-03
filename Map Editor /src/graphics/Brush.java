package graphics;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Ellipse;

public class Brush {

    private Ellipse representation;
    private Grid grid;
    private boolean painting;
    private int column;
    private int row;

    public Brush(int column, int row, Grid grid) {
        representation = new Ellipse(Grid.colToX(column), Grid.rowToY(row), Grid.CELL_SIZE, Grid.CELL_SIZE);
        representation.setColor(Color.GREEN);
        representation.fill();
        this.grid = grid;
        this.column = column;
        this.row = row;
        painting = false;
    }

    public void goUp() {
        if (row == 0) {
            return;
        }
        row--;
        representation.translate(0, -Grid.CELL_SIZE);
    }
    public void goDown() {
        if (row == grid.getRows() -1) {
            return;
        }
        row++;
        representation.translate(0, Grid.CELL_SIZE);
    }

    public void goRight() {
        if (column == grid.getColumns() -1) {
            return;
        }
        column++;
        representation.translate(Grid.CELL_SIZE, 0);
    }
    public void goLeft() {
        if(column == 0) {
            return;
        }
        column--;
        representation.translate(-Grid.CELL_SIZE, 0);

    }

    public int getColumn() {
        return column;
    }

    public int getRow() {
        return row;
    }

    public boolean isPainting() {
        return painting;
    }

    public void setPainting(boolean painting) {
        this.painting = painting;
    }
}
