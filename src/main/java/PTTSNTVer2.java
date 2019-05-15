public class PTTSNTVer2 {
    public String phantich(long a){
        String s="";
        for(long i=2; i<a; i++){
            int dem=0;
            while(a%i==0){
                dem++;
                a/=i;
            }
            if (dem==1) s+= i + " * ";
            else {
                if (dem > 1) s += i + "^" + dem + " * ";
            }
        }
        s=s.substring(0,s.length()-3);
        return s;
    }
}
