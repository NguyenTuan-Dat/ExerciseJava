import java.util.Arrays;

public class TimSoXuatHienTren2Lan {

    public int[] find(int a[]) {
        int b[] = new int[a.length/3];
        int dem = 0;
        Arrays.sort(a);
        for (int i = 0; i < a.length - 2; i++) {
            if (a[i] == a[i + 1] && a[i] == a[i + 2]) {
                b[dem++] = a[i];
                i += 2;
            }
        }
        return b;
    }

}
