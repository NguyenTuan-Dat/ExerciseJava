import org.junit.Assert;
import org.junit.Test;

public class String4Test {
    @Test
    public void test_sum(){
        Assert.assertEquals(new String4().sum("12 asd2.5"), "19");
        Assert.assertEquals(new String4().sum("12 asd2.6aasadsadsdasd"), "20");
        Assert.assertEquals(new String4().sum("82 asd2.7"), "91");
        Assert.assertEquals(new String4().sum("2 asd32.5"), "39");
        Assert.assertEquals(new String4().sum("abc 123 def 33 mn 3.221"), "380");
    }

    @Test
    public void test_tinhTong(){
        Assert.assertEquals(new String4().tinhTong("1224","2337"),"3561");
        Assert.assertEquals(new String4().tinhTong("12","2"),"14");
        Assert.assertEquals(new String4().tinhTong("14","5"),"19");
        Assert.assertEquals(new String4().tinhTong("14","7"),"21");
        Assert.assertEquals(new String4().tinhTong("14","87"),"101");
    }
}
