import org.junit.Assert;
import org.junit.Test;

public class Array6Test {
    @Test
    public void test_sortArray(){
        int a[]={2,1,6,4,3,10,7,14,11};
        int b[]={2,11,4,6,7,10,3,14,1};
        Assert.assertArrayEquals(new Array6().sortArray(a),b);
    }
}
