import java.util.ArrayList;
import java.util.List;

public class String2 {

    public List<String> tu(String a) {
        String[] b = a.split("\\s");
        List<String> result = new ArrayList<>();

        for (int i = 0; i < b.length; i++) {
            boolean kt = true;

            for (int j = 0; j < b[i].length(); j++) {

                char test = b[i].charAt(j);

                if (Character.isDigit(test) || Character.isLetter(test)) {
                } else {
                    kt = false;
                    break;
                }
            }

            if (kt) result.add(b[i]);
        }

        return result;
    }
}
