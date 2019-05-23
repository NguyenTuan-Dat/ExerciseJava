public class TinhGiaiThua {

    public int tinhGiaiThua(int n) {

        int kq = 0;

        while (n >= 5) {
            kq += n / 5;
            n /= 5;
        }

        return kq;
    }

}
