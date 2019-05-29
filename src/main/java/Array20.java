public class Array20 {

    public int[][] maTranCon(int a[][], int x, int y, int n, int b) {

        int c[][] = new int[b][n];

        for (int i = 0; i < b; i++) {
            for (int j = 0; j < n; j++) {
                c[i][j]=a[x+i][y+j];
            }
        }

        return c;
    }
}
