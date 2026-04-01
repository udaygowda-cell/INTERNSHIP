//package MODULE_2.UP_CASTING_AND_DOWNCASTING;

public class Manager {

    static public void review(SoftwareEngineer sw){     
        if(sw != null){
           sw.meeting();

        if (sw instanceof Developer){
           Developer d1 =  (Developer)sw;
           d1.coding();
        }
          if (sw instanceof Tester){
           Tester s1 = (Tester)sw;
           s1.testing();
        }
        if (sw instanceof Debugg){
           Debugg db1 = (Debugg)sw;
           db1.debugging();
        }


    }
    
}
}