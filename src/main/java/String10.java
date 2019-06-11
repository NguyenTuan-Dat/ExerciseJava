public class String10 {
    public String khaiTrien(String a) {
        a += " ";
        StringBuilder c = new StringBuilder("");

        for (int i = 0; i < a.length(); i++) {
            if (Character.isLetter(a.charAt(i))) {
                c.append(a.charAt(i));
                int dem = 1;
                int so = 0;

                while (Character.isDigit(a.charAt(i + dem))) {
                    so = so * 10 + (int) (a.charAt(i + dem) - '0');
                    dem++;
                    if(i + dem == a.length()-1) break;
                }

                for (int k = 0; k < so - 1; k++) {
                    c.append(a.charAt(i));
                }
                i += dem - 1;
            }
        }

        return c.toString();
    }
}
