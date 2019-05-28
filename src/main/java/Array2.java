
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Array2 {

    public int sum(Integer[] a) {

        Arrays.sort(a, Collections.reverseOrder());

        return a[0] + a[1] + a[2];
    }
}
