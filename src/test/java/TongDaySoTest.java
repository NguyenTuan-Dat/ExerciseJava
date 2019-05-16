import org.junit.Assert;
import org.junit.Test;

public class TongDaySoTest {
    @Test
    public void test_sum(){
        Assert.assertEquals(new TongDaySo().sum(2), 8);
    }
}