public class Array13 {

    public int[][] xoayMang(int[][] a){

        int b[][] = new int[a[0].length][a.length];

        for(int i=0; i<a[0].length; i++){
            for(int j=0; j<a.length; j++){
                b[i][j]=a[j][i];
            }
        }

        return b;
    }
}
