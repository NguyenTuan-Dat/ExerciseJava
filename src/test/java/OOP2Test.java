import OOP2.*;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class OOP2Test {
    @Test
    public void test_shapeFatory() {
        String[] a = {"3", "0 0 3", "0 3 0 4 3 0", "0 0 0 1 1 1 1 0"};
        List<Shape> b = new ArrayList<>();
        b.add(new Circle(0, 0, 3));
        b.add(new Triangle(0, 3, 0, 4, 3, 0));
        b.add(new Quadrilateral(0, 0, 0, 1, 1, 1, 1, 0));

        assertArrayEquals(new ShapeFactory().shapeFactory(a).toArray(), b.toArray());
    }

    @Test
    public void test_showInfo(){
        Circle a = new Circle(4,5,8);
        assertEquals(a.showInfo(),"Circle: O(4.0, 5.0), r = 8.0");

        Triangle b = new Triangle(1,2,3,4,5,6);
        assertEquals(b.showInfo(),"Triangle: A(1.0, 2.0); B(3.0, 4.0); C(5.0, 6.0)");

        Quadrilateral c = new Quadrilateral(1,2,3,4,5,6,7,8);
        assertEquals(c.showInfo(),"Quadrilateral: A(1.0, 2.0); B(3.0, 4.0); C(5.0, 6.0); D(7.0, 8.0)");
    }

    @Test
    public void test_getArea(){
        Circle a = new Circle(6,8, 2);
        assertEquals(a.getArea(),12.56637061,0.0001);

        Triangle b = new Triangle(0,0,0,3,4,0);
        Assert.assertEquals(b.getArea(),6.0,0.0001);

        Quadrilateral c = new Quadrilateral(0,0,0,4,6,4,6,0);
        Assert.assertEquals(c.getArea(), 24.0,0.00001);

    }

    @Test
    public void test_getPerimeter(){
        Circle a = new Circle(6,7,1);
        assertEquals(a.getPerimeter(), 6.2831853071, 0.0001);

        Triangle b = new Triangle(0,0,0,3,4,0);
        Assert.assertEquals(b.getPerimeter(),12.0,0.0001);

        Quadrilateral c = new Quadrilateral(0,0,0,4,6,4,6,0);
        assertEquals(c.getPerimeter(), 20, 0.00001);
    }

}
