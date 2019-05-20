public class TinhCan {
    public double sqrt(double a) {
        double f = a;
        for(int i=0; i<1000; i++){
            f = a / 2 / f + f / 2;
        }
        return f;
    }
}
