import org.junit.Assert;
import org.junit.Test;

public class String15Test {
    @Test
    public void test_findVerifyNumber(){
        Assert.assertEquals(new String15().findVerifyNumber("89385059741x4"), 9);
        Assert.assertEquals(new String15().findVerifyNumber("8938505974x94"), 1);
    }
}
