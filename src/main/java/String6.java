public class String6 {
    public String xuLyChuoi(String a) {
        StringBuilder c = new StringBuilder("");

        for (int i = 0; i < a.length(); i++) {

            if (Character.isUpperCase(a.charAt(i))) {
                c.append(Character.toLowerCase(a.charAt(i)));
            } else {
                c.append(Character.toUpperCase(a.charAt(i)));
            }
        }

        return c.toString();
    }
}