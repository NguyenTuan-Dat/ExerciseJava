import org.junit.Assert;
import org.junit.Test;

public class Array26Test {
    @Test
    public void test_sum() {
        int a[] = {1, 2, 3, 4, 5, 10};
        Assert.assertEquals(new Array26().sum(a), 16);
    }

    @Test
    public void test_daoSo() {
        Assert.assertEquals(new Array26().daoSo(16), 61);
    }
}