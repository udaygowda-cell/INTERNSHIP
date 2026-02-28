//package MODULE_1;
public class pro5 {
    public static void main(String[] args) {
         double price = 100000.00;
         int time = 2;
        double rate = 11.5;
        double simpleInterest = (price * time * rate) / 100;
        System.out.println("Simple Interest: " + simpleInterest);

        double totalAmount = price + simpleInterest;
        System.out.println("Total Amount: " + totalAmount);

        double emi = totalAmount / (time * 12);
        System.out.println("EMI: " + emi);
    }
    
}
