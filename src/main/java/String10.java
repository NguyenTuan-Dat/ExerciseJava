public class String10 {
    public String khaiTrien(String a) {
        a += " ";
        String c = "";

        for (int i = 0; i < a.length(); i++) {
            if (Character.isLetter(a.charAt(i))) {
                c += a.charAt(i);
                int dem = 1;
                int so = 0;

                while (Character.isDigit(a.charAt(i + dem)) && i + dem < a.length()) {
                    so = so * 10 + (int) (a.charAt(i + dem) - '0');
                    dem++;
                }

                for (int k = 0; k < so - 1; k++) {
                    c += a.charAt(i);
                }
                i += dem - 1;
            }
        }

        return c;
    }
}
