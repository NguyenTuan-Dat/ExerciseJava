import org.junit.Assert;
import org.junit.Test;

public class Array10Test {
    @Test
    public void test_chiaMang(){
        int[] a = {1,2,3,4,5,6,7,8,9};
        int b[][] = {{1,2,3,4,5},{6,7,8,9}};
        Assert.assertArrayEquals(new Array10().chiaMang(a,2),b);
    }
}
