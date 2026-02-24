//package MODULE_2;

class demo1{
    static int x=100;
    static int y =200;

   static void test(){
        System.out.println("hello word");
    }
}
class date_23_02{
    public static void main(String[] args){
        System.out.println("main");
        System.out.println("x "+demo1.x);
        System.out.println("x "+demo1.y);
        demo1.test();
       System.out.println("end");
    }
}
