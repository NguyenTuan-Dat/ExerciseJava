public class Array22 {

    public int[][] xoaHangXoaCot(int a[][], int x, int y) {

        int[][] b = new int[a.length - 1][a[0].length - 1];

        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                int k = 0, l = 0;
                if (i >= x) k = 1;
                if (j >= y) l = 1;
                b[i][j] = a[i + k][j + l];
            }
        }

        return b;
    }
}
