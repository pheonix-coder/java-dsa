package linkedlist;

public class Main {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();

        System.out.println("=== Testing Add ===");
        l.addAt(0, 999); // list: [999]
        l.addFirst(1); // list: [1, 999]
        l.addLast(42); // list: [1, 999, 42]
        l.addAt(1, 55); // list: [1, 55, 999, 42]
        l.display(); // should print: [1, 55, 999, 42]

        System.out.println("\n=== Testing Remove ===");
        l.removeFirst(); // removes 1 -> [55, 999, 42]
        l.removeLast(); // removes 42 -> [55, 999]
        l.removeAt(1); // removes 999 -> [55]
        l.display(); // should print: [55]

        System.out.println("\n=== Testing removeValue ===");
        l.addLast(100);
        l.addLast(200);
        l.display(); // [55, 100, 200]
        l.removeValue(100); // [55, 200]
        l.removeValue(55); // [200]
        l.display(); // [200]

        System.out.println("\n=== Testing get / indexOf / contains ===");
        System.out.println("get(0): " + l.get(0)); // 200
        System.out.println("indexOf(200): " + l.indexOf(200)); // 0
        System.out.println("contains(200): " + l.contains(200)); // true
        System.out.println("contains(999): " + l.contains(999)); // false

        System.out.println("\n=== Testing clear / size / isEmpty ===");
        System.out.println("size: " + l.size()); // 1
        System.out.println("isEmpty: " + l.isEmpty()); // false
        l.clear();
        System.out.println("size after clear: " + l.size()); // 0
        System.out.println("isEmpty after clear: " + l.isEmpty()); // true
        l.display(); // [ ]
    }
}
