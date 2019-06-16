package OOP4;

public class StackNumber {
    private Node top;

    private int size;

    public StackNumber() {
        this.size = 0;
        this.top = null;
    }

    public int getSize() {
        return size;
    }

    public int getTop() {
        return top.getVal();
    }

    public boolean isEmpty() {
        if (this.size == 0) return true;
        else return false;
    }

    public void push(int a) {
        Node top = new Node(a);
        top.setNext(this.top);
        this.top = top;
        this.size++;
    }

    public int pop() {
        int x = this.top.getVal();
        this.top = this.top.next();
        this.size--;
        return x;
    }
}
