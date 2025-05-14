import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Array array = new Array(1);
        array.insert(10);
        array.insert(20);
        array.insert(30);
        array.insert(40);
        array.insert(50);
        array.removeAt(4);
        array.removeAt(500);
        array.insert(50);
        array.insert(50);
        array.print();
        System.out.println("Length: "+array.length());
        System.out.println("Capacity: "+array.capacity());
        System.out.println("Max: "+array.max());
//        System.out.println(array.indexOf(50));

//        Reverse an array
//        int[] reversedArray = array.reverse();
//        for (int i=0; i<array.length();i++) {
//            System.out.println(reversedArray[i]);
//        }
    }
}
