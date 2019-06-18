public class Array12 {

    public static int[] chenMang(int a[], int x) {

        int b[] = new int[a.length + 1];
        int j = 0;

        for (int i = 0; i < a.length; i++) {
            int soLon = i < a.length - 1 ? a[i + 1] : a[i];
            if (a[i] <= x && x <= soLon && j == 0) {
                b[i] = a[i];
                b[i + 1] = x;
                j = 1;
            } else {
                b[i + j] = a[i];
            }
        }

        return b;
    }
}