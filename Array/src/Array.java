public class Array {

    private int[] items;
    private int count;

    public Array(int length) {
        items = new int[length];
    }

    public void print() {
        for(int i=0; i < count; i++) {
            System.out.println(items[i]);
        }
    }

    public void insert(int item) {
        if(count >= items.length) {
            // Copy array and add new item
            int[] arrayCopy = new int[items.length * 2];

            for(int i = 0; i<count; i++) {
                arrayCopy[i] = items[i];
            }

            items = arrayCopy;
        }

        items[count] =  item;
        count++;
    }

    public void removeAt(int index) {
        if(index < 0 || index >= count) return;

        for(int i=index; i<count; i++){
            items[i] = items[i+1];
        }
        count--;
    }

    public int indexOf(int element) {
        for(int i=0; i<count; i++) {
            if(items[i] == element) {
                return i;
            }
        }
        return -1;
    }

    public int max() {
        int max = 0;
        for (int i = 0; i < count; i++) {
            if(max < items[i]) {
                max = items[i];
            }
        }
        return max;
    }

    public int[] reverse() {
        int[] reversedItems = new int[count];
        int reversedItemCount = 0;
        for (int i=count-1; i >= 0; i--) {
            reversedItems[reversedItemCount] = items[i];
            reversedItemCount++;
        }
        return reversedItems;
    }

    public int length() {
        return count;
    }

    public int capacity() {
        return items.length;
    }

}
