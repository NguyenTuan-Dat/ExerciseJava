import java.util.Arrays;

public class Array10 {
    public int[][] chiaMang(int[] a, int n) {

        int len = (a.length+1) / n;
        int[][] b = new int[n][len];

        for (int i = 0; i < n; i++) {
            if(a.length-1<(i+1)*len) b[i]=Arrays.copyOfRange(a,i*len, a.length);
            else b[i] = Arrays.copyOfRange(a,i*len,(i+1)*len);
        }

        return b;
    }
}
