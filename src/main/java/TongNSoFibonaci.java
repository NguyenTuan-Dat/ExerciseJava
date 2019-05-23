public class TongNSoFibonaci {
    public long sum(long n) {
        long a = 1;
        long b = 1;
        long dem = 2;
        long kq = 2;
        while (dem++ < n) {
            long c = a + b;
            a = b;
            b = c;
            kq += b;
        }
        return kq;
    }
}
