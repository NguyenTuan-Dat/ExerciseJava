import org.junit.Assert;
import org.junit.Test;

public class Array1Test {
    @Test
    public void test_find(){
        int a[] = {2,2,3,2,4,4,61,6,6,6,4};
        int b[] = {2,4,6};
        Assert.assertArrayEquals(new Array1().find(a),b);
//        int c[] = {2,2,2,2,2,2,2,2,2};
//        int d[] = {2};
//        Assert.assertArrayEquals(new Array1().find(c),d);
    }
}
