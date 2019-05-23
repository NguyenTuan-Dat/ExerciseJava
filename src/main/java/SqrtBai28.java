public class SqrtBai28 {

    public double sqrt(double n) {

        double a = 0, b = n;
        double x;

        do {
            x = (a + b) / 2;
            if (x * x - n < 0) a = x;
            else b = x;
        } while (b - a > 0.0001);

        return x;
    }

}
