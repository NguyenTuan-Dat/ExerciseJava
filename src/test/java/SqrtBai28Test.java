import org.junit.Assert;
import org.junit.Test;

public class SqrtBai28Test {

    @Test
    public void test_sqrt(){
        Assert.assertEquals(new SqrtBai28().sqrt(2),1.414213562,0.001);
    }

}
