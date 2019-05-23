public class CountFibonaciSmallerN {
    public long count(long n) {
        long result = 0;
        long a = 1;
        long b = 1;
        while(a<n){
            result++;
            long c=a+b;
            a=b;
            b=c;
        }
        return result;
    }
}
