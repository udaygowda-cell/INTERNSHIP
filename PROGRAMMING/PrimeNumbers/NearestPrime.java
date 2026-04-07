public class NearestPrime {

    public static void main(String[] args)
    {
        int n =24; 
        int prev = n - 1;
        int next = n + 1;

        while(true)
        {
         if(isprime(prev))
         {
            System.out.println(prev);
            break;
         }
         else if(isprime(next))
         {
            System.out.println(next);
            break;
         }
        }
        prev--;next++;
    }
 public static boolean isprime(int n)
    {
        if(n<=1)
            return false;

        for(int i = 2; i<=n/2;i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
}
