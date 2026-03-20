//package MODULE_2.INHERITANCE;

class InstaOld{
    void message(){
        System.out.println("Message is access.");
    }
}
class InstaNew extends InstaOld{
     void reels(){
        System.out.println("New reels option is added.");
    }
    void post(){
        System.out.println("POSting new post and blue tick.");
    }
}

public class Insta {
    public static void main (String[] args){
           InstaNew I1 = new InstaNew();
            I1.message();
            I1.reels();
            I1.post();
        }
    
}
