import org.junit.Assert;
import org.junit.Test;

public class Array15Test {

    @Test
    public void test_maTranXoanOc(){
        int a[][] = {{1,2,3,4,5},{16,17,18,19,6},{15,24,25,20,7},{14,23,22,21,8},{13,12,11,10,9}};
        Assert.assertArrayEquals(new Array15().maTranXoanOc(5),a);
    }

}
