//package EXAMPLE 5;

public class MainClass {
  public static void main(String[] args){
    Mobile M = new Mobile();

    M.unlock(1212);
    M.unlock("!@!@#");

    Pattern p = new Pattern();
    M.unlock(p);

  }
    
}
