public class Array26 {
    public int daoSo(int a) {
        int b = 0;

        while (a > 0) {
            b = b * 10 + a % 10;
            a /= 10;
        }

        return b;
    }

    public int sum(int a[]) {
        int result = 0;

        for (int i = 0; i < a.length; i++) {
            result += daoSo(a[i]);
        }

        return result;
    }
}
