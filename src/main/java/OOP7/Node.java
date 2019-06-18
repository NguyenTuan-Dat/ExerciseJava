package OOP7;

public class Node<T> {
    private T val;

    private Node next;

    public Node(T val) {
        this.val = val;
    }

    public void setVal(T val) {
        this.val = val;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public T getVal() {
        return val;
    }

    public Node next() {
        return next;
    }
}
