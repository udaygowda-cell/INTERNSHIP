public class SpyNumber {
    public static void main (String[] args)
    {
      int n = 2141;
     // boolean res = Spy(n);
     // if (res == true)
      if(Spy(n)){//return boolean
        System.out.println("SPY NUMBERS");
      }
      else 
        System.out.println("NOT SPY");

    }

    public static boolean Spy(int n){

        int sum = 0;
        int prod = 1;

        while(n>0){
            int digit = n%10;

            prod *= digit;

            sum += digit;

            n= n/10;
        }
        // if(sum == prod)
        //     return true;
        // else
        //     return false;
        return sum==prod;//return boolean relational operator
    }
}
