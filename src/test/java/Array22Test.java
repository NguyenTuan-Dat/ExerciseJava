import org.junit.Assert;
import org.junit.Test;

public class Array22Test {
    @Test
    public void test_xoaHangXoaCot() {
        int a[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}};
        int b[][] = {{5, 6}, {8, 9}, {11, 12}};
        int c[][] = {{1, 2}, {7, 8}, {10, 11}};
        int d[][] = {{1, 2}, {4, 5}, {10, 11}};
        int e[][] = {{2, 3}, {5, 6}, {11, 12}};
        int f[][] = {{4, 5}, {7, 8}, {10, 11}};
        int g[][] = {{1, 3}, {4, 6}, {10, 12}};
        int h[][] = {{1, 3}, {7, 9}, {10, 12}};
        Assert.assertArrayEquals(new Array22().xoaHangXoaCot(a, 0, 0), b);
        Assert.assertArrayEquals(new Array22().xoaHangXoaCot(a, 1, 2), c);
        Assert.assertArrayEquals(new Array22().xoaHangXoaCot(a, 2, 2), d);
        Assert.assertArrayEquals(new Array22().xoaHangXoaCot(a, 2, 0), e);
        Assert.assertArrayEquals(new Array22().xoaHangXoaCot(a, 0, 2), f);
        Assert.assertArrayEquals(new Array22().xoaHangXoaCot(a, 2, 1), g);
        Assert.assertArrayEquals(new Array22().xoaHangXoaCot(a, 1, 1), h);
    }
}
