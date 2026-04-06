public class Pallindrome {

    public static void main(String[] args)
    {
        int n = 1002;

        if(checkPallindrom(n))
        {
            System.out.println("IS PALLINDROME.");
        }
        else
        {
            System.out.println("IS NOT PALLINDROME");
        }
    }

    public static boolean checkPallindrom(int n){
        int org =n;
        int rev = 0;

        while(n>0)
        {
            int lastDigit = n % 10;

            rev = rev * 10 + lastDigit;

            n = n / 10;
        }
        return rev == org;
    }
}
