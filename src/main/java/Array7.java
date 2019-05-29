import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array7 {

    public int[] findArray(int a[]) {

        int b[] = new int[a.length];
        b[b.length-1] = 1;

        for (int i = b.length-2; i >=0 ; i--) {
            if (a[i+1] >= a[i]) b[i] = b[i+1] + 1;
            else b[i] = 1;
        }

        int max=0, local=0;
        for (int i = 0; i < b.length; i++) {
            if(b[i]>max)
            {
                max=b[i];
                local=i;
            }
        }

        return Arrays.copyOfRange(a,local, local+max);
    }
}
