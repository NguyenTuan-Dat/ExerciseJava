package OOP2;

import java.awt.*;

public class Quadrilateral extends Shape {

    private Point p1;
    private Point p2;
    private Point p3;
    private Point p4;

    public Quadrilateral(Point a, Point b, Point c, Point d) {
        this.p1 = a;
        this.p2 = b;
        this.p3 = c;
        this.p4 = d;
    }

    public Quadrilateral(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        this(
                new Point(x1, y1),
                new Point(x2, y2),
                new Point(x3, y3),
                new Point(x4, y4));
    }

    @Override
    public String showInfo() {
        return "Quadrilateral: A(" + p1.getX() + ", " + p1.getY() + "); B(" + p2.getX() + ", "
                + p2.getY() + "); C(" + p3.getX() + ", " + p3.getY() + "); D(" + p4.getX() + ", " + p4.getY() + ")";
    }

    @Override
    public double getArea() {
        Triangle t1 = new Triangle(p1, p2, p3);
        Triangle t2 = new Triangle(p1, p4, p3);
        Triangle t3 = new Triangle(p2, p3, p4);
        Triangle t4 = new Triangle(p2, p1, p4);

        double area1 = t1.getArea() + t2.getArea();
        double area2 = t3.getArea() + t4.getArea();

        return (area1 < area2) ? area1 : area2;
    }

    @Override
    public double getPerimeter() {
        double l1 = p1.distance(p2);
        double l2 = p2.distance(p3);
        double l3 = p3.distance(p4);
        double l4 = p4.distance(p1);

        return l1 + l2 + l3 + l4;
    }

    @Override
    public int hashCode(){
        return (int)(p1.getX() + p2.getX() + p3.getX() + p4.getX()
                + p1.getY() + p2.getY() + p3.getY() + p4.getY());
    }

    @Override
    public boolean equals(Object obj){
        if(obj == null) return false;
        if(obj == this) return true;

        if(! (obj instanceof Quadrilateral)) return false;

        Quadrilateral quadrilateral = (Quadrilateral) obj;

        return quadrilateral.p1.equals(this.p1)
                && quadrilateral.p2.equals(this.p2)
                && quadrilateral.p3.equals(this.p3)
                && quadrilateral.p4.equals(this.p4);

    }

}
