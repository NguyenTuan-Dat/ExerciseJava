import org.junit.Assert;
import org.junit.Test;

public class Array11Test {
    
    @Test
    public void test_swap() {
        int c[] = {3, 2, 1};
        Assert.assertArrayEquals(new Array11().swap(false, 0), c);
    }

    @Test
    public void test_swapEvenAndOdd() {
        int a[] = {1, 2, 4, 5, 6, 7, 8, 10};
        int b[] = {7, 10, 8, 5, 6, 1, 4, 2};
        Assert.assertArrayEquals(new Array11().swapEvenAndOdd(a),b);
    }
}
