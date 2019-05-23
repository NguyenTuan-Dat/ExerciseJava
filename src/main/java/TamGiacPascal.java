public class TamGiacPascal {

    public int[] xuongdong(int a[]) {
        int b[] = new int[a.length + 1];
        b[0] = 1;
        b[b.length - 1] = 1;

        for (int i = 1; i < b.length - 1; i++) {
            b[i] = a[i - 1] + a[i];
        }

        return b;
    }

    public String string(int a[]) {
        String s = "";

        for (int i = 0; i < a.length; i++) {
            s += a[i] + " ";
        }

        return s.trim();
    }

    public String tinh(int n) {
        String s = "";
        int a[] = {1};
        int dem = 1;

        while (dem++ < n) {
            a = xuongdong(a);
        }

        return string(a);
    }
}
