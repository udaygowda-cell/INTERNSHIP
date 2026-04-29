public class Productof {
    
    static int product(int a)
    {
      int sum = 1;
      while(a>0){
        int digit = a%10;
        sum*=digit;
        a = a/10;
      }
      return sum;

    }
    public static void main(String[] args){
        int a = 1234;
        System.out.println(product(a));
    }
    }

