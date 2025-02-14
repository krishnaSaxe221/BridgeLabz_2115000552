import java.util.Stack;

class RecursiveStackSorter { // Unique class name

    // Function to sort the stack recursively
    public static void sortStack(Stack<Integer> stack) {
        if (!stack.isEmpty()) {
            int temp = stack.pop(); // Pop the top element
            sortStack(stack);       // Recursively sort the remaining stack
            insertInSortedOrder(stack, temp); // Insert the popped element correctly
        }
    }

    // Helper function to insert an element in sorted order
    private static void insertInSortedOrder(Stack<Integer> stack, int element) {
        if (stack.isEmpty() || stack.peek() <= element) {
            stack.push(element);
        } else {
            int temp = stack.pop(); // Remove top element
            insertInSortedOrder(stack, element); // Recursively insert at the correct place
            stack.push(temp); // Push the popped element back
        }
    }

    // Main function to test the sorting
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(30);
        stack.push(10);
        stack.push(50);
        stack.push(20);
        stack.push(40);

        System.out.println("Original Stack: " + stack);
        sortStack(stack);
        System.out.println("Sorted Stack: " + stack);
    }
}

