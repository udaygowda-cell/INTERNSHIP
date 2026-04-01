import java.util.Scanner;

public class Hr {

    static void displayEmployeeDetails(Employee e){
        if(e!=null){
            System.out.println("EID : "+ e.id);
            System.out.println("CTC : " + e.ctc);
        }
    }
    static Employee createEmployee(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ID : ");
        int id = sc.nextInt();
        System.out.println("Enter the CTC : ");
        double ctc = sc.nextDouble();
        return new Employee(id, ctc);
         
    }
    
}
