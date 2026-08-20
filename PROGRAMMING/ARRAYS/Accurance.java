    1
class Accurance{
    public static void main(String[] args)
    {
        int a[]={10,20,30,50,50,40,60};
        boolean b[] = new boolean[a.length];

        for(int i=0;i<a.length-1;i++)
        {
            if(b[i]==false)
            {
            int count = 1;
            for (int j=i+1;j<=a.length-1;j++)
            {
                if(a[i]==a[j])
                {
                    count++;
                    b[j]=true;
                } 
            }
               System.out.println(a[i]+"--->"+count);
            }
        }
    }
}
