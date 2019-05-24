import org.junit.Assert;
import org.junit.Test;

public class DaoSoNhiPhanTest {
    @Test
    public void test_tinh(){
        Assert.assertEquals(new DaoSoNhiPhan().tinh(23),29);
    }
}
