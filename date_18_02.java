//DO- WHILE LOOP

// public class date_18_02 { 
//     public static void main(String[] args){
      
//   int a =1;

//   do{
//     System.out.println("java");
//     a++;
//   }
//     while(a<5);
        
//     }    
// }


// public class date_18_02 { 
//     public static void main(String[] args){
      
//   int a =5;

//   do{
//     System.out.println(a+ " java");
//     a--;
//   }
//     while(a>=1);
        
//     }    
// }


// public class date_18_02 { 
//     public static void main(String[] args){
//   int num =10;    
//   int a =1;
//   //int b = num/2;
// while (a<=num/2){// a<=b
//     if (num%a==0){
//         System.out.println(a);
//     }
//     a++;
        
//     }    
// }
// }




// public class date_18_02 { 
//     public static void main(String[] args){
//   int num =15;    
//   int a =1;
//   int sum=0;
//   //int b = num/2;
// while (a<=num/2){// a<=b
//     if (num%a==0){
//         sum = sum + a;
//     }
//     a++;
        
//     }  
//        System.out.println("sum is "+ sum);//sum of factors of num  
// }
// }




public class date_18_02 { 
    public static void main(String[] args){
  int num =28;    
  int a =1;
  int sum=0;
  //int b = num/2;
while (a<=num/2){// a<=b
    if (num%a==0){
        sum = sum + a;
    }
    a++;
        
    }  
       System.out.println("sum is "+ sum);//sum of factors of num  
         if (sum==num){
          System.out.println(num+" is a perfect number");
         }
         else{
          System.out.println(num+" is not a perfect number");
         }
}
}