public class TamGiacPascal {
    public String tinh(int n) {
        String s = "";
        int A[] = {1};
        int dem = 1;
        while (dem++ < n) {
            int B[] = new int[A.length + 1];
            B[0] = 1;
            B[B.length-1] = 1;
            for (int i = 1; i < B.length - 1; i++) {
                B[i] = A[i-1] + A[i];
            }
            A = B;
        }
        for (int i = 0; i < A.length; i++) {
            s += A[i] + " ";
        }
        return s.trim();
    }
}
