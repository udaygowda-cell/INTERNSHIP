public class newww {


static boolean prime(int num){
    int count = 0;
    int a=1;
    while(a<=num/2){
        if (num%2==0){
            count++;
        }
        a++;
    }
    if(count==1){
        return true;
    }
    else{
        return false;
    }
}

public static void main(String[] args){

for (int i =0;i<=100;i++){
    boolean primes=prime(i);
    if(primes==true){
        System.out.println(i);
    }
}
}
}

    

