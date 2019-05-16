public class TinhPiBai9 {
    public String tinhpi(){
        double pi=0;
        int a=1;
        long i=1;
        while(pi-3.141592654>0.000001 || 3.141592654-pi>0.000001){
            pi += (double)a * 4 / i;
            a *= -1;
            i+=2;
        }
        String s= String.valueOf(pi);
        s=s.substring(0,6);
        return s;
    }
}
