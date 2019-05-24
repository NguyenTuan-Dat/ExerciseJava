import org.junit.Assert;
import org.junit.Test;

public class DichSoLaMaSangHe10Test {

    @Test
    public void test_dich(){

        Assert.assertEquals(new DichSoLaMaSangHe10().dich("CCXXIX"), 229);
        Assert.assertEquals(new DichSoLaMaSangHe10().dich("CCXXIV"), 224);
        Assert.assertEquals(new DichSoLaMaSangHe10().dich("CCLXXXIX"), 289);
        Assert.assertEquals(new DichSoLaMaSangHe10().dich("MMMCMXCIX"),3999);
        Assert.assertEquals(new DichSoLaMaSangHe10().dich("MMMDCCCLXXXVIII"),3888);

    }

}
