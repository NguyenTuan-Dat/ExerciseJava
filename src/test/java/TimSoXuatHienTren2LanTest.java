import org.junit.Assert;
import org.junit.Test;

public class TimSoXuatHienTren2LanTest {
    @Test
    public void test_find(){
        int a[] = {2,2,3,2,4,4,61,6,6,6,4};
        int b[] = {2,4,6};
        Assert.assertArrayEquals(new TimSoXuatHienTren2Lan().find(a),b);
    }
}
