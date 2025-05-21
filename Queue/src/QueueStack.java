import java.util.Stack;

public class QueueStack {

    private Stack<Integer> stack1 = new Stack<>();
    private Stack<Integer> stack2 = new Stack<>();

    public void enqueue(int item) {
        stack1.add(item);
    }

    public int dequeue() {
        if(stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.add(stack1.pop());
            }
        }

        return stack2.pop();
    }
    // q - [20, 30, 40, 50]
    // s1 - [40, 50]
    // s2 - [30, 20]

}
