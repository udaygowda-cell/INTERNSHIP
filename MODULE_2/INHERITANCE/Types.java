//SINGLE LEVEL INHERITANCE
cc
// class A{
//     void message(){
//         System.out.println("Message is access.");
//     }
// }
// class B extends A{
//      void reels(){
//         System.out.println("New reels option is added.");
//     }
//     void post(){
//         System.out.println("POSting new post and blue tick.");
//     }
// }

// public class Types {
//     public static void main (String[] args){
//          A I1 = new A();
//             I1.message();
//         B I2 = new B();
//             I2.message();
//             I2.reels();
//             I2.post();
//         }
    
// }

// //MULTI LEVEL INHERITANCE
// class A{
//     void message(){
//         System.out.println("Message is access.");
//     }
// }
// class B extends A{
//      void reels(){
//         System.out.println("New reels option is added.");
//     }

// }

// class C extends B{
//     void post(){
//         System.out.println("POSting new post and blue tick.");
//     }
// }


// public class Types {
//     public static void main (String[] args){
//         A I1 = new A();
//             I1.message();
//         B I2 = new B();
//             I2.message();
//             I2.reels();
//         C I3 = new C();
//             I3.message();
//             I3.reels();
//             I3.post();
//         }
    
// }


// //HIERACHICAL INHERITANCE
// class A{
//     void message(){
//         System.out.println("Message is access.");
//     }
// }
// class B extends A{
//      void reels(){
//         System.out.println("New reels option is added.");
//     }

// }
// class C extends A{
//     void post(){
//         System.out.println("POSting new post and blue tick.");
//     }
// }


// public class Types {
//     public static void main (String[] args){
//         A I1 = new A();
//             I1.message();
//         B I2 = new B();
//             I2.message();
//             I2.reels();
//         C I3 = new C();
//             I3.message();
//             I3.post();
//         }
    
// }


//HYBRID INHERITANCE
class A{
    void message(){
        System.out.println("Message is access.");
    }
}
class B extends A{
     void reels(){
        System.out.println("New reels option is added.");
    }
}
class C extends B{
    void post(){
        System.out.println(" C POSting new post and blue tick.");
    }
}

class D extends A{
    void call(){
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
        C I3 = new C();
            I3.message();
            I3.message();
            I3.post();
        D I4 = new D();
            I4.message();
            I4.call();

        }
    
}
