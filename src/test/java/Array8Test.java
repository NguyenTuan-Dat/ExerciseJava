import org.junit.Assert;
import org.junit.Test;

public class Array8Test {
    @Test
    public void test_sub(){
        int a[] = {6,7,8,9,1,2,5,7};
        Assert.assertEquals(new Array8().sub(a),8);
    }
}
