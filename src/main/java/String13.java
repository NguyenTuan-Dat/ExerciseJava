import java.util.Arrays;

public class String13 {
    public boolean check(String a, String b){
        char[] x = a.toCharArray();
        char[] y = b.toCharArray();
        Arrays.sort(x);
        Arrays.sort(y);
        String kt1 = new String(x);
        String kt2 = new String(y);

        return kt1.equals(kt2);
    }
}
