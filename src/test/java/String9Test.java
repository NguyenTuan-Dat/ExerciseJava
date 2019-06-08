import org.junit.Assert;
import org.junit.Test;

public class String9Test {
    @Test
    public void test_rutGon(){
        String a = "abcccceeeeeefd";
        String b = "abc4e6fd";
        String c = "abbbbbbbbbbbbbcc";
        String d = "ab13c2";
        Assert.assertEquals(new String9().rutGon(a),b);
        Assert.assertEquals(new String9().rutGon(c),d);
    }
}
