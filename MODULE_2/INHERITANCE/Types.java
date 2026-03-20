//SINGLE LEVEL INHERITANCE

class A{
    void message(){
        System.out.println("Message is access.");
    }
}
class B extends A{
     void reels(){
        System.out.println("New reels option is added.");
    }
    void post(){
        System.out.println("POSting new post and blue tick.");
    }
}

public class Types {
    public static void main (String[] args){
         A I1 = new A();
            I1.message();
        B I2 = new B();
            I2.message();
            I2.reels();
            I2.post();
        }
    
}
