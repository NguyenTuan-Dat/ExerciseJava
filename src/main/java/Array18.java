public class Array18 {

    static int[][] b;

    public void swap(int i1, int j1, int i2, int j2) {
        int c = b[i1][j1];
        b[i1][j1] = b[i2][j2];
        b[i2][j2] = c;
    }

    public int[][] sortArray(int[][] a) {

        b = a;
        int n = a.length;
        int m = a[0].length;

        for (int j1 = 0; j1 < m; j1++) {
            for (int i1 = 0; i1 < n; i1++) {
                int j2 = j1, i2=i1;
                while (true){
                    if (a[i1][j1] > a[i2][j2]) swap(i1, j1, i2, j2);
                    if (i2 == n - 1) {
                        i2 = -1;
                        j2++;
                        if (j2 == m) break;
                    }
                    i2++;
                }
            }
        }

        return b;
    }
}
