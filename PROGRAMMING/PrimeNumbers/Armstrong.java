package PrimeNumbers;
public class Armstrong {

public static void main(String[] args)
{
    int n = 153;

    if(isAmstrong(n))
    {
        System.out.println("IS Armstrong");
    }
    else
        System.out.println("IS not");
}

public static boolean isAmstrong(int n)

{
    int count = iscount(n);
    int org = n;
    int sum = 0;

    while(n>0)
    {
        int lastDigit =n%10;

        int fact = isFact(lastDigit, count);

        sum += fact;

        n = n/10;
    }
 return org == sum ;
}

public static int iscount(int n)
{
    int count = 0;

    while(n>0){
        count ++;
        n = n/10;
    }
    return count;
}

public static  int isFact(int n, int p)
{
    int pow = 1;

    for(int i = 1; i<=p; i++)
    {
        pow *= n;
    }
    return pow;
}
}
