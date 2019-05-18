import org.junit.Assert;
import org.junit.Test;

public class TinhSTest {
    @Test
    public void test_tinhs(){
        Assert.assertEquals(new TinhS().S(3),2.66666666666667, 0.0000001);
    }
}
