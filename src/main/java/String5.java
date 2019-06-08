import java.util.*;

public class String5 {
    public List<String> findWords(String a) {
        Map<String, Integer> m = new HashMap<>();
        String[] x = a.split("\\s");

        for (int i = 0; i < x.length; i++) {
            if (!m.containsKey(x[i])) m.put(x[i], 1);
            else {
                m.replace(x[i], m.get(x[i]) + 1);
            }
        }

        Set<String> set = m.keySet();
        List<String> s = new ArrayList<>(set);

        for (String key : s) {
            if (m.get(key) == 1) {
                m.remove(key);
            }
        }

        set = m.keySet();
        s = new ArrayList<>(set);

        return s;
    }
}
