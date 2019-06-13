import OOP2.*;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class OOP2Test {
    @Test
    public void test_shapeFatory() {
        String[] a = {"3", "0 0 3", "0 3 0  4 3 0", "0 0 0 1 1 1 1 0"};
        List<Shape> b = new ArrayList<>();
        b.add(new Circle(0, 0, 3));
        b.add(new Triangle(0, 3, 0, 4, 3, 0));
        b.add(new Quadrilateral(0, 0, 0, 1, 1, 1, 1, 0));

        assertArrayEquals(new ShapeFactory().shapeFactory(a).toArray(), b.toArray());
    }

    @Test
    public void test_showInfo() {
        Circle a = new Circle(4, 5, 8);
        assertEquals(a.showInfo(), "Circle: O(4.0, 5.0), r = 8.0");

        Triangle b = new Triangle(1, 2, 3, 4, 5, 6);
        assertEquals(b.showInfo(), "Triangle: A(1.0, 2.0); B(3.0, 4.0); C(5.0, 6.0)");

        Quadrilateral c = new Quadrilateral(1, 2, 3, 4, 5, 6, 7, 8);
        assertEquals(c.showInfo(), "Quadrilateral: A(1.0, 2.0); B(3.0, 4.0); C(5.0, 6.0); D(7.0, 8.0)");
    }

    @Test
    public void test_getArea() {
        Circle a = new Circle(6, 8, 2);
        assertEquals(a.getArea(), 12.56637061, 0.0001);

        Triangle b = new Triangle(0, 0, 0, 3, 4, 0);
        Assert.assertEquals(b.getArea(), 6.0, 0.0001);

        Quadrilateral c = new Quadrilateral(0, 0, 0, 4, 6, 4, 6, 0);
        Assert.assertEquals(c.getArea(), 24.0, 0.00001);

        Quadrilateral d = new Quadrilateral(0, 0, 0, 2, 1, 2, 1, -1);
        Assert.assertEquals(d.getArea(), 2.5, 0.00001);

    }

    @Test
    public void test_getPerimeter() {
        Circle a = new Circle(6, 7, 1);
        assertEquals(a.getPerimeter(), 6.2831853071, 0.0001);

        Triangle b = new Triangle(0, 0, 0, 3, 4, 0);
        Assert.assertEquals(b.getPerimeter(), 12.0, 0.0001);

        Quadrilateral c = new Quadrilateral(0, 0, 0, 4, 6, 4, 6, 0);
        assertEquals(c.getPerimeter(), 20, 0.00001);
    }

    @Test
    public void test_hashCode() {
        Circle a = new Circle(0, 0, 4);
        assertEquals(a.hashCode(), -4);

        Triangle b = new Triangle(0, 0, 0, 3, 4, 0);
        assertEquals(b.hashCode(), 1);

        Quadrilateral c = new Quadrilateral(0, 0, 0, 4, 6, 4, 6, 0);
        assertEquals(c.hashCode(), 20);
    }

    @Test
    public void test_equals() {
        Circle a = new Circle(0, 0, 4);
        Circle b = null;
        Shape c = new Quadrilateral(0, 0, 0, 4, 6, 4, 6, 0);
        Circle d = new Circle(1, 1, 4);
        Circle d1 = new Circle(0, 0, 3);
        assertTrue(a.equals(a));
        assertFalse(a.equals(b));
        assertFalse(a.equals(c));
        assertFalse(a.equals(d));
        assertFalse(a.equals(d1));

        Triangle e = new Triangle(0, 0, 1, 1, 2, 2);
        Triangle f = null;
        Triangle g = new Triangle(1, 1, 0, 5, 2, 1);
        Triangle g1 = new Triangle(0, 0, 0, 5, 2, 1);
        Triangle g2 = new Triangle(0, 0, 1, 1, 2, 1);
        assertTrue(e.equals(e));
        assertFalse(e.equals(f));
        assertFalse(e.equals(c));
        assertFalse(e.equals(g));
        assertFalse(e.equals(g1));
        assertFalse(e.equals(g2));

        Quadrilateral h = new Quadrilateral(1,2,3,4,5,6,7,8);
        Quadrilateral i = null;
        Quadrilateral k = new Quadrilateral(3,1,2,5,1,4,8,8);
        Quadrilateral k1 = new Quadrilateral(1,2,2,5,1,4,8,8);
        Quadrilateral k2 = new Quadrilateral(1,2,3,4,1,4,8,8);
        Quadrilateral k3 = new Quadrilateral(1,2,3,4,5,6,8,8);
        Shape l = new Circle(0,0,3);
        assertTrue(h.equals(h));
        assertFalse(h.equals(i));
        assertFalse(h.equals(l));
        assertFalse(h.equals(k));
        assertFalse(h.equals(k1));
        assertFalse(h.equals(k2));
        assertFalse(h.equals(k3));
    }

    @Test
    public void test_toString(){
        Shape a = new Circle(4, 5, 8);
        assertEquals(a.toString(), "Circle: O(4.0, 5.0), r = 8.0");
    }
}
