import java.util.Arrays;

public class KiemTraTamGiacBai16 {

    public String kiemtra(double X[], double Y[]) {
        String s = "";
        double A[] = new double[3];
        A[0]=Math.sqrt(Math.pow((X[0]-X[1]),2)+Math.pow((Y[0]-Y[1]),2));
        A[1]=Math.sqrt(Math.pow((X[1]-X[2]),2)+Math.pow((Y[1]-Y[2]),2));
        A[2]=Math.sqrt(Math.pow((X[2]-X[0]),2)+Math.pow((Y[2]-Y[0]),2));
        Arrays.sort(A);
        if (A[0] + A[1] <= A[2]) s = "Tam giác không hợp lệ";
        else {
            double C = A[0] + A[1] + A[2];
            double p = C / 2;
            double S = Math.sqrt(p * (p - A[0]) * (p - A[1]) * (p - A[2]));
            s = "S=" + S + ", C=" + C + ", tam giác là tam giác";
            if (A[2] == Math.sqrt(A[0] * A[0] + A[1] * A[1])) {
                s += " vuông";
            }
            if (A[0] == A[1] || A[1] == A[2]) {
                s += " cân";
            }
            if (s.charAt(s.length() - 1) == 'c') {
                s += " bình thường";
            }
        }

        return s;
    }
}
