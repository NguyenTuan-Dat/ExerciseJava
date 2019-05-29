import java.util.Arrays;

public class Array19 {

    public int[][] maTranXoanOc(int a[][], int c[]) {
        int count = 0, dem = 0;
        int n = a[0].length, m = a.length;

        while (true) {
            for (int i = count; i < n - count; i++) {
                a[count][i] = c[dem++];
            }
            if (dem == n * m) break;

            for (int i = count + 1; i < m - count; i++) {
                a[i][n - count - 1] = c[dem++];
            }

            for (int i = n - count - 2; i >= count; i--) {
                a[m - count - 1][i] = c[dem++];
            }
            if (dem == n * m) break;

            for (int i = m - count - 2; i > count; i--) {
                a[i][count] = c[dem++];
            }

            count++;
        }

        return a;
    }

    public int[][] sxMaTranXoanOc(int a[][]) {

        int b[] = new int[a.length * a[0].length];
        int dem = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                b[dem++] = a[i][j];
            }
        }
        Arrays.sort(b);
        return maTranXoanOc(a, b);
    }
}
