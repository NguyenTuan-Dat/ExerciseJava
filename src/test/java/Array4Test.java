import org.junit.Assert;
import org.junit.Test;

public class Array4Test {
    @Test
    public void test_sortArray(){
        int a[]={1,2,3,4,5,6,7,8,9};
        int b[]={2,4,6,8,9,7,5,3,1};
        Assert.assertArrayEquals(new Array4().sortArray(a),b);
    }

}
