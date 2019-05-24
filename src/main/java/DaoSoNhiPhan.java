public class DaoSoNhiPhan {
    public long tinh(long n){
        
        long kq=0;
        
        while(n>0){
            kq += kq * 2 + n % 2;
            n /= 2;
        }
        
        return kq;
    }
}
