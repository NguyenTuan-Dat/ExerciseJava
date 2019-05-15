import org.junit.Assert;
import org.junit.Test;

public class PTTSNTVer2Test {
    @Test
    public void Test_PhanTich(){
        Assert.assertEquals(new PTTSNTVer2().PhanTich(600),"2^3 * 3 * 5^2");
    }
}
