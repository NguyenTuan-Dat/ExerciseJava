public class Tinhe {
    public String tinhe(){
        double e=2;
        long giaithua = 1;
        long i=2;
        double E = 2.718281828;
        while(e-E>0.000001 || E-e>0.000001){
            giaithua*=i;
            i++;
            e+=1.0/giaithua;
        }
        return String.valueOf(e).substring(0,8);
    }
}
