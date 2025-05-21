import java.util.Arrays;

public class ArrayQueue {
    private int[] items;
    private int startingIndex;
    private int endingIndex;
    private int count;

    public ArrayQueue(int capacity) {
        items = new int[capacity];
    }

    public void enqueue(int item) {
        if (items.length == endingIndex) {
            throw new IllegalStateException();
        }
        items[endingIndex] = item;
        endingIndex = (endingIndex + 1) % items.length;
        count++;
    }

    public int dequeue() {
        int item = items[startingIndex];
        items[startingIndex] = 0;
        startingIndex = (startingIndex + 1) % items.length;
        count--;
        return item;
    }

    public void printQueue() {
        System.out.println(Arrays.toString(items));
    }
}
