import org.junit.Assert;
import org.junit.Test;

public class CountFibonaciSmallerNTest {
    @Test
    public void test_count(){
        Assert.assertEquals(new CountFibonaciSmallerN().count(4),4);
        Assert.assertEquals(new CountFibonaciSmallerN().count(1),0);
        Assert.assertEquals(new CountFibonaciSmallerN().count(10),6);
    }
}
