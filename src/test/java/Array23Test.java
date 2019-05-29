import org.junit.Assert;
import org.junit.Test;

public class Array23Test {
    @Test
    public void test_tongDaySoTuNhien(){
        int a[] = {0, 1, -2, 8, 9, 0, 1, -2, 1, 1, 3, 1, 1};
        Assert.assertEquals(new Array23().tongDaySoTuNhien(a),18);
    }
}
