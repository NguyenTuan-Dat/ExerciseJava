public class SoNguyenThoaMan {

    int timSoMu(int a) {
        int dem = 1;
        while (a >= 10) {
            dem++;
            a /= 10;
        }

        return dem;
    }

    boolean isPerfectNumber(int a) {

        int mu = timSoMu(a);
        int n = a;
        int kq = 0;
        while (n > 0) {
            int x = n % 10;
            n /= 10;
            kq += Math.pow(x, mu);
        }
        if (a == kq) return true;
        else return false;
    }

    public String find() {

        String s = "";

        for (int i = 10; i < 100000; i++) {
            if (isPerfectNumber(i)) s += i + " ";

        }

        return s.trim();
    }
}
