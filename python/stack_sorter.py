class StackSorter:
    def sort_stack(self, original_stack):
        aux_stack = []

        while original_stack:
            temp = original_stack.pop()

            while aux_stack and aux_stack[-1] > temp:
                original_stack.append(aux_stack.pop())

            aux_stack.append(temp)

        while aux_stack:
            original_stack.append(aux_stack.pop())