import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Array1 {

    public int[] find(int a[]) {
        List<Integer> b = new ArrayList<>();
        int dem=1;
        int count=0;
        Arrays.sort(a);

        for (int i = 0; i < a.length-1; i++) {
            if(a[i]==a[i+1] && i<a.length-2){
                dem++;
            }
            else{
                if(dem>=3){
                    b.add(a[i]);
                    dem=1;
                }
            }
        }


        return b.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
