public class PTBac2 {
    public String giaiphuongtrinh(double a, double b, double c){
        String s="";
        double delta = b*b -4*a*c;

        if (delta < 0){
            s="Phương trình vô nghiệm";
        }
        else{
            s="x1= " + ((-1*b+Math.sqrt(delta))/2/a) + ", x2= " + ((-1*b-Math.sqrt(delta))/2/a);
        }

        return s;
    }
}
