public class TinhPiBai10 {
    public String tinhpi(){
        double pi=3;
        long i=2,a=1;
        while(pi-3.141592654>0.000001 || 3.141592654-pi>0.000001){
            long mau=i*(i+1)*(i+2);
            pi+=(double)a*4/mau;
            a*=-1;
            i+=2;
        }
        String s=String.valueOf(pi);
        s=s.substring(0,7);
        return s;
    }
}
