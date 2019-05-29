public class Array24 {

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

    public int bcnn(int a, int b){
        return a*b/ ucLn(a,b);
    }

    public int bcnnOfArray(int a[]){

        int bc=bcnn(a[0],a[1]);

        for(int i=2; i<a.length; i++){
            bc=bcnn(bc,a[i]);
        }

        return bc;
    }
}
