import OOP6.Node;
import OOP6.Stack;
import org.junit.Assert;
import org.junit.Test;

public class OOP6Test {
    @Test
    public void test_Node(){
        Node<Integer> a = new Node<Integer>(1);
        a.setNext(new Node<Integer>(2));

        Integer b = 1;

        Assert.assertEquals(a.getVal(),b);

        a.setVal(4);

        Integer c = 4;

        Assert.assertEquals(a.getVal(),c);

        Integer d = 2;

        Assert.assertEquals(a.next().getVal(),d);

        Node<String> e = new Node<String>("asd");
        e.setNext(new Node<String>("123"));

        String f = "asd";

        Assert.assertEquals(e.getVal(),f);

        e.setVal("dsa");

        String g = "dsa";

        Assert.assertEquals(e.getVal(),g);

        String h = "123";

        Assert.assertEquals(e.next().getVal(),h);
    }

    @Test
    public void test_Stack(){
        Stack<Integer> a = new Stack();

        Assert.assertTrue(a.isEmpty());

        Assert.assertEquals(a.getSize(),0);

        a.push(3);
        Assert.assertEquals(a.getTop(),(Integer) 3);
        Assert.assertFalse(a.isEmpty());

        a.push(2);
        Stack b = new Stack();
        b.push(3);
        b.push(2);

        int n = a.getSize();

        for(int i=0; i<n; i++){
            Assert.assertEquals(a.pop(),b.pop());
        }

        Stack<Double> c = new Stack();

        Assert.assertTrue(c.isEmpty());

        Assert.assertEquals(c.getSize(),0);

        c.push(4.5);
        Assert.assertEquals(c.getTop(), (Double) 4.5);
        Assert.assertFalse(c.isEmpty());

        c.push(2.9);
        Stack d = new Stack();
        d.push(4.5);
        d.push(2.9);

        n = c.getSize();

        for(int i=0; i<n; i++){
            System.out.println(d.getTop());
            Assert.assertEquals(c.pop(),d.pop());
        }
    }
}
