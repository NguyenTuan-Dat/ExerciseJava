public class TongNSoFibonaci {
    public long sum(long n) {
        long a = 1;
        long b = 1;
        long dem = 0;
        long kq = 0;

        while (dem++ < n) {
            kq += a;
            long c = a + b;
            a = b;
            b = c;
        }

        return kq;
    }
}
