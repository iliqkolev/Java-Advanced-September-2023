public class Matrix {
    private int[][] matrix;

    public Matrix(int width, int height) {
        this.matrix = new int[width][height];
    }

    public int get(int row, int column) {
        return this.matrix[row][column];
    }

    public void set(int row, int column, int element) {
        this.matrix[row][column] = element;
    }
}
