public class String11 {

    public int[] tachSo(String a) {
        String[] x = a.split("[\\+\\-\\*\\/\\^\\<\\>]");
        if (x.length > 2) {
            if (x[1].equals("")) x[1] = x[2];
        }

        int result[] = new int[x.length];

        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length(); j++) {
                if (x[i].charAt(j) != '<' && x[i].charAt(j) != '>')
                    result[i] = result[i] * 10 + x[i].charAt(j) - '0';
            }
        }

        return result;
    }

    public int tinh(String a) {
        int so[] = tachSo(a);
        a += " ";
        int vitridau = String.valueOf(so[0]).length();
        char dau = a.charAt(vitridau);

        if (dau == '+') return so[0] + so[1];
        if (dau == '-') return so[0] - so[1];
        if (dau == '*') return so[0] * so[1];
        if (dau == '/') return so[0] / so[1];
        if (dau == '^') return (int) Math.pow(so[0], so[1]);
        if (dau == '>') return so[0] >> so[1];
        if (dau == '<') return so[0] << so[1];

        return -1;
    }
}
