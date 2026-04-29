public class NeonNumber {
    public static void main(String[] args)
    {
        int n = 9;
        if(neonNumber(n))
        {
            System.out.println( "IS NEON NUMBER");
        }
        else{
            System.out.println("IS NOT NEON NUMBER");
        }

    }

    public static boolean neonNumber(int n)
    {
      int sq = n*n;
     
      int sum = 0;

      while(sq>0)
      {
        int digit = sq % 10;
        sum += digit;
        sq=sq/10;
      }
      return n==sum;
    }
}
