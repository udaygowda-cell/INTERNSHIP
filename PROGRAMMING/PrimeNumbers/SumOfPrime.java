package PrimeNumbers;
public class SumOfPrime {

    public static void main(String[] args)
    {
        int sum = 0;
        for(int i = 1; i <= 500; i++)
        {
            if(Sumof(i)){
                sum+=i;
                
            }    
        }
        System.out.println(sum);
    }

    public static boolean Sumof(int n)
    {
       
        if(n<=1)
        {
            return false;
        }
        for(int i =2; i<=n/2; i++)
        {
        if(n%i==0)
        {
            return false;
        }
        }
        return true;


    }
    
    
}
