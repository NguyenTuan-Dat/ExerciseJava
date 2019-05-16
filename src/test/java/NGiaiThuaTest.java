import org.junit.Assert;
import org.junit.Test;

public class NGiaiThuaTest {
    @Test
    public void test_ngiaithua(){
        Assert.assertEquals(new NGiaiThua().ngiaithua(3), 6);
        Assert.assertEquals(new NGiaiThua().ngiaithua(5),120);
    }
}
