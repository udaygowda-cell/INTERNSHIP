public class mostReapeat {
    public static void main(String[] args)
    {
        int a[]={10,20,30,10,20,10,50}; 
        int mostocc=0;  
        int  mostrep=0;
        boolean b[]= new boolean[a.length];

        for(int i = 0; i<=a.length-1;i++){
            if(b[i]==false){
                int count =1;
        for(int j = i+1; j<=a.length-1;j++){
            if(a[i]==a[j]){
                count++;
                b[j]=true;
            }
        } 
        if(count>mostocc){
            mostocc=count;
            mostrep=a[i];
        }
            }
        }
        System.out.println(mostrep);
    }
}
