import org.junit.Assert;
import org.junit.Test;

public class String15Test {
    @Test
    public void test_findVerifyNumber(){
        Assert.assertEquals(new String15().findVerifyNumber("893850597419x"), 4);
    }
}
