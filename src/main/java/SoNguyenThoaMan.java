public class SoNguyenThoaMan {
    int tinhdem(int a, int dem){
        if (a % Math.pow(10, dem) == 0) dem++;
        return dem;
    }
    public String find() {
        String s = "";
        int dem = 2;
        for (int i = 10; i < 100000; i++) {
            int a = i;
            int kq = 0;
            dem = tinhdem(a,dem);
            while (a > 0) {
                int x = a % 10;
                a/=10;
                kq += Math.pow(x, dem);
            }
            if (kq == i) s += i + " ";
        }
        return s.trim();
    }
}
