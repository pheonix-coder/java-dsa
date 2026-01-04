package linkedlist;

import java.util.NoSuchElementException;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedList {
    private Node head;
    private int n;

    public LinkedList() {
        this.head = null;
        this.n = 0;
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = this.head;
        this.head = newNode;
        n++;
    }

    public void addLast(int data) {
        if (this.isEmpty()) {
            this.head = new Node(data);
            n++;
            return;
        }

        Node curr = this.head;

        while (curr.next != null)
            curr = curr.next;
        curr.next = new Node(data);
        n++;
    }

    public void addAt(int index, int data) {
        if (this.isEmpty()) {
            if (index == 0) {
                this.addFirst(data);
                return;
            } else
                throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + n);
        }

        if (index < 0 || index > n)
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + n);

        if (index == 0) {
            this.addFirst(data);
            return;
        }

        if (index == n) {
            this.addLast(data);
            return;
        }

        int i = 0;
        Node curr = this.head;

        while (curr.next != null) {
            if (i == index - 1) {
                Node newNode = new Node(data);

                newNode.next = curr.next;
                curr.next = newNode;
                n++;
                break;
            }
            curr = curr.next;
            i++;
        }
    }

    public int removeFirst() {
        if (this.isEmpty())
            throw new NoSuchElementException("LinkedList is empty");

        int data = this.head.data;
        this.head = this.head.next;
        n--;
        return data;
    }

    public int removeLast() {
        if (this.isEmpty())
            throw new NoSuchElementException("LinkedList is empty");

        if (this.n == 1)
            return this.removeFirst();

        Node curr = this.head;

        while (curr.next.next != null)
            curr = curr.next;

        int data = curr.next.data;
        curr.next = null;
        n--;
        return data;
    }

    public int removeAt(int index) {
        if (this.isEmpty())
            throw new NoSuchElementException("LinkedList is empty");

        if (index < 0 || index >= n)
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + n);

        if (index == 0)
            return this.removeFirst();

        int i = 0;
        Node curr = this.head;

        while (curr.next != null) {
            if (i == index - 1) {
                int data = curr.next.data;
                curr.next = curr.next.next;
                n--;
                return data;
            }
            curr = curr.next;
            i++;
        }

        throw new IllegalStateException("Unreachable");
    }

    public boolean removeValue(int data) {
        if (this.isEmpty())
            return false;

        if (this.head.data == data) {
            this.removeFirst();
            return true;
        }

        Node curr = this.head;

        while (curr.next != null) {
            if (curr.next.data == data) {
                curr.next = curr.next.next;
                n--;
                return true;
            }
            curr = curr.next;
        }

        return false;
    }

    public int get(int index) {
        if (this.isEmpty())
            throw new NoSuchElementException("LinkedList is empty");

        if (index < 0 || index >= n)
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + n);

        int i = 0;
        Node curr = this.head;

        while (curr != null) {
            if (i == index) {
                return curr.data;
            }
            curr = curr.next;
            i++;
        }

        throw new IllegalStateException("Unreachable");
    }

    public boolean contains(int data) {
        if (this.isEmpty())
            return false;

        Node curr = this.head;

        while (curr != null) {
            if (curr.data == data) {
                return true;
            }
            curr = curr.next;
        }

        return false;
    }

    public int indexOf(int data) {
        if (this.isEmpty())
            return -1;

        int i = 0;
        Node curr = this.head;

        while (curr != null) {
            if (curr.data == data)
                return i;
            curr = curr.next;
            i++;
        }

        return -1;
    }

    public int size() {
        return this.n;
    }

    public boolean isEmpty() {
        return this.n == 0;
    }

    public void clear() {
        this.head = null;
        this.n = 0;
    }

    @Override
    public String toString() {
        if (this.isEmpty()) {
            return "[ ]";
        }

        StringBuilder sb = new StringBuilder("[ ");
        Node curr = this.head;

        while (curr != null) {
            sb.append(curr.data);
            if (curr.next != null) {
                sb.append(", ");
            }
            curr = curr.next;
        }

        sb.append(" ]");
        return sb.toString();
    }

    public void display() {
        System.out.println(this.toString());
    }

    public void reverse() {
        if (this.isEmpty() || this.n == 1)
            return;

        Node prev = null, curr = this.head;

        while (curr != null) {
            Node next = curr.next;

            curr.next = prev;

            prev = curr;
            curr = next;
        }

        this.head = prev;
    }
}