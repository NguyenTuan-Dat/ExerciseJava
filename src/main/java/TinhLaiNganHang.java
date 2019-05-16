public class TinhLaiNganHang {

    public long tinhlai(long n){

        double a= 100;
        double lai= 1.0/n;

        for(long i=0; i<n; i++){
            a+=a*lai;
        }

        return (long)a;
    }
}
