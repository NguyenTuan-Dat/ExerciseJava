import OOP4.Node;
import OOP4.StackNumber;
import org.junit.Assert;
import org.junit.Test;

public class OOP4Test {
    @Test
    public void test_Node(){
        Node a = new Node(1);
        a.setNext(new Node(2));

        Assert.assertEquals(a.getVal(),1);

        a.setVal(4);
        Assert.assertEquals(a.getVal(),4);

        Assert.assertEquals(a.next().getVal(),2);
    }

    @Test
    public void test_StackNumber(){
        StackNumber a = new StackNumber();

        Assert.assertTrue(a.isEmpty());

        Assert.assertEquals(a.getSize(),0);

        a.push(3);
        Assert.assertEquals(a.getTop(),3);
        Assert.assertFalse(a.isEmpty());

        a.push(2);
        StackNumber b = new StackNumber();
        b.push(3);
        b.push(2);

        for(int i=0; i<a.getSize(); i++){
            Assert.assertEquals(a.pop(),b.pop());
        }
    }
}
