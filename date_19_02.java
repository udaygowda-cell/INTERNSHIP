//METHODS


// public class date_19_02 {
     
//     static void test()// should be static only. not call from static to non static
//     {
//         System.out.println("Executing test ........");
//     }

//       public static void main (String[] args){
//         System.out.println("program started");
//         test(); // calling test method
//         System.out.println("program ended");
        
              
//     }
// }




// public class date_19_02{
//     public static void main(String[] args){
//         System.out.println("Program Started");
//          test();
//          test();
//          test();
//         System.out.println("Program Ends");
//     }
// static void test()// we can call befor main or after main method...
// {
//     System.out.println("executing play");
// }
// }



// public class date_19_02{

//     static void help(){
//         System.out.println("executing help");
//     }
//     static void start(){
//         System.out.println("executing start");
//     }
//     static void run(){
//         System.out.println("execute run");
//     }
//     public static void main(String[] args){
  
//         help();   //can call n number of times
//         start();
//         run();
//     }

// }




public class date_19_02{
  
static void test()// we can call befor main or after main method...
{
    System.out.println("executing play");
    int a =7;
    if(a%2==0){
        for(int x=0;x<10;x++){
            System.out.println("jai ho");
        }  
    }
     else{
            System.out.println("out of loop");
        }
}


  public static void main(String[] args){     
         test();
    }
}