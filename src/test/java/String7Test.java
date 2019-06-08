import org.junit.Assert;
import org.junit.Test;

public class String7Test {
    @Test
    public void test_findLocal(){
        String a = "aaa sdshdasdaaa";
        String b = "asd";
        String c = "bbbb";
        Assert.assertEquals(new String7().findLocal(a,b),9);
        Assert.assertEquals(new String7().findLocal(a,c),-1);
    }
}
