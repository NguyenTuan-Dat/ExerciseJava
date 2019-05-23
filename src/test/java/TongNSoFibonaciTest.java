import org.junit.Assert;
import org.junit.Test;

public class TongNSoFibonaciTest {
    @Test
    public void test_sum(){
        Assert.assertEquals(new TongNSoFibonaci().sum(3), 4);
        Assert.assertEquals(new TongNSoFibonaci().sum(5),12);
        Assert.assertEquals(new TongNSoFibonaci().sum(1), 1);
    }
}
