public class Array3 {

    public int addEvenExcetpOdd(int a[]) {

        int kq = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                kq += a[i];
            } else {
                kq -= a[i];
            }
        }

        return kq;
    }
}
