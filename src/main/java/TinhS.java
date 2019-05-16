public class TinhS {
    public String S(long n){
        double s=2;
        long giaithua=1;
        for(int i=2; i<=n; i++){
            giaithua*=i;
            s+=1.0/giaithua;
        }
        return String.valueOf(s);
    }
}
