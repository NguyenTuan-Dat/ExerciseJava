import org.junit.Assert;
import org.junit.Test;

public class Array21Test {
    @Test
    public void test_det(){
        int a[][] = {{-2,2,-3},{-1,1,3},{2,0,-1}};
        Assert.assertEquals(new Array21().det(a),18);
    }
}
