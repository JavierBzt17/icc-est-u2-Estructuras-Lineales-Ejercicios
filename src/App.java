import java.util.Stack;

import utils.QueuePalindrome;
import utils.SignValidator;
import utils.StackSorter;

public class App {
    public static void main(String[] args) throws Exception {
        SignValidator signValidator = new SignValidator();
        runSignValidator();

        StackSorter stackSorter = new StackSorter();
        runStackSorter();

        
    }

    

    private static void runSignValidator() {
        System.out.println("Ejercicio 1");
        SignValidator signValidator = new SignValidator();
        String cadena1 = "{[()]}"; // VALIDO
        String cadena2 = "{[(])}"; // NO VALIDO

        System.out.println("Cadena: " + cadena1 + " es valida? " + signValidator.isValid(cadena1));
        System.out.println("Cadena: " + cadena2 + " es valida? " + signValidator.isValid(cadena2));
        System.out.println("\n");
    }

    private static void runStackSorter() {
        System.out.println("Ejercicio 2");
        StackSorter sorter = new StackSorter();
        Stack<Integer> stack = new Stack<>();
        
        stack.push(2);
        stack.push(4);
        stack.push(1);
        stack.push(5);

        System.out.println("Stack original: " + stack);
        
        sorter.sortStack(stack);
        
        System.out.println("Stack ordenado: " + stack);
        System.out.println("Tope actual: " + stack.peek());
        System.out.println("\n");
    }
}