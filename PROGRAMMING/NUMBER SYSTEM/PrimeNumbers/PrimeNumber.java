package PrimeNumbers;
//package java.PROGRAMMING;

public class PrimeNumber {

    public static void main (String[] args){
        int n =11;
    
        if( Isprime(n))
            System.out.println("IS PRIME");
        else 
            System.out.println("NOT PRIME");
      
    }

    static boolean Isprime(int n ){

        if(n<=1)
            {
            return false;
            }
        for(int i = 2; i <= n/2; i++ )
            {
            if(n%i==0)
            return false;
            }
        return true;
    }  
}



