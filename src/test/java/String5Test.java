import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class String5Test {
    @Test
    public void test_findWords(){
        String a = "asd hhh asd aa hhh asd asd";
        List<String> b = new ArrayList<>();
        b.add("asd");
        b.add("hhh");
        Assert.assertEquals(new String5().findWords(a), b);
    }
}
