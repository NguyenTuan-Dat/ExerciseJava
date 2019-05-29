import org.junit.Assert;
import org.junit.Test;

public class Array24Test {

    @Test
    public void test_bcnnOfArray(){
        int a[]={1,2,3};
        int b[]={1,2,3,4};
        Assert.assertEquals(new Array24().bcnnOfArray(a),6);
        Assert.assertEquals(new Array24().bcnnOfArray(b),12);
    }
}
