//package METHODES;
//package MODULE_1;
//PASSING VALUES
/* 
public class date_20_02 {
    

    //                FORMAL ARGUMENTS
   //                   ^
 //                     |
    static void test(int a){
        System.out.println("values : "+a);
    }
    public static void main(String[] args){
        test(25);
//             |
//             ^
//         ACTUAL ARGUMENTS
    }
}
    */



// public class date_20_02 {
               
//     static void test(double a){
//         System.out.println("values : "+a);
//     }
//     public static void main(String[] args){
//         test(25.5);
//         test(32.53);
//         test(44.55);
//     }
// }


// public class date_20_02 {
//     static void run(boolean bool){
//         System.out.println("boolean value : " + bool);
//     }
               
//     static void test(char ch){
//         System.out.println("charector : "+ch);
//         run(true);
//     }
//     public static void main(String[] args){
//      test('u');
//     }
// }

// charector : u
// boolean value : true


// public class date_20_02 {
            
//     static void addition(int a, int b){
//         int sum = a+b;
//         System.out.println(a+" + "+b+" = "+sum);
//     }
//     public static void main(String[] args){
//      addition(12, 20);
//      addition(14, 80);
//      addition(16, 90);
//     }
// }

// 12 + 20 = 32
// 14 + 80 = 94
// 16 + 90 = 106


// public class date_20_02 {
            
//     static void test(int a, char c, boolean b){

//         System.out.println("int "+a+" char "+c+" boolean "+b);
//     }
//     public static void main(String[] args){

//      test(12, 'a',true);
    
//     }
// }

// int 12 char a boolean true






// RETURNING value

// public class date_20_02 {
//     static int test()
//     {
//         return 10;
//     }
// public static void main(String[] args){


//     System.out.println(test());
// }
// }

import java.util.Scanner;
class date_20_02{
public static void main(String[] args){
// Your code here
Scanner sc = new Scanner(System.in);
double a=sc.nextDouble();
double b= sc.nextDouble();
 
System.out.println(sumof(a,b));
}
static double sumof(double a, double b) {
double sum=a%b;
return sum;

}

}