public class Tinhe {
    public double tinhe(){
        double e=2;
        long giaithua = 1;
        long i=2;
        double E;
        do {
            giaithua*=i;
            i++;
            E=e;
            e += 1.0 / giaithua;
        }while(e-E > 0.000001);
        //return String.valueOf(e).substring(0,8);
        return e;
    }
}
