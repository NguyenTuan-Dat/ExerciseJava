public class SoNguyenThoaMan {

    int timSoMu(int a) {
        int dem = 1;
        while (a >= 10) {
            dem++;
            a /= 10;
        }

        return dem;
    }

    int tinhKq(int a, int dem) {

        int kq = 0;
        while (a > 0) {
            int x = a % 10;
            a /= 10;
            kq += Math.pow(x, dem);
        }

        return kq;
    }

    public String find() {

        String s = "";

        for (int i = 10; i < 100000; i++) {
            if (tinhKq(i, timSoMu(i)) == i) s += i + " ";

        }

        return s.trim();
    }
}
