import org.junit.Assert;
import org.junit.Test;

public class Array18Test {
    @Test
    public void test_sortArray() {
        int a[][] = {{1, 7, 3}, {4, 5, 6}};
        int b[][] = {{1, 4, 6}, {3, 5, 7}};
        Assert.assertArrayEquals(new Array18().sortArray(a), b);
    }
}
