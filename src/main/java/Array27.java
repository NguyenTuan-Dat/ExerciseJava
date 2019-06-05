import java.util.Arrays;
import java.util.Collections;

public class Array27 {
    public Integer[] array(Integer a[], int k) {
        Arrays.sort(a, Collections.reverseOrder());

        return Arrays.copyOfRange(a, 0, k);
    }
}
