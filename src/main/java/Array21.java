public class Array21 {

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

    public int det(int a[][]) {

        int kq = 0;
        int dau = -1;
        if(a.length==1) return a[0][0];
        else {
            for(int i=0; i<a.length; i++){
                dau*=-1;
                kq+= dau*a[i][0]*det(xoaHangXoaCot(a,i,0));
            }
            return kq;
        }
    }
}
