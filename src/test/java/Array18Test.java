import org.junit.Assert;
import org.junit.Test;

public class Array18Test {
    @Test
    public void test_sortArray() {
        int a[][] = {{1, 7, 3}, {4, 5, 6}};
        int b[][] = {{1, 4, 6}, {3, 5, 7}};
        Assert.assertArrayEquals(new Array18().sortArray(a), b);
        int c[][] = {{9, 2, 3}, {4, 5, 6},{1,7,8}};
        int d[][] = {{1, 4, 7}, {2, 6, 8},{3,6,9}};
        Assert.assertArrayEquals(new Array18().sortArray(a), b);
    }
}
