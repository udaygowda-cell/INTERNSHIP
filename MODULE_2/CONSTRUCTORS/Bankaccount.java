import java.util.Scanner;
class Bank
{
            double deposit;
            double withdraw;
            double accountBalance;

    public Bank(double deposit, double withdraw, double accountBalance) 
        {
            this.deposit = deposit;
            this.withdraw = withdraw;
            this.accountBalance = accountBalance;
        }
mk
    void accountDetails()
        {
            String name = "Uday kumar K J";
            String DOB = "16-april-2026";
            System.out.println("------Account Details-----");
            System.out.println("Name :"+name);
            System.out.println("DOB :"+DOB);
            System.out.println("Account balance :"+accountBalance);

        }

    void Deposit(double deposit)
    {
            System.out.println("Amount is "+deposit+" deposited");
            accountBalance+=deposit;
            System.out.println("Account Balance : "+ accountBalance);
    }

    void Withdraw(double withdraw)
    {
      if(withdraw>accountBalance)
       {
            System.out.println("Insufficent Balance");
       }
      else
        {
            System.out.println("Amount is "+withdraw+" credited");
            accountBalance -=withdraw;
            System.out.println("Account Balance : "+ accountBalance);
        }
    }
     
}

public class Bankaccount 
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Bank b1= new Bank(200.00, 8000,2200);
        System.out.println("1. Account Details");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("Enter the choice :");
        int n = sc.nextInt();
        int choice = n;
        switch(choice)
        {
            case 1:
                b1.accountDetails();
                break;
            
            case 2:
                System.out.print("Enter deposit amount: ");
                double deposit = sc.nextDouble();
                b1.Deposit(deposit);
                break;
            
            case 3:
                System.out.print("Enter withdraw amount: ");
                double withdraw = sc.nextDouble();
                b1.Withdraw(withdraw);
                break;
            
            default:
                System.out.println("welcome to bank");

        }  
    sc.close();
    }
}
