public class CrazyFibonaci {

    public int findN(int a[], int n) {

        long kq = 0;

        if (n < 5) return a[n-1];

        for (int i = 5; i <= n; i++) {
            int c = 0;

            for (int j = 0; j < 5; j++) {
                c += a[j];
                if (j < 4)
                    a[j] = a[j + 1];
            }

            a[4] = c % 10;
        }
        return a[4];
    }

}
