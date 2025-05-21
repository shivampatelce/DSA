import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class QueueReverser {
    public Queue<Integer> reverse(Queue<Integer> queue, int k) {
        Stack<Integer> stack = new Stack<>();
        int i;
        for(i = 0; i < k; i++) {
            stack.push(queue.remove());
        }

        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }
        for (int j = i ; j < queue.size(); j++) {
            queue.add(queue.remove());
        }
        return queue;
    }
}
