package utils;

import java.util.LinkedList;
import java.util.Queue;

public class QueuePalindrome {

    public boolean isPalindrome(String input) {
        if (input == null) return false;
        
        String textoLimpio = input.toLowerCase().replace(" ", "");
        
        Queue<Character> cola = new LinkedList<>();

        for (int i = 0; i < textoLimpio.length(); i++) {
            cola.add(textoLimpio.charAt(i));
        }

        for (int i = textoLimpio.length() - 1; i >= 0; i--) {
            char c1 = cola.poll();
            char c2 = textoLimpio.charAt(i);

            if (c1 != c2) {
                return false;
            }
        }

        return true;
    }
}
