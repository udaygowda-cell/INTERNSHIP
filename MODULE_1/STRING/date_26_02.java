83122567
//STRING

//charAt()

// public class date_26_02 {
//     public static void main(String[] args){
//         String str = "developer";
//         System.out.println(str.charAt(0));
//         System.out.println(str.charAt(5));
//         System.out.println(str.charAt(1));
//         System.out.println(str.charAt(8));
//     }
//     }

 

//length()

// public class date_26_02 {
//     public static void main(String[] args){
//         // String str = "developer";
//         // System.out.println(str.length());

//          String str = "Udaya kumar KJ";
//         System.out.println(str.length());
//     }
//     }


//toCharArray

// public class date_26_02 {
//     public static void main(String[] args){
//         String str = "developer";
//        char[] ch = str.toCharArray();
//        for(int i=0;i<ch.length;i++){
//         System.out.println(ch[i]);
//        }
//     }
//     }

//IndexOf()

// public class date_26_02 {
//     public static void main(String[] args){
//         String str = "developer";
//         System.out.println(str.indexOf('v'));
//          System.out.println(str.indexOf('p'));
//           System.out.println(str.indexOf('r'));
//           System.out.println(str.indexOf('m'));


//          int p =str.indexOf('e');
//          int q  =str.indexOf('e',p+1);
//          int r  =str.indexOf('e',q+1);
//          int s  =str.indexOf('e',r+1);
//           System.out.println(p);
//           System.out.println(q);
//           System.out.println(r);
//           System.out.println(s);//not there

//     }
//     }

//lastindexOf();

// public class date_26_02 {
//     public static void main(String[] args){
//         String str = "developer";
//         System.out.println(str.lastIndexOf('v'));
//          System.out.println(str.lastIndexOf('p'));
//           System.out.println(str.lastIndexOf('r'));
//           System.out.println(str.lastIndexOf('m'));


//          int p =str.lastIndexOf('e');
//          int q  =str.lastIndexOf('e',p-1);
//          int r  =str.lastIndexOf('e',q-1);
//          int s  =str.lastIndexOf('e',r-1);
//           System.out.println(p);
//           System.out.println(q);
//           System.out.println(r);
//           System.out.println(s);//not there

//     }
//     }



//contains(), startWith(), endWith()

public class date_26_02 {
    public static void main(String[] args){
        String str = "engineering";


        //contains
System.out.println(str.contains("job"));
System.out.println(str.contains("gin"));

//startwith
System.out.println(str.startsWith("eng"));
System.out.println(str.startsWith("Engine"));
//endswith
System.out.println(str.endsWith("engi"));
System.out.println(str.endsWith("ing"));


    }
}
//n
