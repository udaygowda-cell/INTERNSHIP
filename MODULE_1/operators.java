package MODULE_1;
import java.util.Scanner;
class operators{

public static void main(String[] args){

Scanner ns = new Scanner(System.in);

double a = ns.nextDouble();
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
