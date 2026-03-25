
import java.util.Scanner;
public class Visa {
    
    static void displayCardInfo(DebitCard dc){
        System.out.println("DebitCard number is : " + dc.cardNumber);
        System.out.println("PinNumber is : " + dc.pinNumber);
    }

    static DebitCard issueDebitCard(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the debitcard number:");
        long cardNumber = sc.nextLong();
        System.out.println("Enter the PIN number :");
        int pinNumber = sc.nextInt();

        return new DebitCard(cardNumber, pinNumber);
        
    }
}
