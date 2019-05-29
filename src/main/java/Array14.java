public class Array14 {

    public int[] chuyenDoiMang(int[][] a) {

        int b[] = new int[a.length * a[0].length];
        int n = a[0].length;
        int m = a.length;
        int count = 0;
        int dem = 0;
        while (true) {

            for (int i = count; i < n - count; i++) {
                b[dem++] = a[count][i];
            }
            if(dem == b.length) break;

            for (int i = count + 1; i < m - count; i++) {
                b[dem++] = a[i][n - 1 - count];
            }

            for (int i = n - count - 2; i >= count; i--) {
                b[dem++] = a[m - count - 1][i];
            }
            if(dem == b.length) break;

            for (int i = m - count - 2; i > count; i--) {
                b[dem++] = a[i][count];
            }

            count++;
        }

        return b;
    }
}
