public class Array23 {

    public int tongDaySoTuNhien(int a[]) {

        int b[] = new int[a.length];
        if (b[0] > 0) b[0] = a[0];
        else b[0] = 0;

        for (int i = 1; i < b.length; i++) {
            if (a[i] >= 0) {
                b[i] = b[i - 1] + a[i];
            } else b[i] = 0;
        }

        int max = 0;
        for (int i = 0; i < b.length; i++) {
            if (b[i] > max) max = b[i];
        }

        return max;
    }
}
