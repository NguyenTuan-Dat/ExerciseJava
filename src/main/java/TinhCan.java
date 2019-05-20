public class TinhCan {
    public double can(double a) {
        double f = a;
        for(int i=0; i<10000; i++){
            f = a / 2 / f + f / 2;
        }
        return f;
    }
}
