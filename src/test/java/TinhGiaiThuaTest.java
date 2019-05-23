import org.junit.Assert;
import org.junit.Test;

public class TinhGiaiThuaTest {
    @Test
    public void test_tinhGiaiThua(){
        Assert.assertEquals(new TinhGiaiThua().tinhGiaiThua(25),6);
        Assert.assertEquals(new TinhGiaiThua().tinhGiaiThua(5),1);
        Assert.assertEquals(new TinhGiaiThua().tinhGiaiThua(4),0);
        Assert.assertEquals(new TinhGiaiThua().tinhGiaiThua(100),24);
        Assert.assertEquals(new TinhGiaiThua().tinhGiaiThua(100000), 24999);
        Assert.assertEquals(new TinhGiaiThua().tinhGiaiThua(1000000), 249998);

    }
}