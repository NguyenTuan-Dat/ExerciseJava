package OOP1;

import java.util.Arrays;

public class Triangle {
    double x1, x2, x3, y1, y2, y3;

    public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        this.x1 = x1;
        this.x2 = x2;
        this.x3 = x3;
        this.y1 = y1;
        this.y2 = y2;
        this.y3 = y3;
    }

    private double canh(double x1, double y1, double x2, double y2) {
        double a = x1 - x2;
        double b = y1 - y2;

        return Math.sqrt(a * a + b * b);
    }

    public String getType() {
        double c[] = new double[3];
        c[0] = canh(x1, y1, x2, y2);
        c[1] = canh(x1, y1, x3, y3);
        c[2] = canh(x3, y3, x2, y2);
        Arrays.sort(c);

        if (c[0] == c[2]) return "Deu";
        else {
            if (c[0] == c[1] && c[2] * c[2] == c[0] * c[0] + c[1] * c[1]) return "Vuong Can";
            else{
                if(c[0]==c[1] || c[1]==c[2]) return "Can";
                else{
                    if(c[2] * c[2] == c[1] * c[1] + c[0] * c[0]) return "Vuong";
                    else return "Thuong";
                }
            }
        }
    }

    public double getPerimeter(){
        double c[] = new double[3];
        c[0] = canh(x1, y1, x2, y2);
        c[1] = canh(x1, y1, x3, y3);
        c[2] = canh(x3, y3, x2, y2);

        return c[1]+c[2]+c[0];
    }

    public double getArea(){
        double c[] = new double[3];
        c[0] = canh(x1, y1, x2, y2);
        c[1] = canh(x1, y1, x3, y3);
        c[2] = canh(x3, y3, x2, y2);
        double p = getPerimeter()/2;

        return Math.sqrt(p*(p-c[0])*(p-c[1])*(p-c[2]));
    }
}
