package Collection;

import java.util.Stack;

public class StackC {
    public static void main(String[] args) {
        Stack<Integer> stack= new Stack<>();
        for (int i = 0; i < 10; i++) {
            stack.push(i);
        }
        System.out.println(stack);
        System.out.println(stack.peek());
        stack.pop();
        stack.peek();
        System.out.println(stack);

    }
}
