import org.junit.Assert;
import org.junit.Test;

public class String6Test {
    @Test
    public void test_xuLyChuoi(){
        String a = "aabbbBBBa65a";
        String b = "AABBBbbbA65A";
        Assert.assertEquals(new String6().xuLyChuoi(a),b);
    }
}
