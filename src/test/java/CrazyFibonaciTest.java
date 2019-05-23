import org.junit.Assert;
import org.junit.Test;

public class CrazyFibonaciTest {

    @Test
    public void test_findN(){
        int a[] = {6,2,2,1,4};
        Assert.assertEquals(new CrazyFibonaci().findN(a,5),4);
        Assert.assertEquals(new CrazyFibonaci().findN(a,3),1);
    }

}
