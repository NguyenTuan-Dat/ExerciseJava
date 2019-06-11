public class String11 {

    public int[] tachSo(String a) {
       return Arrays.stream(a.split("[\\+\\-\\*\\/\\^\\<\\>]"))
                .filter(t -> !t.equals(""))
                .mapToInt(Integer::valueOf)
                .toArray();
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
