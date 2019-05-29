public class Array25 {
    public int ucLn(int a, int b){
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

    public int uclnOfArray(int a[]){

        int uc = ucLn(a[0],a[1]);

        for(int i=2; i<a.length; i++){
            uc=ucLn(uc,a[i]);
        }

        return uc;
    }
}
