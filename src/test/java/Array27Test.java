import org.junit.Assert;
import org.junit.Test;

public class Array27Test {
    @Test
    public void test_array() {
        Integer a[] = {1, 4, 3, 2, 5, 7, 9, 0, 6};
        Integer b[] = {9, 7};
        Assert.assertArrayEquals(new Array27().array(a, 2), b);
    }
}
