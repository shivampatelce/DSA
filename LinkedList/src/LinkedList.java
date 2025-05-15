import java.util.Objects;

public class LinkedList {
    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        private void setNextNode(Node node) {
            this.next = node;
        }
    }

    private Node first;
    private Node last;
    private int size;

    public void add(int value) {
        Node node = new Node(value);
        if(first == null) {
            first = last = node;
        } else {
            last.next = node;
            last = node;
        }
        size++;
    }

    public void addFirst(int value) {
        Node node = new Node(value);

        if(first == null) {
            first = last = node;
        } else {
            node.next = first;
            first = node;
        }
        size++;
    }

    public int indexOf(int value) {
        Node currentNode = first;
        int currentNodeIndex = 0;
        while (currentNode != null){
            if(currentNode.value == value) {
                return currentNodeIndex;
            } else {
                currentNode = currentNode.next;
                currentNodeIndex++;
            }
        }
        return -1;
    }

    public boolean contains(int value) {
        Node currentNode = first;
        while (currentNode != null){
            if(currentNode.value == value) {
                return true;
            }
            currentNode = currentNode.next;
        }
        return false;
    }

    public void removeFirst() {
        if(first == null) {
            return;
        }

        if(first == last){
            first = last = null;
            return;
        }

        Node second = first.next;
        first.next = null;
        first = second;
        size--;
    }

    public void removeLast() {
        if(first == null) {
            return;
        }

        if(first == last){
            first = last = null;
            return;
        }

        Node currentNode = first;
        while (currentNode.next != last) {
            currentNode = currentNode.next;
        }
        currentNode.next = null;
        last = currentNode;
        size--;
    }

    public int size() {
        return size;
    }

    public int[] toArray() {
        int[] array = new int[size];
        Node currentNode = first;
        int index = 0;
        while (currentNode != null) {
            array[index] = currentNode.value;
            index++;
            currentNode = currentNode.next;
        }
        return array;
    }

    public void reverse() {
        if(first.next == null) return;

        Node previousNode = first;
        Node currentNode = previousNode.next;
        Node nextNode = currentNode.next;
        while (currentNode != null){
            currentNode.next = previousNode;

            previousNode = currentNode;
            currentNode = nextNode;
            if(nextNode != null) {
                nextNode = nextNode.next;
            }
        }
        last = first;
        last.next = null;
        first = previousNode;
    }

    public int getKthFromEnd(int k){
        if(k >= size() || k < 0) return -1;

        Node currentNode = first;
        Node lastTrackingNode = first;
        for (int i =0; i<k; i++) {
            lastTrackingNode = lastTrackingNode.next;
        }

        while (lastTrackingNode != last) {
            currentNode = currentNode.next;
            lastTrackingNode = lastTrackingNode.next;
        }

        return currentNode.value;
    }

    public void printMiddle() {
        if(first == null) return;
        Node slow = first;
        Node fast = first;

        while (fast != null) {
            if(fast.next != null) {
                fast = fast.next;
            } else {
                System.out.println(slow.value);
                break;
            }

            if(fast.next != null) {
                fast = fast.next;
            } else {
                System.out.println(slow.value);
                System.out.println(slow.next.value);
                break;
            }
            slow = slow.next;
        }

    }
}
