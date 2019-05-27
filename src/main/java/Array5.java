public class Array5 {

    public boolean isPrime(int a) {
        if (a == 1) return false;
        if (a == 2 || a == 3) return true;
        else
            for (int i = 2; i <= Math.sqrt(a); i++) {
                if (a % i == 0) return false;
            }
        return true;
    }

    public int sumPrime(int a[]) {

        int kq = 0;
        for (int i = 0; i < a.length; i++) {
            if (isPrime(a[i])) {
                kq += a[i];
            }
        }

        return kq;
    }
}
