import java.util.Arrays;

public class Array8 {

    public int sub (int a[]){

        Arrays.sort(a);

        return a[a.length-1]-a[0];
    }
}
