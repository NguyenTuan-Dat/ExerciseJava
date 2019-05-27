import java.util.Arrays;

public class Array2 {

    public int sum(int a[]) {

        Arrays.sort(a);
        int kq = 0;

        for (int i = a.length - 3; i < a.length; i++) {
            kq += a[i];
        }

        return kq;
    }
}
