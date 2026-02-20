static void test()// we can call befor main or after main method...
{
    System.out.println("executing play");
    System.out.println("test ends");
}
static void run(){
    System.out.println("run starts");
    test();
    System.out.println("run ends");
}
  public static void main(String[] args){   
    System.out.println("main start");  
         run();
    System.out.println("main ends");
    }
}

