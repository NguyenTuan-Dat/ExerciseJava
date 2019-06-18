import OOP7.Queue;
import org.junit.Assert;
import org.junit.Test;

public class OOP7Test {
    @Test
    public void test_Queue() {
        Queue<Integer> queue = new Queue();

        Assert.assertNull(queue.deQueue());
        Assert.assertTrue(queue.isEmpty());
        queue.enQueue(1);
        Assert.assertFalse(queue.isEmpty());

        Assert.assertEquals(queue.getSize(), 1);

        Assert.assertEquals(queue.getFront(), (Integer) 1);

        queue.enQueue(3);
        queue.enQueue(2);

        Queue queue1 = new Queue();

        queue1.enQueue(1);
        queue1.enQueue(3);
        queue1.enQueue(2);

        int n = queue.getSize();

        for (int i = 0; i < n; i++) {
            Assert.assertEquals(queue.deQueue(), queue1.deQueue());
        }

        Queue<Character> queue2 = new Queue();

        Assert.assertNull(queue2.deQueue());
        Assert.assertTrue(queue2.isEmpty());
        queue2.enQueue('a');
        Assert.assertFalse(queue2.isEmpty());

        Assert.assertEquals(queue2.getSize(), 1);

        Assert.assertEquals(queue2.getFront(), (Character) 'a');

        queue2.enQueue('x');
        queue2.enQueue('z');

        Queue<Character> queue3 = new Queue();

        queue3.enQueue('a');
        queue3.enQueue('x');
        queue3.enQueue('z');

        n = queue2.getSize();

        for (int i = 0; i < n; i++) {
            Assert.assertEquals(queue2.deQueue(), queue3.deQueue());
        }
    }
}
