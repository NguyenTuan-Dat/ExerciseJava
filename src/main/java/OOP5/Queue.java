package OOP5;

public class Queue {
    private Node front;

    private Node end;

    private int size;

    public Queue() {
        this.size = 0;
        this.end = null;
        this.front = null;
    }

    public int getSize() {
        return size;
    }

    public int getFront() {
        return front.getVal();
    }

    public boolean isEmpty() {
        if (this.size == 0) return true;
        else return false;
    }

    public void enQueue(int a) {
        Node x = new Node(a);
        if (this.size == 0) {
            this.front = x;
            this.end = x;
        } else {
            this.end.setNext(x);
            this.end = x;
        }
        this.size++;
    }

    public int deQueue() {
        if(size == 0) return -1;
        int x = this.front.getVal();
        this.front = this.front.next();
        this.size--;
        return x;
    }
}
