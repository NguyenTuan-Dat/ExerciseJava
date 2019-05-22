public class UclnBcnn {
    public int UCLN(int a, int b){
        while(a>0 && b>0){
            if(a>b){
                a=a%b;
            }
            else{
                b=b%a;
            }
        }
        if(a!=0) return a;
        else return b;
    }

    public int BCNN(int a, int b){
        return a*b/UCLN(a,b);
    }
}