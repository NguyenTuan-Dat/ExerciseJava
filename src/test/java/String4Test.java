import org.junit.Assert;
import org.junit.Test;

public class String4Test {
    @Test
    public void test_sum(){
        Assert.assertEquals(new String4().sum("12 asd2.5"), "19");
    }

    @Test
    public void test_tinhTong(){
        Assert.assertEquals(new String4().tinhTong("1224","2337"),"3561");
        Assert.assertEquals(new String4().tinhTong("12","2"),"14");
        Assert.assertEquals(new String4().tinhTong("14","5"),"19");
    }
}
