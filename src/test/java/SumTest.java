import org.junit.Assert;
import org.junit.Test;

public class SumTest {
    @Test
    public void Test_sum()
    {
        Assert.assertEquals(new Sum().sum(123),6);
    }
}
