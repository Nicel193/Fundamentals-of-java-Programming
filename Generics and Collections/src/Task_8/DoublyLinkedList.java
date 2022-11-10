package Task_8;

public class DoublyLinkedList<T> {
    private class Node {
        T data;
        Node next;
        Node last;

        Node(T data, Node last, Node next) {
            this.data = data;
            this.last = last;
            this.next = next;
        }
    }

    private Node first = null;
    private Node last = null;
    private int count = 0;

    public void add(T data) {
        if (last == null) {
            first = new Node(data, null, null);
            last = first;
        } else {
            last.next = new Node(data, last, null);
            last = last.next;
        }
        count++;
    }

    public void remove(T data) {
        Node current = first;

        if (first.data == data) {
            first = first.next;
            first.last = null;
            return;
        }

        if (last.data == data) {
            last = last.last;
            last.next = null;
            return;
        }

        while (current != null) {
            if (current.data == data) break;

            current = current.next;
        }

        if (current == null) return;

        current.last.next = current.next;
        current.next.last = current.last;
        count--;
    }

    public final int size() {
        return count;
    }

    @Override
    public String toString() {
        String str = "[";
        Node current = first;
        while (current != null) {
            str += current.data;
            if (current.next != null) str += ",";

            current = current.next;
        }
        str += "]";

        return str;
    }
}
