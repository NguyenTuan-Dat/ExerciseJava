import org.junit.Assert;
import org.junit.Test;

public class String16Test {
    @Test
    public void test_tinhTong(){
        Assert.assertEquals(new String4().tinhTong("1224","2337"),"3561");
        Assert.assertEquals(new String4().tinhTong("12","2"),"14");
        Assert.assertEquals(new String4().tinhTong("14","5"),"19");
        Assert.assertEquals(new String4().tinhTong("14","7"),"21");
        Assert.assertEquals(new String4().tinhTong("14","87"),"101");
    }
}
