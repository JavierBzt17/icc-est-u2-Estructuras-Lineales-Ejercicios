from sing_validator import SignValidator
from stack_sorter import StackSorter

def run_sign_validator():
    print("\n--- Ejercicio 1 ---")
    signValidator  = SignValidator()
    cadena1 = "{[()]}"
    cadena2 = "{[(])}"

    print("Cadena: " + cadena1 + " es valida? " + str(signValidator.is_valid(cadena1)))
    print("Cadena: " + cadena2 + " es valida? " + str(signValidator.is_valid(cadena2)))

def run_stack_sorter():
    print("\n--- Ejercicio 2 ---")
    sorter = StackSorter()
    
    stack = [5, 1, 4, 2]
    
    print("Stack original: " + str(stack))
    sorter.sort_stack(stack)
    print("Stack ordenado: " + str(stack))

if __name__ == "__main__":
    run_sign_validator()
    run_stack_sorter()