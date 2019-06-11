import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class String2Test {

    @Test
    public void test_isWord(){
        Assert.assertTrue(new String2().isWord("asdsadsd2"));
        Assert.assertFalse(new String2().isWord("asd[]asd"));
    }

    @Test
    public void test_tu(){
        String a = "asd 343adasd asdgh763-304";
        List<String> b = new ArrayList<>();
        b.add("asd");
        b.add("343adasd");
        Assert.assertEquals(new String2().tu(a),b);
    }
}
