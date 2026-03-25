public class MainClass {
    public static void main(String[] args){
       DebitCard d1 = Visa.issueDebitCard();
       Visa.displayCardInfo(d1);
       DebitCard d2 = Visa.issueDebitCard();
       Visa.displayCardInfo(d2);
    }
    
}
