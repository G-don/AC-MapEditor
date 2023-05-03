package graphics;


import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Cell {
    private Rectangle representation;
    private boolean painted;

    public Cell (int row, int column) {
        representation = new Rectangle(Grid.colToX(column), Grid.rowToY(row), Grid.CELL_SIZE, Grid.CELL_SIZE);
        representation.draw();
        painted = false;
    }

    public boolean isPainted() {
        return painted;
    }

    public void clear() {
        representation.draw();
        painted = false;
    }

    public void paint() {
        representation.fill();
        painted = true;
    }
}
