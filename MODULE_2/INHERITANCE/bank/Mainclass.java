//package bank;

public class Mainclass {
    public static void main(String[] args){

        Account a1 = Bank.createAccount();
        Bank.bankAccountInfo(a1);
        Account a2 = Bank.createAccount();
        Bank.bankAccountInfo(a2);
        
    }
}
