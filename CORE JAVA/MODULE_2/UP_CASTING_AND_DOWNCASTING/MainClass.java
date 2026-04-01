//package MODULE_2.UP_CASTING_AND_DOWNCASTING;

public class MainClass {
    public static void main(String[] args){

        Developer d = new Developer();
        Manager.review(d);
        
         Tester s = new Tester();
         Manager.review(s);

        Debugg db = new Debugg();
        Manager.review(db);




    }
    
}
