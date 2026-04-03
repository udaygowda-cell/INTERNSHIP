public class StrongNumber {
    public static void main(String[] args){

        int n = 40585;
        int res = (strong(n));
        

        if(res == n){
            System.out.println("IS A STRONG NUMBER");
        }
        else{
            System.out.println("IS NOT A STRONG");
        }

    }

    public static int strong(int n)
    {
        int sum = 0;
        int fact = 1;

        while(n>0)
        {
            int digit = n % 10;

            for(int i = 1; i<=digit;i++)
            {
                fact *= i;
            }
            sum += fact;
            fact = 1;
            n=n/10;
            System.out.println(sum);
        }
        return sum;
        
    }
}
