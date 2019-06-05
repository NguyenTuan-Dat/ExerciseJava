
import java.util.ArrayList;
import java.util.List;

public class Array11 {
    public static boolean swapped[] = {false, false, false};
    public static int b[] = {1,2,3};

    public int[] swap(boolean even, int x) {
        for (int i = b.length - 1; i >= 0; i--)
            if ((!swapped[i]) && (((b[i] % 2) == 0) == even)) {
                swapped[i] = true;
                swapped[x] = true;
                int c = b[x];
                b[x] = b[i];
                b[i] = c;
                break;
            }
        return b;
    }

    public int[] swapEvenAndOdd(int a[]) {

        b = a;
        swapped = new boolean[a.length];
        for (int i = 0; i < a.length; i++) swapped[i] = false;

        for (int i = 0; i < a.length; i++) {
            boolean even = b[i] % 2 == 0 && !swapped[i];
            swap(even, i);
        }

        return b;
    }
}
