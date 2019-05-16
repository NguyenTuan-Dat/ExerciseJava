public class Fibonaci {
    public String fibonaci(long n){
        long a=1,b=1;
        String s= "";
        while(b<=n){
            s+= a+ " ";
            long c=a+b;
            a=b;
            b=c;
        }

        s+=a;

        return s;
    }
}
