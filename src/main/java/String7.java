public class String7 {
    public int findLocal(String a, String b){

        for(int i=0; i<a.length(); i++){
            if(a.charAt(i)==b.charAt(0)){
                boolean isChuoiCon = true;
                for(int j=1; j<b.length(); j++){
                    if(a.charAt(i+j)!=b.charAt(j)){
                        isChuoiCon=false;
                        break;
                    }
                }
                if(isChuoiCon) return i;
            }
        }

        return -1;
    }
}
