public class TinhPiBai9 {
    public double pi() {
        double pi = 0, p;
        int a = 1;
        long i = 1;

        do {
            p = pi;
            pi += (double) a * 4 / i;
            a *= -1;
            i += 2;
        } while (Math.abs(p - pi) > 0.000001);

        return pi;
    }
}
