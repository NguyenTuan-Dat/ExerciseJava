import org.junit.Assert;
import org.junit.Test;

public class Array22Test {
    @Test
    public void test_xoaHangXoaCot(){
        int a[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int b[][] = {{1,2},{4,5}};
        Assert.assertArrayEquals(new Array22().xoaHangXoaCot(a,1,2),b);
    }
}
