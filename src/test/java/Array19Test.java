import org.junit.Assert;
import org.junit.Test;

public class Array19Test {
    @Test
    public void test_sxMaTranXoanOc() {
        int c[][] = {{1, 5, 4, 3, 2}, {6, 7, 8, 9, 10}, {12, 13, 11, 14, 15}};
        int d[][] = {{1, 2, 3, 4, 5},{12, 13, 14, 15, 6},{11, 10, 9, 8, 7}};
        Assert.assertArrayEquals(new Array19().sxMaTranXoanOc(c), d);
        int a[][] = {{1, 5, 4, 3, 2}, {6, 7, 8, 9, 10}, {12, 13, 11, 14, 15}, {16, 17, 18, 19, 20}};
        int b[][] = {{1, 2, 3, 4, 5}, {14, 15, 16, 17, 6}, {13, 20, 19, 18, 7}, {12, 11, 10, 9, 8}};
        Assert.assertArrayEquals(new Array19().sxMaTranXoanOc(a), b);
        
    }
}
