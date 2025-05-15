import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        linkedList.add(40);
//        linkedList.add(50);
//        System.out.println(linkedList.indexOf(10));
//        System.out.println(linkedList.indexOf(40));
//        System.out.println(linkedList.contains(30));
//        linkedList.removeLast();
//        System.out.println(linkedList.size());
        linkedList.reverse();
//        System.out.println(Arrays.toString(linkedList.toArray()));
//        System.out.println(linkedList.getKthFromEnd(1));
        linkedList.printMiddle();
    }
}
