public class Sum {
    public long SUM(long a)
    {
        int x=0;
        while(a>0)
        {
            x+=a%10;
            a/=10;
        }
        return x;
    }
}
