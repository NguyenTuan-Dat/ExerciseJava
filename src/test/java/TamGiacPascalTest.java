import org.junit.Assert;
import org.junit.Test;

public class TamGiacPascalTest {
    @Test
    public void test_tinh() {
        Assert.assertEquals(new TamGiacPascal().tinh(1), "1");
        Assert.assertEquals(new TamGiacPascal().tinh(2), "1 1");
        Assert.assertEquals(new TamGiacPascal().tinh(3), "1 2 1");
        Assert.assertEquals(new TamGiacPascal().tinh(4), "1 3 3 1");
        Assert.assertEquals(new TamGiacPascal().tinh(7), "1 6 15 20 15 6 1");
        Assert.assertEquals(new TamGiacPascal().tinh(8), "1 7 21 35 35 21 7 1");
    }
}
