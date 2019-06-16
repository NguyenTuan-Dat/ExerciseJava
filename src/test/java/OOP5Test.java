import OOP5.Node;
import OOP5.Queue;
import org.junit.Assert;
import org.junit.Test;

public class OOP5Test {
    @Test
    public void test_Node() {
        Node a = new Node(1);
        a.setNext(new Node(2));

        Assert.assertEquals(a.getVal(), 1);

        a.setVal(4);
        Assert.assertEquals(a.getVal(), 4);

        Assert.assertEquals(a.next().getVal(), 2);
    }

    @Test
    public  void test_Queue(){
        Queue a = new Queue();

        Assert.assertTrue(a.isEmpty());
        a.enQueue(1);
        Assert.assertFalse(a.isEmpty());

        Assert.assertEquals(a.getSize(),1);

        Assert.assertEquals(a.getFront(),1);

        a.enQueue(3);
        a.enQueue(2);

        Queue b = new Queue();

        b.enQueue(1);
        b.enQueue(3);
        b.enQueue(2);

        for(int i=0; i<a.getSize(); i++){
            Assert.assertEquals(a.deQueue(),b.deQueue());
        }
    }
}
