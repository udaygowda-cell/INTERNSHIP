public class Powerof {

    public static void main(String[] args){
        int n = 2, p = 3;

        System.out.println(powerOf(n, p));

    }
    static int powerOf(int n, int p){
        int sum = 1;
        for(int i=1;i<=p;i++){
             sum *= n;
        }
        return sum;
    }
}
