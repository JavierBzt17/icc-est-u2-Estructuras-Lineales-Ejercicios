package utils;
import java.util.Stack;

public class StackSorter {

    public void sortStack(Stack<Integer> originalStack) {
        Stack<Integer> stack = new Stack<>();

        while (!originalStack.isEmpty()) {
            int temp = originalStack.pop();

            while (!stack.isEmpty() && stack.peek() > temp) {
                originalStack.push(stack.pop());
            }

            stack.push(temp);
        }

        while (!stack.isEmpty()) {
            originalStack.push(stack.pop());
        }
    }
}