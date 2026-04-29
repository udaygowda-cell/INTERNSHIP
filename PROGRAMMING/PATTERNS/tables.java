public class tables {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            tac t = new tac();
            t.tab(i);
            System.out.println();
        }
    }
}
class tac{
    public  void tab(int n) {
        for (int i = 1; i <= 10; i++) {
            int sum = n * i;
            System.out.println(n + " x " + i + " = " + sum);
        }
    }
}