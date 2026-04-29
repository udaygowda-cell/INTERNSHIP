public class CountNumber {

    static int sumOf(int n){
        int  count=0;

        while(n>0)
        { 
         int digit=n%10;
         count ++;
         n = n/10;
         System.out.println(n);
        }
        return count;
    }

    public static void main(String[] args){
        int n = 12345 ;
        System.out.println(sumOf(n));
    }
    
}

    

