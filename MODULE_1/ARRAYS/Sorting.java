12579
012

// public class Sorting {
//     public static void main(String[] args )
// {
//  int [] a={14,12,15,18,16};
//  System.out.println("Before sorting ");
//  for(int i=0;i<a.length;i++){
//     System.out.println(a[i]);
//  }
//  for(int i=0;i<a.length;i++)
//  {
//     for(int j =i+1;j<a.length;j++){
//         if(a[i]>a[j])
//             {
//             int t= a[i];
//             a[i]=a[j];
//             a[j]=t;
//         }
//     }
// }
//   System.out.println("array after sorting");
//    for(int i=0;i<a.length;i++){
  
// System.out.println(+a[i]);
//     }
    

//  }
// }

import java.util.Arrays; 
public class Sorting { 
    public static void main(String[] args ) { 
        int [] a={14,12,15,18,16}; 
        Arrays.sort(a); // Sorts the array in-place
        System.out.println(Arrays.toString(a)); // Prints the sorted array contents
    } 
}

//sort
