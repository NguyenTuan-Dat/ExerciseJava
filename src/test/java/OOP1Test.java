import OOP1.Triangle;
import org.junit.Assert;
import org.junit.Test;

public class OOP1Test {
    @Test
    public void test_getType(){
        Triangle a = new Triangle(0,0,0,3,4,0);
        Assert.assertEquals(a.getType(), "Vuong");
        Triangle b = new Triangle(0,0,0,3,3,0);
        Assert.assertEquals(b.getType(), "Vuong Can");
        Triangle c = new Triangle(0,0,1.5,3,2,0);
        Assert.assertEquals(c.getType(), "Thuong");
        Triangle d = new Triangle(0,0,1,2,2,0);
        Assert.assertEquals(d.getType(), "Can");
        Triangle e = new Triangle(0,0,1,7,2,0);
        Assert.assertEquals(e.getType(), "Can");
        Triangle f = new Triangle(0,0,3,0,1.5,Math.sqrt(3*3-1.5*1.5));
        Assert.assertEquals(f.getType(), "Deu");
    }

    @Test
    public void test_getPerimeter(){
        Triangle a = new Triangle(0,0,0,3,4,0);
        Assert.assertEquals(a.getPerimeter(),12.0,0.0001);
    }

    @Test
    public void test_getArea(){
        Triangle a = new Triangle(0,0,0,3,4,0);
        Assert.assertEquals(a.getArea(),6.0,0.0001);
    }
}
