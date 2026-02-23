//Scanner

// import java.util.Scanner;
// public class date_23_02 {
//     public static void main(String[] args)
//     {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter the numbers:");
//         int a = sc.nextInt();
//         System.out.println("value is :"+a);
//     }
    
// }


import java.util.Scanner;
public class date_23_02 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the numbers:");
        int a = sc.nextInt();

        if(a%2==0){
            System.out.println(" Even number ");
        }else{
        System.out.println("Odd number");
        }
    }
    
}