public class String15 {
    public int findVerifyNumber(String a) {
        int test = 0;

        while (true) {
            int chan = 0;
            int le = 0;
            for (int i = 0; i < a.length(); i += 2) {
                if (a.charAt(i) == 'x') le += test;
                else le += a.charAt(i) - '0';
            }

            for (int i = 1; i < a.length(); i += 2) {
                if (a.charAt(i) == 'x') chan += test;
                else chan += a.charAt(i) - '0';
            }

            if ((le + 3*chan)%10==0) break;

            test++;
        }

        return test;
    }
}
