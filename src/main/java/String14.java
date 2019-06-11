public class String14 {
    public boolean isBarcode(String a) {
        int chan = 0;
        int le = 0;

        for (int i = 0; i < a.length(); i += 2) {
            le += a.charAt(i) - '0';
        }
        for (int i = 1; i < a.length(); i += 2) {
            chan += a.charAt(i) - '0';
        }

        return (le + 3 * chan) % 10 == 0;
    }
}
