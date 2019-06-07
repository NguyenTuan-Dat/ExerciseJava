public class String8 {
    public String chuanHoa(String a) {
        a = a.trim();
        char b[] = a.toCharArray();
        String result = "";
        result += Character.toUpperCase(b[0]);
        result += Character.toLowerCase(b[1]);

        for (int i = 2; i < b.length; i++) {
            char last = result.charAt(result.length() - 1);
            if (last == ' ' && b[i] == ' ') {
                continue;
            }
            if (last == '.' || last == '?' || last == '!') {
                result += ' ';
                i--;
            } else {
                char l = result.charAt(result.length() - 2);
                if (l == '.' || l == '?' || l == '!') {
                    result += Character.toUpperCase(b[i]);
                } else
                    result += Character.toLowerCase(b[i]);
            }
        }

        return result.trim();
    }
}
