import org.junit.Assert;
import org.junit.Test;

public class TinhPiBai9Test {
    @Test
    public void test_tinhpi(){
        Assert.assertEquals(new TinhPiBai9().tinhpi(),3.141592654, 0.00001);
    }
}
