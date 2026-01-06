package stack;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();

        System.out.println("=== Test isEmpty & size on empty stack ===");
        System.out.println("Is empty? " + stack.isEmpty()); // true
        System.out.println("Size: " + stack.size());        // 0

        System.out.println("\n=== Test push ===");
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.display(); // expected: [ 10, 20, 30, 40 ] or top-first based on your impl
        System.out.println("Size: " + stack.size()); // 4

        System.out.println("\n=== Test peek ===");
        System.out.println("Top element: " + stack.peek()); // 40

        System.out.println("\n=== Test pop ===");
        System.out.println("Popped: " + stack.pop()); // 40
        System.out.println("Popped: " + stack.pop()); // 30
        stack.display(); // remaining elements
        System.out.println("Size: " + stack.size()); // 2

        System.out.println("\n=== Test push after pop ===");
        stack.push(99);
        stack.display();
        System.out.println("Top element: " + stack.peek()); // 99

        System.out.println("\n=== Test clear ===");
        stack.clear();
        stack.display(); // empty
        System.out.println("Is empty? " + stack.isEmpty()); // true
        System.out.println("Size: " + stack.size());        // 0

        System.out.println("\n=== Test exceptions ===");
        try {
            stack.pop();
        } catch (IllegalStateException e) {
            System.out.println("Caught exception on pop(): " + e.getMessage());
        }

        try {
            stack.peek();
        } catch (IllegalStateException e) {
            System.out.println("Caught exception on peek(): " + e.getMessage());
        }

        System.out.println("\nAll stack tests completed.");
    }
}
