import org.junit.Assert;
import org.junit.Test;

public class String3Test {
    @Test
    public void test_isChuoiDoiXung(){
        Assert.assertTrue(new String3().isChuoiDoiXung("aabbaa"));
    }
}
