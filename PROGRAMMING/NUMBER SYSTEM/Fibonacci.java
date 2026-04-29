public class Fibonacci {

    public static void main(String[] args)
    {
        int first =0, sec = 1, next =0;
        int n = 10;
        System.out.print(first+" "+sec+" ");

        for( int i = 2; i<=n-2; i++)
        {
        next = first + sec;
        System.out.print(next + " ");
        first = sec;
        sec = next;
        }
    }
    
}
