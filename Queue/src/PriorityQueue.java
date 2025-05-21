import java.util.Arrays;

public class PriorityQueue {
    private int[] items;
    private int count;

    public PriorityQueue(int capacity) {
        items = new int[capacity];
    }

    public void insert(int item) {
        if(count==0) {
            items[0] = item;
        } else {
            int i;
            for (i = count - 1; i >= 0; i--) {
                if (items[i] > item) {
                    items[i + 1] = items[i];
                } else {
                    break;
                }
            }
            items[i+1] = item;
        }

        count++;
    }

    public void print() {
        System.out.println(Arrays.toString(items));
    }
}
