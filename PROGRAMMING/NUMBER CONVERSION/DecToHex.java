//package NUMBER CONVERSION;
public class DecToHex {
    public static void main (String[] args)
    {
        int n = 75;
        System.out.println(decToHex(n));
    }
    
    public static String decToHex(int dec)
    {
        String hex = "";
        while(dec >0)
        {
            int digit = dec % 16;

            if(digit>9)
            {
                hex = (char)(digit + 55) + hex ;
            }
            else
            {
                hex = digit + hex;
            }
            dec = dec / 16;
        }
        return hex;
    }
}
