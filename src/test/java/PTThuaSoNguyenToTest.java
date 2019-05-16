import org.junit.Assert;
import org.junit.Test;

public class PTThuaSoNguyenToTest {
    @Test
    public void test_phantich(){
        Assert.assertEquals(new PTThuaSoNguyenTo().phantich(600), "2 * 2 * 2 * 3 * 5 * 5");
    }
}
