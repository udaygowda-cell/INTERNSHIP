class date13{
public static void main (String[] args){
double accbal=10000.0;
int amt = 13;
if(amt<accbal){
	
	if(amt%100==0)
	{
		System.out.println("withdrawal success");
		
	}
	else{
		
		System.out.println("invalid Denomination");
	}
}
else{
	System.out.println("Insufficinent Balance");
}
}
}