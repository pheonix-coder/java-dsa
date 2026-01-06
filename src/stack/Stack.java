package stack;

public class Stack {
    private int top = -1;
    private int capacity = 5;
    private int[] arr = new int[capacity];

    public int size() {
        return this.top + 1;
    }

    public boolean isEmpty() {
        return this.top == -1;
    }

    public void push(int data) {
        if (this.top == capacity - 1)
            throw new IllegalStateException("Stack overflow");

        arr[++top] = data;
    }

    public int pop() {
        if (this.isEmpty())
            throw new IllegalStateException("Stack underflow");

        return arr[top--];
    }

    public int peek() {
        if (this.isEmpty())
            throw new IllegalStateException("Stack underflow");

        return arr[top];
    }

    public void clear() {
        this.top = -1;
    }

    @Override
    public String toString() {
        if (this.isEmpty()) {
            return "[ ]";
        }

        StringBuilder sb = new StringBuilder("[ ");

        for (int i = 0; i <= top; i++) {
            sb.append(arr[i]);
            if (i != top)
                sb.append(", ");
        }

        sb.append(" ]");
        return sb.toString();
    }

    public void display() {
        System.out.println(this.toString());
    }
}