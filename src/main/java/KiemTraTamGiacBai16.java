import java.util.Arrays;

public class KiemTraTamGiacBai16 {

    double dodai(double x1, double x2, double y1, double y2) {

        double x = x1 - x2;
        double y = y1 - y2;

        return Math.sqrt(x*x+y*y);
    }

    public String kiemtra(double x[], double y[]) {

        double a[] = new double[3];
        a[0] = dodai(x[0],x[1],y[0],y[1]);
        a[1] = dodai(x[1],x[2],y[1],y[2]);
        a[2] = dodai(x[2],x[0],y[2],y[0]);
        Arrays.sort(a);

        if (a[0] + a[1] <= a[2]) {

            return new String("Tam giác không hợp lệ");

        } else {

            double C = a[0] + a[1] + a[2];
            double p = C / 2;
            double area = Math.sqrt(p * (p - a[0]) * (p - a[1]) * (p - a[2]));

            String result = "S=" + area + ", C=" + C + ", tam giác là tam giác";
            if (a[2] * a[2] == a[0] * a[0] + a[1] * a[1]) {

                result += " vuông";

            } else {

                if (a[0] == a[1] || a[1] == a[2]) {

                    result += " cân";

                } else {

                    result += " bình thường";

                }
            }
            return result;
        }
    }
}
