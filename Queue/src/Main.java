import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
//        Queue<Integer> queue = new ArrayDeque<>();
//        queue.add(10);
//        queue.add(20);
//        queue.add(30);
//        reverse(queue);
//        System.out.println(queue);


//        ArrayQueue arrayQueue = new ArrayQueue(5);
//        arrayQueue.enqueue(10);
//        arrayQueue.enqueue(20);
//        arrayQueue.enqueue(30);
//        arrayQueue.enqueue(40);
//        arrayQueue.enqueue(50);
//        arrayQueue.dequeue();
//        arrayQueue.enqueue(60);
//        arrayQueue.printQueue();

//        QueueStack queueStack = new QueueStack();
//        queueStack.enqueue(10);
//        queueStack.enqueue(20);
//        queueStack.enqueue(30);
//        queueStack.enqueue(40);
//        queueStack.dequeue();
//        queueStack.print();

//        PriorityQueue priorityQueue = new PriorityQueue(10);
//        priorityQueue.insert(3);
//        priorityQueue.insert(4);
//        priorityQueue.insert(5);
//        priorityQueue.insert(1);
//        priorityQueue.print();

//        Queue<Integer> queue = new ArrayDeque<>();
//        queue.add(10);
//        queue.add(20);
//        queue.add(30);
//        queue.add(40);
//        queue.add(50);
//
//        QueueReverser queueReverser = new QueueReverser();
//
//        System.out.println(queueReverser.reverse(queue,3));

        LinkedListQueue linkedListQueue = new LinkedListQueue();
        linkedListQueue.enqueue(10);
        linkedListQueue.enqueue(20);
        linkedListQueue.enqueue(30);
        linkedListQueue.enqueue(40);
        linkedListQueue.dequeue();
        linkedListQueue.dequeue();

        linkedListQueue.print();
    }

    public static void reverse(Queue<Integer> queue){
        Stack<Integer> stack = new Stack<>();
        while (!queue.isEmpty()) {
            stack.push(queue.remove());
        }

        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }
    }
}
