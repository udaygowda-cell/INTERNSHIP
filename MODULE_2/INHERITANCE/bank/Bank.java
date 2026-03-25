//package bank;

import java.util.Scanner;
public class Bank {

    static void bankAccountInfo(Account a)
    {
    if(a != null)
    {
      System.out.println("Account number : "+ a.accountNumber);
      System.out.println("Account balance : " + a.accountBalance);
    }
    
}  
static Account createAccount()
{
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the bank account number :");
       long accountNumber = sc.nextLong();
       System.out.print("Enter the bank balance :");
       double accountBalance = sc.nextDouble();
       return new Account(accountNumber, accountBalance);
} 
}
