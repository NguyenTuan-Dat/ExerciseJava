import org.junit.Assert;
import org.junit.Test;

public class String1Test {
    @Test
    public void test_cau(){
        String[] a = {"aa","bb","cc","dd","ee"};
        String b = "aa.bb?cc!dd\nee";
        Assert.assertEquals(new String1().cau(b),a);
    }
}
