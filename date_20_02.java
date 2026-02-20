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


public class date_20_02 {
    static void run(boolean bool){
        System.out.println("boolean value : " + bool);
    }
               
    static void test(char ch){
        System.out.println("charector : "+ch);
        run(true);
    }
    public static void main(String[] args){
     test('u');
    }
}

