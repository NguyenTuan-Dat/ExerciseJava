public class DichSoLaMaSangHe10 {

    public int dich(String s) {

        int result = 0;
        int a[] = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == 'M') a[i] = 1000;
            if (s.charAt(i) == 'D') a[i] = 500;
            if (s.charAt(i) == 'C') a[i] = 100;
            if (s.charAt(i) == 'L') a[i] = 50;
            if (s.charAt(i) == 'X') a[i] = 10;
            if (s.charAt(i) == 'V') a[i] = 5;
            if (s.charAt(i) == 'I') a[i] = 1;

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