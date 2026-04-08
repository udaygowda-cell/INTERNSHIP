public class GCD {

    public static void main(String[] args)
    {
        int n = 10, m = 100, gcd = 0;

        for( int i = 1; i<=n&&i<=m; i++)
        {
            if(n%i==0 && m%i==0){
                gcd = i;
                //System.out.println(i);
            }
        }
        System.out.println(gcd);
    }
    
}
