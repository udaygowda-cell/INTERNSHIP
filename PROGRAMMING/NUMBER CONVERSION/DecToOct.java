//package NUMBER CONVERSION;

public class DecToOct {
    public static void main(String[] args)
    {
        int n =75;

        System.out.println(decToOct(n));
    }
    
    public static  String decToOct(int dec)
    {
        String oct = "";

        while(dec>0)
        {
            int digit = dec % 8;

            oct = digit + oct;

            dec = dec / 8;
        }

        return oct;
    }
}
