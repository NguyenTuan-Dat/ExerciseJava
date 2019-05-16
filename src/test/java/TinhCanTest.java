import org.junit.Assert;
import org.junit.Test;

public class TinhCanTest {
    @Test
    public void test_can(){
        Assert.assertEquals(new TinhCan().can(8), String.valueOf(Math.sqrt(8)).substring(0,7));
    }
}
