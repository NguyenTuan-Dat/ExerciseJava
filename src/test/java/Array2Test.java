import org.junit.Assert;
import org.junit.Test;

public class Array2Test {
    @Test
    public void test_sum(){
        Integer a[]={5,4,2,1,3};
        Assert.assertEquals(new Array2().sum(a),12);
    }
}
