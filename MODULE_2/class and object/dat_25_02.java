// class demo5 {
//     int x=10;
//     int y = 20;
// }
// class dat_25_02{
//     public static void main(String[] args){
//         System.out.println("main method start");
//         demo5 d1=new demo5();
//         System.out.println(d1);
//         demo5 d2 = new demo5();
//         System.out.println(d2);
//         demo5 d3 = new demo5();
        // System.out.println(d3);
        //System.out.println(d1.x);
        //System.out.println(d1.y);

//     }
// }



// class demo5 {
//     int x=10;
//     int y = 20;
// }
// class dat_25_02{
//     public static void main(String[] args){
//         System.out.println("main method start");
//         demo5 d1 = new demo5();
//         System.out.println(d1);
//         System.out.println(d1.x);
//         System.out.println(d1.y);
       

//     }
// }

 
// 


// class demo5 {
//     int x=10;
//     int y = 20;
// }
// class dat_25_02{
//     public static void main(String[] args){
//         System.out.println("main method start");
//         demo5 d1 = new demo5();
//         System.out.println(d1);
//         System.out.println(d1.x);
//         System.out.println(d1.y);
//         System.out.println("after modification");

//         d1.x=200;
//         d1.y=600;
//         demo5 d2 = new demo5();
//          System.out.println(d2);

//         System.out.println(d2.x);
//         System.out.println(d2.y);

//         System.out.println(d1.x);
//         System.out.println(d1.y);
       

//     }
// }


class demo5 {
    int x=10;
    int y = 20;
}
class dat_25_02{
    public static void main(String[] args){
        System.out.println("main method start");
        demo5 d1 = new demo5();
        System.out.println(d1);
        demo5 d2=d1;
        System.out.println(d2);

        System.out.println("after modification");

        d1.x=200;
        d1.y=600;

        System.out.println(d2.x);
        System.out.println(d2.y);

        System.out.println(d1.x);
        System.out.println(d1.y);
       

    }
}
