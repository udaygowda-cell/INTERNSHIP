public class SumofEven {

    public static void main(String[] args ){

        int n = 12345678;

        System.out.println(sumOfEve(n));
    }

    public static int sumOfEve(int n){

        int sum = 0;

        while(n>0){
            int digit = n %10;

            if (digit % 2 == 0)
            {
                sum += digit;
            }
            n = n/10;
        }
        return sum;

    }
    
}
