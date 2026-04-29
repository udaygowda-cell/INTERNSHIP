//package NUMBER CONVERSION;

public class DecToBinary {
    public static void main(String[] args)
    {
        int n = 14;

        System.out.println(decToBin(n));

    }
    
    public static String decToBin(int dec)
    {
        String bin = "";
        while(dec>0)
        {
            int digit = dec % 2;

            bin = digit + bin;

            dec = dec / 2;
        }
        return bin;
    }
}
