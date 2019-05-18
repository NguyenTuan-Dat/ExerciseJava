public class Tinhe {
    public double tinhe(){
        double e=2;
        long giaithua = 1;
        long i=2;
        double E = 2.718281828;
        while(Math.abs(E-e) > 0.000001){
            giaithua*=i;
            i++;
            e += 1.0 / giaithua;
        }
        //return String.valueOf(e).substring(0,8);
        return e;
    }
}
