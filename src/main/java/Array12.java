public class Array12 {

    public static int[] chenMang(int a[],int x) {

        int b[] = new int[a.length + 1];
        int j = 0;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] < x && a[i + 1] >= x) {
                b[i] = a[i];
                i++;
                b[i] = x;
                j = 1;
            } else {
                b[i] = a[i - j];
            }
        }
        b[b.length - 1] = a[a.length - 1];

        return b;
    }
}