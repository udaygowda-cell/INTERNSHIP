//package java.CORE JAVA.MODULE_2.HasA.Example1.Example2_ MOBILE;


class Camera{
    void photo(){
   System.out.println("Photo is taken."); 
    }
}
class SimCard{
    void service(){
        System.out.println("Calling Service is on.");

    }
}

class Mobile{

    Camera cm = new Camera();
    SimCard sm ;

    Mobile(SimCard sm){
        this.sm= sm;
    }
}
public class MAinclass {

    public static void main(String[] args)
    {
        SimCard sc = new SimCard();
        Mobile mb = new Mobile(sc);
        mb.sm.service();
        mb.cm.photo();
    }
    
}
