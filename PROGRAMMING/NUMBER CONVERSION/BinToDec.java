//package NUMBER CONVERSION;

public class BinToDec {
public static void main(String[] args){
    int n = 1010;

    System.out.println(bintodec(n));
    
}

private static int bintodec(int dec){

    int p =0, sum =0;

    while(dec>0)
    {
      int rem = dec % 10;
      int pow = (int)Math.pow(2,p);
      sum +=rem * pow;
      dec = dec/10;
      p++;

    }
    return sum;
}
}
