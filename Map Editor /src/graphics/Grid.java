package graphics;

public class Grid {

    public static final int CELL_SIZE = 15;
    public static final int PADDING = 10;

    private Cell[][] cells;
    private int columns;
    private int rows;

    public Grid (int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        initCells();
    }

    private void initCells() {
        cells = new Cell[rows][columns];
        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {
                cells[row][column] = new Cell(row, column);
            }
        }
    }

    public static double colToX(int column) {
        return column * CELL_SIZE + PADDING;
    }

    public static double rowToY(int row) {
        return row * CELL_SIZE + PADDING;
    }

    public void paintCell(int row, int column) {
        Cell cell = cells[row][column];
        if (cell.isPainted()) {
            cell.clear();
            return;
        }
        cell.paint();
    }

    public int getColumns() {
        return columns;
    }
    public int getRows() {
        return rows;
    }
}
