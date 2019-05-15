import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class UclnBcnnTest {
    @Test
    public void Test_UCLN(){
        assertEquals(new UclnBcnn().UCLN(4,6),2);
        assertEquals(new UclnBcnn().UCLN(3, 2), 1);
    }

    @Test
    public void Test_BCNN(){
        assertEquals(new UclnBcnn().BCNN(2,4),4);
        assertEquals(new UclnBcnn().BCNN(2,3),6);
    }
}