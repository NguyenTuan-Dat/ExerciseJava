package OOP4;

public class Node {
    private int val;

    private Node next;

    public Node(int val) {
        this.val = val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public int getVal() {
        return val;
    }

    public Node next() {
        return next;
    }
}
