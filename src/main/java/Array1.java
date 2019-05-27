import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array1 {

    public int[] find(int a[]) {
        List<Integer> b = new ArrayList<>();
        int dem=1;
        int count=0;
        Arrays.sort(a);

        for (int i = 0; i < a.length-1; i++) {
            if(a[i]==a[i+1]){
                dem++;
            }
            else{
                if(dem>=3){
                    b.add(a[i]);
                    dem=1;
                }
            }
        }

        int c[] = new int[b.size()];
        for(int i=0; i<b.size(); i++){
            c[i]=b.get(i);
        }

        return c;
    }
}
