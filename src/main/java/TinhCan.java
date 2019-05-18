public class TinhCan {
    
    public double sqrt(double a) {
        double f = a;
        double can = Math.sqrt(a);
        
        while (Math.abs(can - f) > 0.000001) {
            f = a / 2 / f + f / 2;
        }
        
        return f;
    }
}
