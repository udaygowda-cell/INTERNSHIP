//package java.PROGRAMMING;

public class PrimeNumber {

    public static void main (String[] args){
        int n =1;
        boolean s = Isprime(n);

        if(s==true)
            System.out.println("IS PRIME");
        else 
            System.out.println("NOT PRIME");
      
    }

    static boolean Isprime(int n ){

        // if(n<=1)
        //     {
        //     return false;
        //     }
        for(int i = 2; i <= n/2; i++ ){
            return false;
        }
        return true;
    }
    
}



