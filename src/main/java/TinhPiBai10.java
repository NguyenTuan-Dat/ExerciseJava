public class TinhPiBai10 {
    
    public double pi(){
        
        double pi= 3 , p;
        long i = 2 , a = 1;

        do {
            long mau = i * ( i + 1 ) * ( i + 2 );
            p=pi;
            pi+=(double) a * 4 / mau;
            a *= -1;
            i += 2;
        } while(Math.abs( pi - p ) > 0.000001);

        return pi;
    }
}
