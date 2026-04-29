public class Sumof {

    static int sumOf(int a){
        int sum =0;

        while(a>0)
        {
          int digit= a%10;

          sum += digit;

          a=a/10;
        }
        return sum;
    }

    public static void main(String[] args){
        int n = 234;
        System.out.println(sumOf(n));
    }
    
}
