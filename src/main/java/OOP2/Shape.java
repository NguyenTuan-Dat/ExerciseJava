package OOP2;

public abstract class Shape {
    public abstract String showInfo();

    public abstract double getArea();

    public abstract double getPerimeter();

    @Override
    public String toString() {
        return showInfo();
    }
}
