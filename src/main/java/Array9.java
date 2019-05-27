import java.util.Arrays;

public class Array9 {

    public int binarySearch(int a[], int b) {

        Arrays.sort(a);
        int i = 0;
        int f = a.length;

        while (i!=f) {
            int mid = (i + f) / 2;
            if (a[mid] == b) return a[mid];
            else {
                if (a[mid] < b) {
                    i = mid;
                } else {
                    f = mid;
                }
            }
        }

        return -1;
    }
}
