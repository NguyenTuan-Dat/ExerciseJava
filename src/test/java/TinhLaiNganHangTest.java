import org.junit.Assert;
import org.junit.Test;

public class TinhLaiNganHangTest {
    @Test
    public void test_tinhlai(){
        Assert.assertEquals(new TinhLaiNganHang().tinhlai(2),225);
        Assert.assertEquals(new TinhLaiNganHang().tinhlai(3),237);
    }
}
