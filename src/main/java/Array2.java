import java.util.Arrays;

public class Array2 {

    public int sum(int a[]) {

        Arrays.sort(a, Colections.reverseOrder());

        return a[0]+a[1]+a[2];
    }
}