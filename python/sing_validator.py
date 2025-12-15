class SignValidator:

    def is_valid(self, cadena: str) -> bool:
        stack = []

        par = {
            ')': '(',
            '}': '{',
            ']': '['
        }

        for char in cadena:
            if char == '(' or char == '{' or char == '[':
                stack.append(char)
            elif char == ')' or char == '}' or char == ']':
                if not stack:
                    return False
                # Aunque pase si no esta vacio?
                # compar el char con el ultimo 
                # de la pila 
                # si son el mismo tipo saco y avanzo
                # si son de otro return FALSE

                ultimo = stack.pop()

                if par [char] != ultimo:
                    return False

        return len(stack) == 0
    
