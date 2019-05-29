import org.junit.Assert;
import org.junit.Test;

public class Array5Test {
    @Test
    public void test_sumPrime(){
        int a[]={1,2,3,4,5,6,7,8,9};
        Assert.assertEquals(new Array5().sumPrime(a),17);
    }
}
