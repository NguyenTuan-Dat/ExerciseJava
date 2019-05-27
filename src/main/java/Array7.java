import java.util.ArrayList;
import java.util.List;

public class Array7 {

    public int[] findArray(int a[]) {

        List<Integer> max = new ArrayList<>();
        List<Integer> b = new ArrayList<>();

        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] < a[i + 1]) b.add(a[i]);
            else {
                b.add(a[i]);
                if (max.size() < b.size() + 1) {
                    max.clear();
                    max.addAll(b);
                    b.clear();
                } else b.clear();
            }
            if (i == a.length - 2) {
                b.add(a[i + 1]);
                if (max.size() < b.size() + 1) {
                    max.clear();
                    max.addAll(b);
                    b.clear();
                }
            }
        }

        return max.stream().mapToInt(Integer::intValue).toArray();
    }
}
