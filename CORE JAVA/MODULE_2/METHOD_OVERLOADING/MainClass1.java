class Demo {
    void test (int a){
        System.out.println("White box testing..");
    }
     void test (double d){
        System.out.println("Black box testing..");
    }
     void test (String s){
        System.out.println("Red box testing..");
    }
}
public class MainClass1{
    public static void main(String[] args){
        Demo ref = new Demo();
        ref.test(10);
        ref.test(2.5);
        ref.test("ABCD");
    }
}
