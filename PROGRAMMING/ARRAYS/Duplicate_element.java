public class Duplicate_element {
    public static void main(String[] args)
    {
        int a[]= {12,30,40,12,12,50,30,40};

        boolean b[]=new boolean[a.length];
        for(int i= 0;i<a.length-1;i++){

            if(b[i]==false){
                int count =1;
            for(int j =i+1;j<a.length-1;j++)
            {
                if(a[i]==a[j]){
                   count++;
                   b[j]=true;
                }
            }
            if(count>1){
                System.out.println(a[i]+"--->"+count);
            }
            }
        }
    }
    
}
