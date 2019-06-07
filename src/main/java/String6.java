public class String6 {
    public String xuLyChuoi(String a) {
        String c = "";
        for (int i = 0; i < a.length(); i++) {
            if (Character.isUpperCase(a.charAt(i))) {
                c += Character.toLowerCase(a.charAt(i));
            } else {
                if (Character.isLowerCase(a.charAt(i))) {
                    c += Character.toUpperCase(a.charAt(i));
                }
                else{
                    c+= a.charAt(i);
                }
            }
        }
        return c;
    }
}
