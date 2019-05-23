public class CountFibonaciBai25 {

    public long count(long m, long n) {

        long a = 1, b = 1;
        long dem=0;

        while(a<=n){
            if(a>=m) dem++;
            long c = a+b;
            a=b;
            b=c;
        }

        return dem;
    }

}
