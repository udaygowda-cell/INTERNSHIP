//ne
import java.util.Scanner;

class Ticket_counter{
    int no_Tickets;
    int counterNumber;
    String officerName;
    
 
    Ticket_counter(int no_Tickets, int counterNumber, String officerName){

        this.counterNumber=counterNumber;
        this.no_Tickets=no_Tickets;
        this.officerName=officerName;
       
    } 
  
    void display()
        {
            System.out.println("Counter number : "+counterNumber);
            System.out.println("Officer name: "+officerName); 
        }
 
    void availableTickets()
       {
            System.out.println("Total number of Tickets available: "+no_Tickets);

        }
  
    void Buytickets(int n)
        {
            if(n <no_Tickets){
                System.out.println("Tickets is not available");
            }else{
                no_Tickets  -= n;
                System.out.println("Number of available tickets: "+ no_Tickets);
            }

        } 
 
    void CancelTickets(int c,boolean p){
    if(p==true)
        {
            System.out.println("Cancelling "+c+" Tickets");
            no_Tickets +=c;
            System.out.println("Number of available tickets: "+ no_Tickets);
        }  
        else
        {
            System.out.println("You not Purchased Tickets");
        }
    }
}

public class date_10_03 {
    public static void main(String[] args){
        
        System.out.println("Main class started");
        Scanner sc = new Scanner(System.in);
        
        Ticket_counter t1= new Ticket_counter(70, 5, "raju");
        t1.availableTickets();
        System.out.print("Enter the Number Of Tickets to buy: ");
        int n =sc.nextInt();
        t1.display();
        t1.Buytickets(n);

        System.out.print("Enter the Number Of Tickets to Cancel: ");
        int c =sc.nextInt();
        t1.CancelTickets(c,false);
      
        sc.close();
    }
    
}
//
