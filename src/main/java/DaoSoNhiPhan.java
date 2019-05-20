public class DaoSoNhiPhan {
    public long tinh(long n){
        String s="";
        while(n>0){
            if(n%2==0) s+='0';
            else s+='1';
            n/=2;
        }
        long kq=0;
        long dem=0;
        do {
            kq+=(s.charAt(s.length()-1)-'0')*Math.pow(2,dem++);
            s=s.substring(0,s.length()-1);
        }while(s.length()>0);
        return kq;
    }
}
