
//STATIC ACCESING 

//       CLASSNAME.VARIABLE;

// class demo1{
//     static int x=100;
//     static int y =200;

//    static void test(){
//         System.out.println("hello word");
//     }
// }
// class date_23_02{
//     public static void main(String[] args){
//         System.out.println("main");
//         System.out.println("x "+demo1.x);
//         System.out.println("x "+demo1.y);
//         demo1.test();
//        System.out.println("end");
//     }
// }


//MODIFYING

// class demo1{
//     static int x=100;
//     static int y =200;

//    static void test(){
//         System.out.println("hello word");
//     }
// }
// class date_23_02{
//     public static void main(String[] args){
//         System.out.println("main");
//         System.out.println("x "+demo1.x);
//         System.out.println("x "+demo1.y);
//        // demo1.test();
//        System.out.println("MODIFYING");
//        demo1.x=200;
//        demo1.y=300;
//        System.out.println("x "+demo1.x);
//         System.out.println("x "+demo1.y);
//        System.out.println("end");
//     }
// }

// // // main
// // x 100
// // x 200
// // MODIFYING
// // x 200
// // x 300
// // end






//NON STATIC

//new CLASSNAME().VARIABLE;

// class demo1{
//      int x=100;
//     int y =200;

//     void test(){
//         System.out.println("non static");
//     }
// }
// class date_23_02{
//     public static void main(String[] args){
//         System.out.println("main");
//         System.out.println("x "+new demo1().x);
//         System.out.println("x "+new demo1().y);
//         new demo1().test();
//        System.out.println("end");
//     }
// }



// class demo1{
//      int x=100;
//     int y =200;

//     void test(){
//         System.out.println("non static");
//     }
// }
// class date_23_02{
//     public static void main(String[] args){
//         System.out.println("main");
//         System.out.println("x "+new demo1().x);
//         System.out.println("y "+new demo1().y);
//       //  new demo1().test();
//         System.out.println("MODIFYING");
//       new demo1().x=200;
//       new demo1().y=300;
//       System.out.println("x "+new demo1().x);
//       System.out.println("y "+new demo1().y);
//        System.out.println("end");
//     }
// }


// //out put
// // main
// // x 100
// // y 200
// // MODIFYING
// // x 100
// // y 200
// // end
