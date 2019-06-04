import java.util.ArrayList;
import java.util.List;

public class Array6 {

    public static int[] a;

    public void swap(int x, int y) {
        int c = a[x];
        a[x] = a[y];
        a[y] = c;
    }

    public void swapV2(boolean dk, int x) {

        for (int j = x; j < a.length; j++) {

            if ((a[j] % 2 == 0) == dk && (a[x] > a[j]) == dk) swap(x, j);
        }
    }

    public int[] sortArray(int b[]) {

        a = b;

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) swapV2(true, i);
            else swapV2(false, i);
        }

        return a;
    }
}
