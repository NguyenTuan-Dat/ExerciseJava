import org.junit.Assert;
import org.junit.Test;

public class TinhCanTest {
    @Test
    public void test_can(){
        Assert.assertEquals(new TinhCan().can(8), Math.sqrt(8), 0.00001);
    }
}
