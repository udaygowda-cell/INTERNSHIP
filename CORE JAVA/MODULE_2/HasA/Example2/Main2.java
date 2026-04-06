class Delta
{
    void play()
    {
        System.out.println("Executing.....");
    }
}
class Example{
    Delta ref;
    Example(Delta ref){
    this.ref=ref;
}
}

public class Main2
{
    public static void main(String[] args)
    {
        Delta d = new Delta();
        Example obj = new Example(d);
        obj.ref.play();
    }
}