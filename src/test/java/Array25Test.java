import org.junit.Assert;
import org.junit.Test;

public class Array25Test {
    @Test
    public void test_uclcOfArray(){
        int c[] = {2,6,8};
        Assert.assertEquals(new Array25().uclnOfArray(c),2);
    }
}
