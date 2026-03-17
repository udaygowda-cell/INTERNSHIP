class student{
    int age;
    String name;
    double percentage;

    student(int age, String name, double percentage) {
        this.age = age;
        this.name = name;
        this.percentage = percentage;
    }
    
    void name(String name)
    {
       System.out.println(this.name);
    }

}
public class why{
    public static void main(String[] args)
{
 student s1 = new student(12,"uday",42.4);
 s1.name("rahul");
 //System.out.println(s1.name+" "+s1.age+" "+s1.percentage);
}
}