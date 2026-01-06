package queue;

public class Queue {
    private int rear = -1, front = -1;
    private int capacity;
    private int[] arr;

    public Queue(int c) {
        this.capacity = c;
        this.arr = new int[capacity];
    }

    public boolean isEmpty() {
        return front == -1;
    }

    public boolean isFull() {
        // Full if next rear is front
        return (rear + 1) % capacity == front;
    }

    public int size() {
        if (isEmpty())
            return 0;
        if (rear >= front)
            return rear - front + 1;
        else
            return capacity - (front - rear - 1); // wrap-around
    }

    public void enqueue(int data) {
        if (isFull())
            throw new IllegalStateException("Queue overflow");

        if (isEmpty()) {
            front = 0;
            rear = 0;
            arr[rear] = data;
        } else {
            rear = (rear + 1) % capacity;
            arr[rear] = data;
        }
    }

    public int dequeue() {
        if (isEmpty())
            throw new IllegalStateException("Queue underflow");

        int data = arr[front];

        if (front == rear) {
            // Last element removed, reset queue
            clear();
        } else {
            front = (front + 1) % capacity;
        }

        return data;
    }

    public void clear() {
        rear = -1;
        front = -1;
    }

    public int peek() {
        if (isEmpty())
            throw new IllegalStateException("Queue empty");

        return arr[front];
    }

    @Override
    public String toString() {
        if (isEmpty())
            return "[ ]";

        StringBuilder sb = new StringBuilder("[ ");
        int i = front;
        while (true) {
            sb.append(arr[i]);
            if (i == rear)
                break;
            sb.append(", ");
            i = (i + 1) % capacity;
        }
        sb.append(" ]");
        return sb.toString();
    }

    public void display() {
        System.out.println(toString());
    }
}
