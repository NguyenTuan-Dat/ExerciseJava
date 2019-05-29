import org.junit.Assert;
import org.junit.Test;

public class Array20Test {
    @Test
    public void test_maTranCon() {
        int a[][] = {{1, 5, 4, 3, 2}, {6, 7, 8, 9, 10}, {12, 13, 11, 14, 15}, {16, 17, 18, 19, 20}};
        int b[][] = {{7, 8}, {13, 11}};
        Assert.assertArrayEquals(new Array20().maTranCon(a, 1, 1, 2, 2), b);
    }
}
