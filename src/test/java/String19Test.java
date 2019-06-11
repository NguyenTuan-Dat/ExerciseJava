import org.junit.Assert;
import org.junit.Test;

public class String19Test {
    @Test
    public void test_tinhThuong(){
        Assert.assertEquals(new String19().tinhThuong("492","12"),"41");
        Assert.assertEquals(new String19().tinhThuong("487","18"),"27");
    }

    @Test
    public void test_tinhTich(){
        Assert.assertEquals(new String19().tinhTich("22","48"),"1056");
        Assert.assertEquals(new String19().tinhTich("2","4023"),"8046");
    }

    @Test
    public void test_tinhHieu() {
        Assert.assertEquals(new String19().tinhHieu("351", "12"), "339");
        Assert.assertEquals(new String19().tinhHieu("326", "199"), "127");
        Assert.assertEquals(new String19().tinhHieu("199", "326"), "-127");
        Assert.assertEquals(new String19().tinhHieu("199", "199"), "0");
        Assert.assertEquals(new String19().tinhHieu("12", "351"), "-339");
        Assert.assertEquals(new String19().tinhHieu("17", "9"), "8");
    }

    @Test
    public void test_tinhTong(){
        Assert.assertEquals(new String19().tinhTong("1224","2337"),"3561");
        Assert.assertEquals(new String19().tinhTong("12","2"),"14");
        Assert.assertEquals(new String19().tinhTong("14","5"),"19");
        Assert.assertEquals(new String19().tinhTong("14","7"),"21");
        Assert.assertEquals(new String19().tinhTong("14","87"),"101");
        Assert.assertEquals(new String19().tinhTong("14","887"),"901");

    }
}
