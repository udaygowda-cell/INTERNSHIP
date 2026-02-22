package MODULE_1;
// public class problem {
//     public static void main(String[] args){
//         int n =5;
//         int sq= n*n;
//         System.out.println(n+" square :"+sq);
//         int cb = n*n*n;
//         System.out.println(n+" cube :"+cb);


//         double radius = 4.5;
//         double pi = 3.14;
//         double circumference = 2*pi*radius;
//         System.out.println("Circumference of circle :"+circumference);
//         double area = pi*radius*radius;
//         System.out.println("Area of circle :"+area);


        

//     }
// }

// 
//P
// public class problem {
//     public static void main(String[] args){
//         int n = 5;
//         for (int i =0 ; i<n;i++){
//             for (int j =0;j<n;j++){
//                 if(i==0||j==0&&i>=n/2||j==n/2||i==n-1&&j<=n/2)
//                     {
//                     System.out.print("*"+ " ");
//                 }
//                 else{
//                     System.out.print(" "+" ");
//                 }
//             }
//             System.out.println();
//         }
// }
// }

public class problem {
    public static void main(String[] args){
        int n = 5;
        for (int i =0 ; i<n;i++){
            for (int j =0;j<n;j++){
                if(i==j)
                    {
                    System.out.print("*"+ " ");
                }
                else{
                    System.out.print(" "+" ");
                }
            }
            System.out.println();
        }
}
}