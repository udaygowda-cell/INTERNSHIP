//package java.CORE JAVA.MODULE_2.PHOLYMORPHISM.COMPILE TIME POLYMORPHISM;


class Flipkart{

    void payment(){
        System.out.println("Cash on delivary");
    }
    void payment(long card){
        System.out.println("Card: no cost EMI");
    }
    void payment(String upi){
        System.out.println("UPI:15% cash back");
    }
}
public class MainClass {
    public static void main (String[] args){

        Flipkart fb = new Flipkart();

        fb.payment();

        fb.payment(124341342L);

        fb.payment("GPAY");
    }
}
