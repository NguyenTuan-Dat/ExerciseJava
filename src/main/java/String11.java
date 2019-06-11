public class String11 {

    public int[] tachSo(String a) {
        String[] x = a.split("[\\+\\-\\*\\/\\^\\<\\>]");

        int result[] = new int[2];
        int dem=0;

        for (int i = 0; i < x.length; i++) {
            if(x[i].equals("")) continue;
            for (int j = 0; j < x[i].length(); j++) {
                    result[dem] = result[dem] * 10 + x[i].charAt(j) - '0';
            }
            dem++;
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
