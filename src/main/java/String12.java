public class String12 {
    public String xoaKyTu(String a) {
        a += " ";
        StringBuilder b = new StringBuilder("");

        for (int i = 0; i < a.length()-1; i++) {
            if(a.charAt(i)!=a.charAt(i+1)) b.append(a.charAt(i));
        }

        return b.toString();
    }
}
