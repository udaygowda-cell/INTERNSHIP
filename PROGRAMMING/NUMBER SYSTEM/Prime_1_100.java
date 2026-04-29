public class Prime_1_100 {

    public static void main (String[] args){

    for (int i = 0; i<100; i++)
        {
          if(Isprime(i)){
            System.out.println(i);
          }
        }
       
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

