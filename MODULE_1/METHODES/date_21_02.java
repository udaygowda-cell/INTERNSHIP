

//verify
// public class date_21_02 {
//     static boolean verify(int a){
//         if (a%2==0){
//             return true;
//         }
//         else{
//             return false;
//         }
//     }
// public static void main(String[] args){
//     System.out.println("status "+ verify(10));
//     System.out.println("status "+ verify(15));
// }
    
// }


// public class date_21_02 {

// static double addition(double a, double b){
//     double sum = a+b;
//     return sum;
// }
// public static void main(String[] args){
//     System.out.println(addition(10, 20));
//     System.out.println(addition(10.5, 2.5));
//     System.out.println(addition(1.0, 20));
//     System.out.println(addition(10, 22.30));
// }
// }

// // output: 30.0
// // 13.0
// // 21.0
// // 32.3l

// public class date_21_02 {

// static int square(int n){
//     int sq = n*n;
//     return sq;
// }
// public static void main(String[] args){

//     for(int i=1;i<=5;i++){
//         System.out.println(i+" square is "+square(i));
//     }
// }
// }



// public class date_21_02 {

// static int factorial(int n){
//     int fact =1;
//     while(n>=1){
//     fact=fact*n;
//     n--;
//          System.out.print(fact+"*"+n+" ");
//     }
//     return fact;
// }
// public static void main(String[] args){
//     for(int i=1;i<=5;i++){
   
//         System.out.println(i+" factorial is :"+factorial(i));
//     }
// }
// }

// public class date_21_02{

// static boolean prime(int num){
//     int count = 0;
//     int a=1;
//     while(a<=num/2){
//         if (num%a==0){
//             count++;
//         }
//         a++;
//     }

//     if(count==1){
//         return true;
//     }
//     else{
//         return false;
//     }
// }

// public static void main(String[] args){

// for (int i =0;i<=100;i++){
//     boolean primes=prime(i);
//     if(primes==true){
//         System.out.println(i);
//     }
// }
// }
// }

import java.util.Scanner;
public class date_21_02{

static boolean prime(int num){
    int count = 0;
    int a=1;
    while(a<=num/2){
        if (num%a==0){
            count++;
        }
        a++;
    }

    if(count==1){
        return true;
    }
    else{
        return false;
    }
}

public static void main(String[] args){
Scanner sc =new Scanner(System.in);
System.out.print("enter the prime:");
int a= sc.nextInt();
System.out.println(prime(a));

}
}