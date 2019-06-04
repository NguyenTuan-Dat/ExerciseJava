import org.junit.Assert;
import org.junit.Test;

public class Array25Test {
    @Test
    public void test_uclcOfArray(){
        int a[] = {1,2,3};
        int b[] = {1,2,3,4};
        int c[] = {2,6,8};
        int d[] = {0,1,2,3,4};
        int e[] = {8,6,2};
        Assert.assertEquals(new Array25().uclnOfArray(a),1);
        Assert.assertEquals(new Array25().uclnOfArray(b),1);
        Assert.assertEquals(new Array25().uclnOfArray(c),2);
        Assert.assertEquals(new Array25().uclnOfArray(d),1);
        Assert.assertEquals(new Array25().uclnOfArray(e),2);
    }
}
