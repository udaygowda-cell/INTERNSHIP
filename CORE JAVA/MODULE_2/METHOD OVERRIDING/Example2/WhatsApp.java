//package java.CORE JAVA.MODULE_2.METHOD OVERRIDING.Example2;

class WhatsApp1{

    void message(){
        System.out.println("Single tick");
    }
}
class WhatsApp2 extends WhatsApp1{
    @Override
    void message(){
        System.out.println("Double tick");
    }
}
class WhatsApp3 extends WhatsApp2{
    @Override
    void message(){
        System.out.println("Blue tick");
    }
}


public class WhatsApp {
    public static void main(String[] args){
        WhatsApp1 w1 = new WhatsApp1();
        w1.message();
        WhatsApp2 w2 = new WhatsApp2();
        w2.message();
        WhatsApp1 w3 = new WhatsApp3();
        w3.message();

        WhatsApp1 w4 = new WhatsApp3();
        w4.message();
        WhatsApp1 w5 = new WhatsApp2();
        w5.message();
        
        
    }
    
}
