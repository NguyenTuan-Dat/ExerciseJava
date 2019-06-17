package OOP6;

public class Stack<T> {
    private Node<T> top;

    private int size;

    public Stack() {
        this.size = 0;
        this.top = null;
    }

    public int getSize() {
        return size;
    }

    public T getTop() {
        return top.getVal();
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public void push(T a) {
        Node top = new Node(a);
        top.setNext(this.top);
        this.top = top;
        this.size++;
    }

    public T pop() {
        T x = this.top.getVal();
        this.top = this.top.next();
        this.size--;
        return x;
    }
}
