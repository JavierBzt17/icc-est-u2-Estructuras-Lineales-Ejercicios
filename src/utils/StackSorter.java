package utils;
import java.util.Stack;

public class StackSorter {

    public void sortStack(Stack<Integer> originalStack) {
        Stack<Integer> auxStack = new Stack<>();

        while (!originalStack.isEmpty()) {
            int temp = originalStack.pop();

            while (!auxStack.isEmpty() && auxStack.peek() > temp) {
                originalStack.push(auxStack.pop());
            }

            auxStack.push(temp);
        }

        while (!auxStack.isEmpty()) {
            originalStack.push(auxStack.pop());
        }
    }
}