import org.junit.Assert;
import org.junit.Test;

public class Array14Test {
    @Test
    public void test_chuyenDoiMang() {
        int[][] a = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}};
        int[] b = {1, 2, 3, 4, 5, 10, 15, 14, 13, 12, 11, 6, 7, 8, 9};
        Assert.assertArrayEquals(new Array14().chuyenDoiMang(a), b);
        int[][] c= {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15},{16,17,18,19,20}};
        int [] d = {1,2,3,4,5,10,15,20,19,18,17,16,11,6,7,8,9,14,13,12};
        Assert.assertArrayEquals(new Array14().chuyenDoiMang(c), d);
    }
}
