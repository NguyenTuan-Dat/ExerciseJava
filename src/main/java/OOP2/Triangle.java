package OOP2;

import java.awt.*;

public class Triangle extends Shape {

    private Point p1;
    private Point p2;
    private Point p3;

    public Triangle(Point A, Point B, Point C) {
        this.p1 = A;
        this.p2 = B;
        this.p3 = C;
    }

    public Triangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        this(new Point(x1, y1),
                new Point(x2, y2),
                new Point(x3, y3));
    }

    @Override
    public String showInfo() {
        return "Triangle: A(" + p1.getX() + ", " + p1.getY() + "); B(" + p2.getX() + ", "
                + p2.getY() + "); C(" + p3.getX() + ", " + p3.getY() + ")";
    }

    @Override
    public double getPerimeter() {
        double c[] = new double[3];
        c[0] = p1.distance(p2);
        c[1] = p2.distance(p3);
        c[2] = p1.distance(p3);

        return c[1] + c[2] + c[0];
    }

    @Override
    public double getArea() {
        double c[] = new double[3];
        c[0] = p1.distance(p2);
        c[1] = p2.distance(p3);
        c[2] = p1.distance(p3);
        double p = getPerimeter() / 2;

        return Math.sqrt(p * (p - c[0]) * (p - c[1]) * (p - c[2]));
    }

    @Override
    public int hashCode() {
        int result = 0;
        result = (int) (p1.getX() + p2.getX() + p3.getX() - p1.getY() - p2.getY() - p3.getY());
        return result;
    }

    @Override
    public boolean equals(Object obj){
        if(obj == null) return false;
        if(obj == this) return true;

        if(!(obj instanceof Triangle)) return false;

        Triangle triangle = (Triangle)obj;

        return triangle.p1.equals(this.p1)
                && triangle.p2.equals(this.p2)
                && triangle.p3.equals(this.p3);
    }
}
