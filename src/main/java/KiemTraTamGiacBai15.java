import java.util.Arrays;

public class KiemTraTamGiacBai15 {

    public String kiemtra(double A[]) {
        String s = "";
        Arrays.sort(A);
        if (A[0] + A[1] < A[2]) s = "Tam giác không hợp lệ";
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
