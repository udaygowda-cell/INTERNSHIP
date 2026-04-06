public class ReverseNumber {
    public static void main(String[] args)
    {
        int n = 3526;
        
        System.out.println(revers(n));
    }
    public static int revers(int n){

        int rev = 0;

        while(n>0)
        {
            int lastdigit = n % 10;

            rev = rev * 10 + lastdigit;

            n = n / 10;
        }
        return rev;
    }
}
