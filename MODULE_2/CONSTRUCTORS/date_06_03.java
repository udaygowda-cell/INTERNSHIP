//constuctor
// class demo1{
//     demo1(){
//         System.out.println("demo run");
//     }
// }

// public class date_06_03 {
//     public static void main (String[] args){
//         System.out.println("Main class ");
//         new demo1();
//         System.out.println("end main class");
//     }
// }


class demo1{
    demo1(){
        System.out.println("constuctor  run");
    }
    {
        System.out.println("1st block programming");

    }
    {
        System.out.println("2nd block programming");
    }
}

public class date_06_03 {
    public static void main (String[] args){
        System.out.println("Main class ");
        new demo1();
        System.out.println("end main class");
    }
}
