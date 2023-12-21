public class Coordinate {
    private int x;
    private int y;

    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int X() {
        return this.x;
    }

    public int Y() {
        return this.y;
    }

    public boolean within(int width, int height) {
        return 0 <= this.x && this.x <= width && 0 <= this.y && this.y <= height;
    }
}
