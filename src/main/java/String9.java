public class String9 {
    public String rutGon(String a) {
        String b = "";
        int dem = 1;
        for (int i = 0; i < a.length() - 1; i++) {
            if (a.charAt(i) == a.charAt(i + 1)) {
                dem++;
            }
            if (a.charAt(i) != a.charAt(i + 1)) {
                if(dem != 1){
                    b += a.charAt(i) + String.valueOf(dem);
                    dem = 1;
                }
                else b += a.charAt(i);
            }
        }

        if (a.charAt(a.length() - 1) != a.charAt(a.length() - 2)) {
            b += a.charAt(a.length() - 1);
        }

        return b;
    }
}
