public class TinhPiBai10 {
    public double tinhpi(){
        double pi=3;
        long i=2,a=1;
        double PI;
        do {
            long mau=i*(i+1)*(i+2);
            PI=pi;
            pi+=(double)a*4/mau;
            a*=-1;
            i+=2;
        } while(Math.abs(pi-PI)>0.000001);
        return pi;
    }
}
