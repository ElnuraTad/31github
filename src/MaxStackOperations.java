import java.util.EmptyStackException;
import java.util.Scanner;
import java.util.Stack;

public class MaxStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt(); // number of requests

        MaxStack stack = new MaxStack();

        for (int i = 0; i < q; i++) {
            String query = scanner.next();
            if (query.equals("push")) {
                int value = scanner.nextInt();
                stack.push(value);
            } else if (query.equals("pop")) {
                stack.pop();
            } else if (query.equals("max")) {
                System.out.println(stack.max());
            }
        }
    }
}

class MaxStack {
    private Stack<Integer> stack;
    private Stack<Integer> maxStack;

    public MaxStack() {
        stack = new Stack<>();
        maxStack = new Stack<>();
    }

    public void push(int value) {
        stack.push(value);
        if (maxStack.isEmpty() || value >= maxStack.peek()) {
            maxStack.push(value);
        }
    }

    public void pop() {
        if (stack.isEmpty()) {
            throw new EmptyStackException();
        }

        int value = stack.pop();
        if (value == maxStack.peek()) {
            maxStack.pop();
        }
    }

    public int max() {
        if (maxStack.isEmpty()) {
            throw new EmptyStackException();
        }
        return maxStack.peek();
    }
}
