public class List {
    private static final int INITIAL_CAPACITY = 4;

    private int[] data;
    private int index;

    public List() {
        this.data = new int[INITIAL_CAPACITY];
        this.index = 0;
    }

    public List(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Error");
        }

        this.data = new int[capacity];
        this.index = 0;
    }

    public void add(int element) {
        if (this.index >= this.data.length) {
            this.grow();
        }

        this.data[this.index] = element;
        this.index++;
    }

    private void grow() {
        int[] newArray = new int[this.data.length * 2];

        for (int index = 0; index < this.data.length; index++) {
            newArray[index] = this.data[index];
        }

        this.data = newArray;
    }
}
