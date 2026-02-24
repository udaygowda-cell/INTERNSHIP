
    import java.util.Scanner;

class test {
public static void main(String[] args) {

    Scanner sc = new Scanner (System.in);
    int a =sc.nextInt();
    int b =sc.nextInt();
    int c =sc.nextInt();
    Calculation(a, b, c);

    System.out.println(Calculation);
    }

    static String Calculation(int a, int b, int.c){
    if(a<b&&b<c){
    return "Increasing";
    }
    elseif(a>b&&b>c){
    return "Decreasing";
    }
    else{
    return "Neither";
    }
    }
    }

