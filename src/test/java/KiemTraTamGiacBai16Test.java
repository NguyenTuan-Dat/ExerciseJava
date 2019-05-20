import org.junit.Assert;
import org.junit.Test;

public class KiemTraTamGiacBai16Test {

    @Test
    public void test_kiemtra(){
        double AX[]={0,0,4};
        double AY[]={0,3,0};
        Assert.assertEquals(new KiemTraTamGiacBai16().kiemtra(AX,AY), "S=6.0, C=12.0, tam giác là tam giác vuông");
        double BX[]={0,3,6};
        double BY[]={0,4,0};
        Assert.assertEquals(new KiemTraTamGiacBai16().kiemtra(BX,BY), "S=12.0, C=16.0, tam giác là tam giác cân");
        double CX[]={0,1.5,2};
        double CY[]={0,3,0};
        String s="S=2.999999999999999, C=8.395483231398794, tam giác là tam giác bình thường";
        Assert.assertEquals(new KiemTraTamGiacBai16().kiemtra(CX,CY), s);
        double DX[]={1,6,7};
        double DY[]={0,0,0};
        Assert.assertEquals(new KiemTraTamGiacBai16().kiemtra(DX,DY), "Tam giác không hợp lệ");
        double EX[]={0,2.5,5};
        double EY[]={0,Math.sqrt(29.75),0};
        Assert.assertEquals(new KiemTraTamGiacBai16().kiemtra(EX,EY), "S=13.635890143294644, C=17.0, tam giác là tam giác cân");
    }
}
