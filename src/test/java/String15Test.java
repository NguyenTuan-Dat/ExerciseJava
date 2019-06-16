import org.junit.Assert;
import org.junit.Test;

public class String15Test {
    @Test
    public void test_findVerifyNumber(){
        Assert.assertEquals(new String15().findVerifyNumber("893850597419x"), 4);
        Assert.assertEquals(new String15().findVerifyNumber("893850597469x"), 9);
        Assert.assertEquals(new String15().findVerifyNumber("893850597459x"), 0);
    }
}
