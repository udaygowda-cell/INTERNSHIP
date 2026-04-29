

public class triangular {
    public static void main(String[] args)
    {
  int n = 5;
    for(int i = 1; i<=n; i++)
    {
        for(int j=1 ; j<=n-i; j++)
        {
            System.out.print(" ");

        }

        for(int k = 1; k <= i*2-1 ; k++ ){
            System.out.print("* ");
            
        }
        System.out.println();
    }
}
}
