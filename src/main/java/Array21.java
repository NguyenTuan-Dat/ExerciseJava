public class Array21 {

    public int det(int a[][]) {

        int kq = 0;
        int[][] b = new int[a.length + 2][a.length];

        for (int i = 0; i < a.length + 2; i++) {
            for (int j = 0; j < a.length; j++) {
                if (i < a.length) b[i][j] = a[i][j];
                else b[i][j]=a[i-a.length][j];
            }
        }

        for(int i=0; i<a.length; i++){
            int s=1;
            for(int j=0; j<a.length; j++){
                s*=b[i+j][j];
            }
            kq+=s;
            s=1;
            for(int j=a.length-1; j>=0; j--){
                s*=b[a.length-1+i-j][j];
            }
            kq-=s;
        }

        return kq;
    }
}
