public class String3 {

    public boolean isChuoiDoiXung(String a) {
        return new StringBuffer(a).reverse().toString().equals(a);
    }
}
