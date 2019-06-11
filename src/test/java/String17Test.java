import org.junit.Assert;
import org.junit.Test;

public class String17Test {
    @Test
    public void test_tinhHieu(){
        Assert.assertEquals(new String17().tinhHieu("351","12"),"339");
        Assert.assertEquals(new String17().tinhHieu("326","199"),"127");
        Assert.assertEquals(new String17().tinhHieu("199","326"),"-127");
        Assert.assertEquals(new String17().tinhHieu("199","199"),"0");
        Assert.assertEquals(new String17().tinhHieu("12","351"),"-339");
        Assert.assertEquals(new String17().tinhHieu("17","9"),"8");
    }
}
