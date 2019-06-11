import org.junit.Assert;
import org.junit.Test;

public class String14Test {
    @Test
    public void test_isBarcode(){
        Assert.assertTrue(new String14().isBarcode("8938505974194"));
        Assert.assertFalse(new String14().isBarcode("8938505974195"));
    }
}
