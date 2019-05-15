import org.junit.Assert;
import org.junit.Test;

public class PTTSNTVer2Test {
    @Test
    public void test_phantich(){
        Assert.assertEquals(new PTTSNTVer2().phantich(600),"2^3 * 3 * 5^2");
    }
}
