
public class String17 {
    public String tinhHieu(String a, String b) {
        StringBuilder c = new StringBuilder("");

        if (a.length() < b.length() || (a.length() == b.length() && a.compareTo(b) < 0)) return "-" + tinhHieu(b, a);

        if (a.compareTo(b) > 0) {
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
        }

        return c.reverse().toString();
    }
}
