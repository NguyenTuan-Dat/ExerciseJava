public class TinhCan {
    public double sqrt(double a) {
        double f = a;
        double f1;
        
        do {
            f1=f;
            f = a / 2 / f + f / 2;
        } while(f1 - f > 0.00001);
        
        return f;
    }
}
