
public class Factorial {
static int factno(int a){

    int fact = 1;

    for (int i = 1; i<=a; i++)
        {
            fact *= i;
        }
    return fact;
}

public static void main(String[] args)
{
    int a =4;
    System.out.println(factno(a));
}
    
}
