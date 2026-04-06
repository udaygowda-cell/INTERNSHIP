//package EXAMPLE 5;
class Pattern{
 
  }


class FingerPrint{

}

public class Mobile {

    void unlock(int pin)
    {
      System.out.println("Mobile Unlocked Using PIN");
    }
    void unlock(String pas)
    {
      System.out.println("Mobile Unlocked Using PASSWORD");
    }
    void unlock(Pattern p)
    {
    System.out.println("Mobile Unlocked Using PATTERN");
    }
    void unlock(FingerPrint FP)
    {
     System.out.println("Mobile Unlocked Using FINGER PRINT.");
    }
}
