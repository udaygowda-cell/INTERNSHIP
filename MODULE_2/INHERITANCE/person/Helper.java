//package MODULE_2.INHERITANCE.person;
//bank
import java.util.Scanner;
public class Helper {
     static void displayPersonDetails(Person p){
        if(p != null){
            System.out.println("age : " + p.age);
            System.out.println("Height : " + p.height);
            System.out.println("Weigth : " + p.weight);
        }
     }
     
     static Person createPerson(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the age :");
        int age = sc.nextInt();
        System.out.println("Enter the height :");
        double height = sc.nextDouble();
        System.out.println("Enetr the weight :");
        double weight = sc.nextDouble();

        return new Person(age, height, weight);
     }
    
}
