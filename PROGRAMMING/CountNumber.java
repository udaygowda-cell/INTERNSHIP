public class CountNumber {

    static int sumOf(int a){
        int sum =0;

        while(a>0)
        { 
         a=a/10;
         sum ++;
         System.out.println(a);
        }
        return sum;
    }

    public static void main(String[] args){
        int n = 12345 ;
        System.out.println(sumOf(n));
    }
    
}

    

