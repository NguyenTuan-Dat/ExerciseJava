public class TinhPiBai9 {
    public double tinhpi(){
        double pi=0;
        int a=1;
        long i=1;
        double PI;
        do {
            PI=pi;
            pi += (double)a * 4 / i;
            a *= -1;
            i+=2;
        }while(Math.abs(PI-pi)>0.000001);
        return pi;
    }
}
