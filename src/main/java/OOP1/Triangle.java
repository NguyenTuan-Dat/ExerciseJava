package OOP1;

import java.awt.geom.Point2D;
import java.util.Arrays;

public class Triangle {
    double x1, x2, x3, y1, y2, y3;

    public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        this.P1.setLocation(x1, y1);
        this.P2.setLocation(x2, y2);
        this.P3.setLocation(x3, y3);
    }

    public String getType() {
        double c[] = new double[3];
        c[0] = P1.distance(P2);
        c[1] = P2.distance(P3);
        c[2] = P1.distance(P3);
        Arrays.sort(c);

        if (c[0] == c[2]) return "Deu";
        else {
            if (c[0] == c[1] || c[1] == c[2]
                    && c[2] * c[2] == c[0] * c[0] + c[1] * c[1]) return "Vuong Can";
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
        c[0] = P1.distance(P2);
        c[1] = P2.distance(P3);
        c[2] = P1.distance(P3);

        return c[1]+c[2]+c[0];
    }

    public double getArea(){
        double c[] = new double[3];
        c[0] = P1.distance(P2);
        c[1] = P2.distance(P3);
        c[2] = P1.distance(P3);
        double p = getPerimeter()/2;

        return Math.sqrt(p*(p-c[0])*(p-c[1])*(p-c[2]));
    }
}
