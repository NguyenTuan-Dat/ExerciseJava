import org.junit.Assert;
import org.junit.Test;

public class String7Test {
    @Test
    public void test_findLocal(){
        String a = "aaa sdshdasdaaa";
        String b = "asd";
        Assert.assertEquals(new String7().findLocal(a,b),9);
    }
}
