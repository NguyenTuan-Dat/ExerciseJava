import org.junit.Assert;
import org.junit.Test;

public class Array3Test {
    @Test
    public void test_addEvenExcetpOdd(){
        int a[] = {2,3,4,5,6,7,8};
        Assert.assertEquals(new Array3().addEvenExcetpOdd(a),5);
    }
}
