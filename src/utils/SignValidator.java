package utils;

import java.util.Stack;

public class SignValidator {

    public boolean isValid(String signos){

        Stack<Character> stack = new Stack<Character>();

        char[] caracteres = signos.toCharArray();
        for(Character character : caracteres){
            // character -> (
            // character -> }
            // 1 -> comprobar si es de apertura o cierre
            if (getIsApertura(character)){
                //Ingresar a la pila
                stack.push(character);
            }else{
                if(stack.isEmpty()){
                    return false;
                }
                char ultimo = stack.pop(); //APERTURA
                //ultimo es del mismo tipo que character?
                // ultimo (&& character ) -> TRUE
                // ultimo [&& character ] -> TRUE
                // ultimo {&& character } -> TRUE
                // ultimo (&& character ) -> FALSE
                if(!isTipoIgual(ultimo, character)){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    private boolean getIsApertura(Character character){
        if(character == '(' || character =='[' || character == '{'){
            return true;
        }
        return false;
    }

    private boolean isTipoIgual(Character aper, Character cierre) {
        return (aper == '(' && cierre == ')') ||
               (aper == '[' && cierre == ']') ||
               (aper == '{' && cierre == '}');
    }

    

    
  
    
}
