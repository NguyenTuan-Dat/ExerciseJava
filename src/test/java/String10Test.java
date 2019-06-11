import org.junit.Assert;
import org.junit.Test;

public class String10Test {
    @Test
    public void test_khaiTrien() {
        String a = "ab14c5a";
        String b = "abbbbbbbbbbbbbbccccca";
        String c = "ab14c5";
        String d = "abbbbbbbbbbbbbbccccc";
        Assert.assertEquals(new String10().khaiTrien(c), d);
    }
}
