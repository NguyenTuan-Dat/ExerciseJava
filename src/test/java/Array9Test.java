import org.junit.Assert;
import org.junit.Test;

public class Array9Test {
    @Test
    public void test_binarySearch(){
        int a[]={1,2,3,4,5,6,7,8,9};
        Assert.assertEquals(new Array9().binarySearch(a,8),8);
        Assert.assertEquals(new Array9().binarySearch(a,9),9);
        Assert.assertEquals(new Array9().binarySearch(a,0),-1);
    }
}
