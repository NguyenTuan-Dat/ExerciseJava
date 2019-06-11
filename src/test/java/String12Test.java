import org.junit.Assert;
import org.junit.Test;

public class String12Test {
    @Test
    public void test_xoaKyTu(){
        Assert.assertEquals(new String12().xoaKyTu("abbbbbbccccd eeffffddbc"),"abcd efdbc");
    }
}
