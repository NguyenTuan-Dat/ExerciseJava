import org.junit.Assert;
import org.junit.Test;

public class FibonaciTest {
    @Test
    public void test_fibonaci(){
        Assert.assertEquals(new Fibonaci().fibonaci(8), "1 1 2 3 5 8");
        Assert.assertEquals(new Fibonaci().fibonaci(15), "1 1 2 3 5 8 13");
    }
}
