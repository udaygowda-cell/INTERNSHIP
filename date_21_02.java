
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

public class date_21_02 {

static int square(int n){
    int sq = n*n;
    return sq;
}
public static void main(String[] args){

    for(int i=1;i<=5;i++){
        System.out.println(i+" square is "+square(i));
    }
}
}