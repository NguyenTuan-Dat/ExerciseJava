public class TongDaySo {
    public long sum(long n){
        long a=0;
        for(int i=1; i<=n; i++){
            a+=i*(i+1);
        }
        return a;
    }
}
