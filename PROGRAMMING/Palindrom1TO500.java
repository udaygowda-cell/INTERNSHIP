public class Palindrom1TO500 {

    public static void main(String[] args)
    {
    //int n= 1001;
     for (int i = 1; i<=500;i++ ){
    if(ispallindrom(i)){
        System.out.println(i);}
      }

    }

    public static boolean ispallindrom(int n){
         int rev =0;
        int org = n;
        while(n>0){
         // int lastDigit = n% 10;

          rev = rev * 10 + (n%10);

          n = n/10;
        }
        return org == rev;
    }

    
}