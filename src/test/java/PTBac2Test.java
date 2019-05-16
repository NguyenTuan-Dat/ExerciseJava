import org.junit.Assert;
import org.junit.Test;

public class PTBac2Test {
    @Test
    public void test_giaiphuongtrinh(){
        Assert.assertEquals(new PTBac2().giaiphuongtrinh(1,2,3), "Phương trình vô nghiệm");
        Assert.assertEquals(new PTBac2().giaiphuongtrinh(1,4,4), "x1= -2.0, x2= -2.0");
        Assert.assertEquals(new PTBac2().giaiphuongtrinh(1,4,3), "x1= -1.0, x2= -3.0");
    }
}
