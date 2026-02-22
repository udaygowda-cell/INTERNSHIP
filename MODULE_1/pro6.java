//package MODULE_1;
public class pro6 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20; 
        System.out.println("Before swapping:");
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        a = a + b; // a now holds the sum of a and b
        b = a - b; // b now holds the original value of a   
        a = a - b; // a now holds the original value of b
        System.out.println("After swapping:");  
        System.out.println("a: " + a);
        System.out.println("b: " + b);

        // int c = a ;
        // a = b;
        // b = c;
        // System.out.println("a: " + a);
        // System.out.println("b: " + b);
    }
    
}
