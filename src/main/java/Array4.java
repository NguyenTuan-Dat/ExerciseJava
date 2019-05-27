import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array4 {

    public int[] sortArray(int a[]){

        List<Integer> chan = new ArrayList<>();
        List<Integer> le = new ArrayList<>();

        for(int i=0; i<a.length; i++){
            if(a[i]%2==0){
                chan.add(a[i]);
            }
            else{
                le.add(a[i]);
            }
        }

        int b[] = chan.stream().mapToInt(Integer::intValue).toArray();
        int c[] = le.stream().mapToInt(Integer::intValue).toArray();
        Arrays.sort(b);
        Arrays.sort(c);

        int d[] = new int[a.length];
        for(int i=0; i<a.length; i++){
            if(i<b.length){
               d[i]=b[i];
            }
            else{
                d[i]=c[c.length-(i-b.length)-1];
            }
        }

        return d;
    }
}
