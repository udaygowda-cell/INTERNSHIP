public class NthPrime {
    //package java.PROGRAMMING;

    public static void main (String[] args){
        int n =3; int i = 2;
        int count = 0;
   while(n>0){
        if( Isprime(i)){
            count ++;
            System.out.println(i);
        
         if (n==count)
            break;
        }
        i++;
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




    

