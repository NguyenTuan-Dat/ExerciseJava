import org.junit.Assert;
import org.junit.Test;

public class Array13Test {
    @Test
    public void test_xoayMang() {
        int a[][] = {{1, 2}, {1, 3}, {1, 4}};
        int b[][] = {{1, 1, 1}, {2, 3, 4}};
        Assert.assertArrayEquals(new Array13().xoayMang(a),b);
    }
}
