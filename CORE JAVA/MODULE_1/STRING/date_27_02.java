// //EQUALS(), EQUALSIGNORECASE()
// public class date_27_02 {
//     public static void main(String[] args){
//         String str ="j2ee";
12
//         System.out.println(str.equals("adv java"));
//         System.out.println(str.equals("J2ee"));
//         System.out.println(str.equals("j2ee"));

        
//         System.out.println(str.equalsIgnoreCase("adv java"));
//         System.out.println(str.equalsIgnoreCase("J2ee"));
//         System.out.println(str.equalsIgnoreCase("j2ee"));

//     }
// }



//trim
// public class date_27_02 {
//     public static void main(String[] args){
//         String str ="       core    java    ";

//         System.out.println("---->"+str+"<----");
//         System.out.println("---->"+str.trim()+"<----");
   

      

//     }
// 


//toUpperCase(), toLowercase()

//  public class date_27_02 {
//     public static void main(String[] args){
//         String str = "Uday kumar K J";
//         System.out.println(str.toUpperCase());
//         System.out.println(str.toLowerCase());
//     }
// }


//substring

//  public class date_27_02 {
//     public static void main(String[] args){
//         String str = "Uday kumar K J";
//         System.out.println(6);
//         System.out.println(4);

//         System.out.println(str.substring(3,8));
//         System.out.println(str.substring(0,7));
//     }
// }

//split

 public class date_27_02 {
    public static void main(String[] args){
        String str = "qspider jspider pyspider prospider";
        String[] arr=str.split(" ");
       
        for(int i=0;i<arr.length;i++){
           System.out.println(arr[i]);

        }
       
       
        
    }
}
