public class PTThuaSoNguyenTo {
    public String phantich(long a){
        String s ="";
        for(int i=2;i<=a;i++){
            while(a%i==0){
                s+= i + " * ";
                a/=i;
            }
        }
        s=s.substring(0,s.length()-3);
        return s;
    }
}
