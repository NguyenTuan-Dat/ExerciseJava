public class DichHe10SangSoLaMa {

    public String dich(int a) {

        String s = "";
        int i = 0;
        int x[] = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String y[] = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        while (a > 0) {

            while (a >= x[i]) {
                    s += y[i];
                    a -= x[i];
                }

            i++;
        }
        return s;
    }

}
