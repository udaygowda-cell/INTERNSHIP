import java.util.Scanner;
class operators{

public static void main(String[] args){
// int a = 10;
// int b= 2;
//OPERATORS
// // System.out.println(a+b);
// // System.out.println(a-b);
// // System.out.println(a*b);
// // System.out.println(a/b);
// // System.out.println(a%b);
// System.out.println(a/b);
//CASTING
// double x = 7.0;
// double y = 2.0;
// System.out.println(x/y);

// System.out.println(a/y);
// System.out.println(x/b);
Scanner sc = new Scanner(System.in);

double a = sc.nextDouble();
if (a>=80&&a<=100){
	System.out.println("Distintion");
}
else if (a<80&&a>=60){
	System.out.println("first class");
}
else if(a<60&&a>=35){
	System.out.println("second class");
}
else{
	System.out.println("fail");
}
}
}
