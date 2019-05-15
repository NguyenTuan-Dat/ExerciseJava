import org.junit.Assert;
import org.junit.Test;

public class PTThuaSoNguyenToTest {
    @Test
    public void Test_PhanTich(){
        Assert.assertEquals(new PTThuaSoNguyenTo().PhanTich(600), "2 * 2 * 2 * 3 * 5 * 5");
    }
}
