import org.junit.Assert;
import org.junit.Test;

public class TinhPiBai10Test {
    @Test
    public void test_tinhpi(){
        Assert.assertEquals(new TinhPiBai10().pi(),3.141592654,0.00001);
    }
}
