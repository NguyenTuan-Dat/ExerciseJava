import java.util.ArrayList;
import java.util.List;

public class String2 {

    public boolean isWord(String x){
        for (int j = 0; j < x.length(); j++) {

            char test = x.charAt(j);

            if (!Character.isDigit(test) && !Character.isLetter(test)) {
                return false;
            }
        }

        return true;
    }

    public List<String> tu(String a) {
        String[] b = a.split("\\s");
        List<String> result = new ArrayList<>();

        for (int i = 0; i < b.length; i++) {
            if (isWord(b[i])) result.add(b[i]);
        }

        return result;
    }
}
