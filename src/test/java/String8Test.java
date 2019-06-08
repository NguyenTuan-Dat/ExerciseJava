import org.junit.Assert;
import org.junit.Test;

public class String8Test {
    @Test
    public void test_chuanHoa(){
        String a = "as d sj dhfg. hasdg!    jad? iek";
        String b = "As d sj dhfg. Hasdg! Jad? Iek";
        Assert.assertEquals(new String8().chuanHoa(a),b);

        String c = "a! adsSAsd.asdha?adjhaJD!djahdjahd?";
        String d = "A! Adssasd. Asdha? Adjhajd! Djahdjahd?";
        Assert.assertEquals(new String8().chuanHoa(c),d);
    }
}
