public class String18 {
    public String tinhTong(String a, String b) {
        String kq = "";
        if (b.length() > a.length()) {
            return tinhTong(b, a);
        }
        while (a.length() > b.length()) b = '0' + b;

        int nho = 0;

        for (int i = a.length() - 1; i >= 0; i--) {
            int themso = nho + a.charAt(i) + b.charAt(i) - 2 * '0';

            if (themso / 10 > 0) {
                nho = themso / 10;
                themso %= 10;
            } else nho = 0;

            kq = themso + kq;
        }

        if (nho > 0) kq = nho + kq;

        return kq;
    }

    public String tinhHieu(String a, String b) {
        StringBuilder c = new StringBuilder("");

        if (a.length() < b.length() || (a.length() == b.length() && a.compareTo(b) < 0)) {
            return "-" + tinhHieu(b, a);
        }

        a = new StringBuffer(a).reverse().toString();
        b = new StringBuffer(b).reverse().toString();
        while (b.length() < a.length()) b += "0";
        int nho = 0;

        for (int i = 0; i < b.length(); i++) {
            int ia = a.charAt(i) - '0';
            int ib = b.charAt(i) - '0' + nho;
            int kq = ia - ib;

            if (kq < 0) {
                kq += 10;
                nho = 1;
            } else {
                nho = 0;
            }

            c.append(kq);
        }

        for (int i = c.length() - 1; i > 0; i--) {
            if (c.charAt(i) == '0') c.deleteCharAt(i);
        }

        return c.reverse().toString();
    }

    public String tinhTich(String a, String b){
        if (a.length()<b.length()) return tinhTich(b,a);
        String c = "0";
        do {
            c = tinhTong(c,a);
        }while(!(b=tinhHieu(b,"1")).equals("0"));

        return c;
    }
}
