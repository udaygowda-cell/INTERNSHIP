// public class date_16_02 {
//     public static void main(String[] args){
//         int n = 5;
//         for(int i=0;i<n;i++){
//             for( int j =0; j<n;j++){
//                 if (i==0||j==0||i==n-1||j==n-1){// first row i==0, first column j==0, last row, last column
//                     System.out.print("*"+" ");
//                 }
//                 else{
//                     System.out.print(" "+" ");
//                 }
//             }
//             System.out.println();
//         }

        
//     }
// }

public class date_16_02 {
    public static void main(String[] args){
        int n = 10;
        for(int i=0;i<n;i++){
            for( int j =0; j<n;j++){
                if (i==0||j==0||i==4||j==4){
                    System.out.print("*"+" ");
                }
                else{
                    System.out.print(" "+" ");
                }
            }
            System.out.println();
        }

        
    }
}