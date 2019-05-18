import org.junit.Assert;
import org.junit.Test;

public class KiemTraTamGiacBai15Test {

    @Test
    public void test_kiemtra(){
        double A[]={3,4,5};
        Assert.assertEquals(new KiemTraTamGiacBai15().kiemtra(A), "S=6.0, C=12.0, tam giác là tam giác vuông");
        double B[]={5,5,6};
        Assert.assertEquals(new KiemTraTamGiacBai15().kiemtra(B), "S=12.0, C=16.0, tam giác là tam giác cân");
        double C[]={2,6,7};
        Assert.assertEquals(new KiemTraTamGiacBai15().kiemtra(C), "S=5.562148865321747, C=15.0, tam giác là tam giác bình thường");
        double D[]={1,6,7};
        Assert.assertEquals(new KiemTraTamGiacBai15().kiemtra(C), "Tam giác không hợp lệ");
    }
}
