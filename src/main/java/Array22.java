public class Array22 {

    public int[][] xoaHangXoaCot(int a[][], int x, int y) {

        int[][] b = new int[a.length - 1][a[0].length - 1];

        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                if (i >= x && j>=y) b[i][j] = a[i + 1][j+1];
                else if (i>=x && j<y) b[i][j] = a[i+1][j];
                else if(i<x && j>=y) b[i][j]=a[i][j+1];
                else b[i][j]=a[i][j];
            }
        }

        return b;
    }
}
