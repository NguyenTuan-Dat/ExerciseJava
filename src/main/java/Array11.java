
import java.util.ArrayList;
import java.util.List;

public class Array11 {
    public static boolean swapped[];
    public static int b[];

    public static void swap(boolean even, int x) {
        for (int i = b.length - 1; i >= 0; i--)
            if ((!swapped[i]) && (((b[i] % 2) == 0) == even)) {
                swapped[i] = true;
                swapped[x] = true;
                int c = b[x];
                b[x] = b[i];
                b[i] = c;
                break;
            }

    }

    public static int[] swapEvenAndOdd(int a[]) {

        b = a;
        swapped = new boolean[a.length];
        for(int i=0; i<a.length; i++) swapped[i]=false;

        for (int i = 0; i < a.length; i++) {
            boolean even;
            if (b[i] % 2 == 0 && !swapped[i]) {
                even = true;
            } else even = false;
            swap(even,i);
        }

        return b;
    }
}
