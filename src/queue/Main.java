package queue;

public class Main {
    public static void main(String[] args) {
        Queue q = new Queue(5);

        // ===== BASIC STATE =====
        System.out.println("Empty? " + q.isEmpty()); // true
        System.out.println("Size: " + q.size());     // 0

        // ===== ENQUEUE =====
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.display(); // [10, 20, 30]

        System.out.println("Peek: " + q.peek()); // 10
        System.out.println("Size: " + q.size()); // 3

        // ===== DEQUEUE =====
        System.out.println("Removed: " + q.dequeue()); // 10
        q.display(); // [20, 30]

        System.out.println("Removed: " + q.dequeue()); // 20
        q.display(); // [30]

        // ===== FILL QUEUE =====
        q.enqueue(40);
        q.enqueue(50);
        q.enqueue(60);
        q.enqueue(70); // should now be full
        q.display();   // [30, 40, 50, 60, 70]

        System.out.println("Full? " + q.isFull()); // true

        // ===== OVERFLOW TEST =====
        try {
            q.enqueue(80);
        } catch (IllegalStateException e) {
            System.out.println("Overflow caught: " + e.getMessage());
        }

        // ===== EMPTY QUEUE =====
        while (!q.isEmpty()) {
            System.out.println("Dequeued: " + q.dequeue());
        }

        q.display(); // [ ]

        // ===== UNDERFLOW TEST =====
        try {
            q.dequeue();
        } catch (Exception e) {
            System.out.println("Underflow caught: " + e.getMessage());
        }

        try {
            q.peek();
        } catch (Exception e) {
            System.out.println("Peek on empty caught: " + e.getMessage());
        }
    }
}
