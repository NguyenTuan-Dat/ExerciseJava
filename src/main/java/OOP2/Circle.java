package OOP2;

import java.awt.*;

public class Circle extends Shape {
    private Point o;
    private double r;

    public Circle(int x, int y, double r) {
        this.o = new Point(x, y);
        this.r = r;
    }

    @Override
    public String showInfo() {
        return "Circle: O(" + o.getX() + ", " + o.getY() + "), r = " + r;
    }

    @Override
    public double getArea() {
        return r * r * Math.PI;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * r;
    }

    @Override
    public int hashCode() {
        int result = 0;
        result = (int)(o.getX() + o.getY() - r);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (obj == this) return true;

        if (!(obj instanceof Circle)) return false;

        Circle circle = (Circle) obj;

        return circle.r == this.r && this.o.equals(circle.o);
    }
}
