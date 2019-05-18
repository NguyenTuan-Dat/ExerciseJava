public class TinhPiBai10 {
    public double tinhpi(){
        double pi=3;
        long i=2,a=1;

        while(Math.abs(pi-3.141592654)>0.000001){
            long mau=i*(i+1)*(i+2);
            pi+=(double)a*4/mau;
            a*=-1;
            i+=2;
        }
        return pi;
    }
}
