import org.junit.Assert;
import org.junit.Test;

public class CountFibonaciBai25Test {
    @Test
    public void test_count(){
        Assert.assertEquals(new CountFibonaciBai25().count(3,35),6);
        Assert.assertEquals(new CountFibonaciBai25().count(1,1),2);
    }
}
