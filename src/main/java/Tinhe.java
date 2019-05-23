public class Tinhe {
    public double tinhe(){
        double e = 2;
        long giaithua = 1;
        long i = 2;
        double euler;
        do {
            giaithua *= i;
            i++;
            euler = e;
            e += 1.0 / giaithua;
        }while(e - euler > 0.000001);
        
        return e;
    }
}
