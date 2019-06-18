import OOP5.Node;
import OOP5.Queue;
import org.junit.Assert;
import org.junit.Test;

public class OOP5Test {
    @Test
    public void test_Node() {
        Node node = new Node(1);
        node.setNext(new Node(2));

        Assert.assertEquals(node.getVal(), 1);

        node.setVal(4);
        Assert.assertEquals(node.getVal(), 4);

        Assert.assertEquals(node.next().getVal(), 2);
    }

    @Test
    public  void test_Queue(){
        Queue queue = new Queue();

        Assert.assertEquals(queue.deQueue(),-1);
        Assert.assertTrue(queue.isEmpty());
        queue.enQueue(1);
        Assert.assertFalse(queue.isEmpty());

        Assert.assertEquals(queue.getSize(),1);

        Assert.assertEquals(queue.getFront(),1);

        queue.enQueue(3);
        queue.enQueue(2);

        Queue queue1 = new Queue();

        queue1.enQueue(1);
        queue1.enQueue(3);
        queue1.enQueue(2);

        for(int i=0; i<queue.getSize(); i++){
            Assert.assertEquals(queue.deQueue(),queue1.deQueue());
        }
    }
}
