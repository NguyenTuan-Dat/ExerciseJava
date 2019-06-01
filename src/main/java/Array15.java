public class Array15 {

    public int[][] maTranXoanOc(int n) {
        int[][] a = new int[n][n];
        int count = 0, dem = 1;

        while (dem <= n * n) {
            for (int i = count; i < n-count; i++) {
                a[count][i] = dem++;
            }
            for (int i = count + 1; i < n-count; i++) {
                a[i][n - count - 1] = dem++;
            }
            for (int i = n - count - 2; i >= count; i--) {
                a[n - count - 1][i] = dem++;
            }
            for (int i = n - count - 2; i > count; i--) {
                a[i][count] = dem++;
            }

            count++;
        }

        return a;
    }
}

