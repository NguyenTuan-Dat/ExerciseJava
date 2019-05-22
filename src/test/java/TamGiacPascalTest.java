import org.junit.Assert;
import org.junit.Test;

public class TamGiacPascalTest {
    @Test
    public void test_tinh() {
        Assert.assertEquals(new TamGiacPascal().tinh(3), "1 2 1");
        Assert.assertEquals(new TamGiacPascal().tinh(4), "1 3 3 1");
    }
}
