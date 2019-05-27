import java.util.HashMap;

public class DichSoLaMaSangHe10 {

    public int dich(String s) {

        int result = 0;
        int a[] = new int[s.length()];
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('M',1000);
        map.put('D',500);
        map.put('C',100);
        map.put('L',50);
        map.put('X',10);
        map.put('V',5);
        map.put('I',1);

        for (int i = 0; i < s.length(); i++) {
            a[i]=map.get(s.charAt(i));
        }

        for (int i = 0; i < s.length(); i++)
            if (i<s.length()-1 && (a[i + 1] == a[i] * 5 || a[i + 1] == a[i] * 10)) {
                result += a[i + 1] - a[i];
                i++;
            } else {
                result += a[i];
            }

        return result;
    }

}
