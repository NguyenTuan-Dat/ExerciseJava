import org.junit.Assert;
import org.junit.Test;

public class Array12Test {
    @Test
    public void test_chenMang(){
        int a[] = {1,2,3,4,6};
        int b[] = {1,2,3,4,5,6};
        Assert.assertArrayEquals(new Array12().chenMang(a,5),b);
        int c[] = {1,2,3,4,5};
        int d[] = {1,2,3,4,5,5};
        Assert.assertArrayEquals(new Array12().chenMang(c,5),d);
    }
}
