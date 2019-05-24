import org.junit.Assert;
import org.junit.Test;

public class DichHe10SangSoLaMaTest {
    @Test
    public void test_dich(){
        Assert.assertEquals(new DichHe10SangSoLaMa().dich(77),"LXXVII");
        Assert.assertEquals(new DichHe10SangSoLaMa().dich(197),"CXCVII");
        Assert.assertEquals(new DichHe10SangSoLaMa().dich(289),"CCLXXXIX");
        Assert.assertEquals(new DichHe10SangSoLaMa().dich(400),"CD");
        Assert.assertEquals(new DichHe10SangSoLaMa().dich(434),"CDXXXIV");
    }
}
