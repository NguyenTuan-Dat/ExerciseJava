public class DaoSoNhiPhan {
    public long tinh(long n){
        long a=0;
        while(n>0){
            a=a*10+n%2;
            n/=2;
        }
        long kq=0;
        long dem=0;
        do {
            kq+=a%10*Math.pow(2,dem++);
            a/=10;
        }while(a>0);
        return kq;
    }
}
