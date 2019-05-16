public class NGiaiThua {
    public long ngiaithua(long n){
        long a=1;
        for(long i=1; i<=n; i++){
            a*=i;
        }
        return a;
    }
}
