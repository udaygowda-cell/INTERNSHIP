//package PrimeNumbers;

public class NthPrime {

    public static void main(String[] args)
    {
        int n= 4, i= 2, count = 0;

        while(n>0)
        {
            if(isPrime(i))
            {
                count ++;

                if(n==count){
                    System.out.println(i);
                    break;
                }
            }
            i++;
        }
    }

    public static boolean isPrime(int n)
    {
        if(n<=1)
            return false;

        for (int i = 2; i<=n/2; i++)
            {
                if(n%i == 0)
                return false;
            }  
        return true;
    }
    
}
