import java.util.ArrayList;
import java.util.List;

public class Array6 {

    public void swap(int a[], int x, int y) {
        int c = a[x];
        a[x] = a[y];
        a[y] = c;
    }

    public int[] sortArray(int a[]) {

        List<Integer> chan = new ArrayList<>();
        List<Integer> le = new ArrayList<>();

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) chan.add(i);
            else le.add(i);
        }

        for (int i = 0; i < chan.size() - 1; i++) {
            for(int j=i+1; j< chan.size(); j++)
                if (a[chan.get(i)] > a[chan.get(j)]) {
                    swap(a, chan.get(i), chan.get(j));
                }
        }

        for (int i = 0; i < le.size() - 1; i++) {
            for(int j=i+1; j< le.size(); j++)
                if (a[le.get(i)] < a[le.get(j)]) {
                    swap(a, le.get(i), le.get(j));
                }
        }

        return a;
    }
}
