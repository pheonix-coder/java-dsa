package linkedlist;

import java.util.NoSuchElementException;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        System.out.println("=== Test addFirst and addLast ===");
        list.addFirst(10);
        list.addLast(20);
        list.addFirst(5);
        list.addLast(30);
        list.display(); // [ 5, 10, 20, 30 ]

        System.out.println("\n=== Test addAt ===");
        list.addAt(0, 1);  // beginning
        list.addAt(3, 15); // middle
        list.addAt(list.size(), 40); // end
        list.display(); // [ 1, 5, 10, 15, 20, 30, 40 ]

        System.out.println("\n=== Test get ===");
        System.out.println("Element at index 0: " + list.get(0)); // 1
        System.out.println("Element at index 3: " + list.get(3)); // 15
        System.out.println("Element at last index: " + list.get(list.size() - 1)); // 40

        System.out.println("\n=== Test indexOf and contains ===");
        System.out.println("Index of 20: " + list.indexOf(20)); // 4
        System.out.println("Contains 15? " + list.contains(15)); // true
        System.out.println("Contains 99? " + list.contains(99)); // false

        System.out.println("\n=== Test removeFirst, removeLast, removeAt ===");
        System.out.println("Removed first: " + list.removeFirst()); // 1
        System.out.println("Removed last: " + list.removeLast());   // 40
        System.out.println("Removed at index 2: " + list.removeAt(2)); // 15
        list.display(); // [ 5, 10, 20, 30 ]

        System.out.println("\n=== Test removeValue ===");
        System.out.println("Remove 10? " + list.removeValue(10)); // true
        System.out.println("Remove 99? " + list.removeValue(99)); // false
        list.display(); // [ 5, 20, 30 ]

        System.out.println("\n=== Test reverse ===");
        list.reverse();
        list.display(); // [ 30, 20, 5 ]

        System.out.println("\n=== Test size, isEmpty, clear ===");
        System.out.println("Size: " + list.size());     // 3
        System.out.println("Is empty? " + list.isEmpty()); // false
        list.clear();
        System.out.println("Cleared list");
        list.display(); // [ ]

        System.out.println("\n=== Test exceptions ===");
        try {
            list.removeFirst();
        } catch (NoSuchElementException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }

        try {
            list.get(0);
        } catch (NoSuchElementException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }

        try {
            list.addAt(1, 100);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }

        System.out.println("\nAll tests completed.");
    }
}
