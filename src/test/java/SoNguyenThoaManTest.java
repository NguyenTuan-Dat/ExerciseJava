import org.junit.Assert;
import org.junit.Test;

public class SoNguyenThoaManTest {
    @Test
    public void test_find(){
        Assert.assertEquals(new SoNguyenThoaMan().find(),"153 370 371 407 1634 8208 9474 54748 92727 93084");
    }
}
