
//verify
public class date_21_02 {
    static boolean verify(int a){
        if (a%2==0){
            return true;
        }
        else{
            return false;
        }
    }
public static void main(String[] args){
    System.out.println("status "+ verify(10));
    System.out.println("status "+ verify(15));
}
    
}
