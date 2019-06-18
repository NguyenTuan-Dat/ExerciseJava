package OOP7;

public class Queue<T> {
    private Node<T> front;

    private Node<T> end;

    private int size;

    public Queue() {
    }

    public int getSize() {
        return size;
    }

    public T getFront() {
        return front.getVal();
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public void enQueue(T a) {
        Node<T> node = new Node(a);
        if (this.size == 0) {
            this.front = node;
            this.end = node;
        } else {
            this.end.setNext(node);
            this.end = node;
        }
        this.size++;
    }

    public T deQueue() {
        if (this.isEmpty()) return null;
        T val = this.front.getVal();
        this.front = this.front.next();
        this.size--;
        return val;
    }
}
