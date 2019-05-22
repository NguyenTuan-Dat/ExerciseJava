import java.util.Arrays;

public class KiemTraTamGiacBai16 {

    double[] dodai(double X[], double Y[]) {
        double A[] = new double[3];
        A[0] = Math.sqrt(Math.pow((X[0] - X[1]), 2) + Math.pow((Y[0] - Y[1]), 2));
        A[1] = Math.sqrt(Math.pow((X[1] - X[2]), 2) + Math.pow((Y[1] - Y[2]), 2));
        A[2] = Math.sqrt(Math.pow((X[2] - X[0]), 2) + Math.pow((Y[2] - Y[0]), 2));
        return A;
    }

    public String kiemtra(double X[], double Y[]) {
        double A[] = dodai(X, Y);
        Arrays.sort(A);
        if (A[0] + A[1] <= A[2]) {
            return new String("Tam giác không hợp lệ");
        } else {
            String s = "";
            double C = A[0] + A[1] + A[2];
            double p = C / 2;
            double area = Math.sqrt(p * (p - A[0]) * (p - A[1]) * (p - A[2]));
            s = "S=" + area + ", C=" + C + ", tam giác là tam giác";
            if (A[2] * A[2] == A[0] * A[0] + A[1] * A[1]) {
                s += " vuông";
            } else {
                if (A[0] == A[1] || A[1] == A[2]) {
                    s += " cân";
                } else {
                    s += " bình thường";
                }
            }
            return s;
        }
    }
}
