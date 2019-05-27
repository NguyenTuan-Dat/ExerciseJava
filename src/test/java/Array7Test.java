import org.junit.Assert;
import org.junit.Test;

public class Array7Test {
    @Test
    public void test_findArray() {
        int a[] = {1, 2, 3, 4, 1};
        int b[] = {1, 2, 3, 4};
        Assert.assertArrayEquals(new Array7().findArray(a), b);
        int c[] = {1, 2, 3, 4, 1, 5, 6, 7, 8, 9, 10};
        int d[] = {1, 5, 6, 7, 8, 9, 10};
        Assert.assertArrayEquals(new Array7().findArray(c), d);
        int e[] = {1, 2, 3, 4, 5, 1, 2, 3, 1, 2, 3, 4, 5, 6, 9};
        int f[] = {1, 2, 3, 4, 5, 6, 9};
        Assert.assertArrayEquals(new Array7().findArray(e), f);
    }
}
