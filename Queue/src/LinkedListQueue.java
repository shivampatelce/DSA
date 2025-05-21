public class LinkedListQueue {
    private class Node {
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }

        public void setNext(Node nextNode) {
            next = nextNode;
        }
    }

    private Node first;
    private Node last;
    private int size;

    public void enqueue(int item) {
        Node node = new Node(item);
        if(first == null) {
            first = last = node;
        } else {
            last.next = node;
            last = node;
        }
        size++;
    }

    public int dequeue() {
        Node firstQueue = first;
        if(first == last) {
            first = last = null;
        } else {
            first = first.next;
        }
        size--;
        return firstQueue.value;
    }

    public void print() {
        Node currentNode = first;
        while (currentNode != null) {
            System.out.println(currentNode.value);
            currentNode = currentNode.next;
        }
    }
}
