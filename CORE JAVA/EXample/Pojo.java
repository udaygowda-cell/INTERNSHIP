    import java.util.Scanner;

    public class Pojo {

    public static void main(String[] args) 
    {
   
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter no of Employees");
      int n = scan.nextInt();
      scan.nextLine();
      Employee[] e = new Employee[n];
    for(int i=0; i<n; i++) {

      System.out.println("Enter the details of "+(i+1)+" employee:");
      String details = scan.nextLine();

      String[] a =details.split(",");

      e[i] = new Employee();
      e[i].setEmpId(Integer.parseInt(a[0]));
      e[i].setName(a[1]);
      e[i].setSalary(Integer.parseInt(a[2]));
    }
    for(int i=0; i<n; i++) {
     . System.out.println(e[i].getEmpId()+" "+e[i].getName()+""+e[i].getSalary());
    }
    }
    }