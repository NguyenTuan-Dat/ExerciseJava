import org.junit.Assert;
import org.junit.Test;

public class String11Test {
    @Test
    public void test_tachSo(){
        String a = "222123-1111";
        int[] b = {222123,1111};
        Assert.assertArrayEquals(new String11().tachSo(a),b);
        String e = "5<<2";
        int[] c = {5,2};
        Assert.assertArrayEquals(new String11().tachSo(e),c);
    }

    @Test
    public void test_tinh(){
        String a = "222123-1111";
        Assert.assertEquals(new String11().tinh(a),221012);

        String b = "222123+1111";
        Assert.assertEquals(new String11().tinh(b),223234);

        String c = "222123*1111";
        Assert.assertEquals(new String11().tinh(c),246778653);

        String d = "222123/1111";
        Assert.assertEquals(new String11().tinh(d),199);

        String e = "5<<2";
        Assert.assertEquals(new String11().tinh(e),20);

        String f = "8>>3";
        Assert.assertEquals(new String11().tinh(f),1);

        String g = "213";
        Assert.assertEquals(new String11().tinh(g), -1);
    }
}
