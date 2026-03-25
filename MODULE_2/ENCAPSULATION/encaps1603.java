//package MODULE_2.ENCAPSULATION;

// public class en1603
//  {
//     public static void main (String[] args)
//     {
//         Employee e1 = new Employee();
//          Employee.work();
//     }
//     }

// class Employee 
// {
//     static int a = 22;
//    static void work()
//     {
//         System.out.println("Employee is working.");
//         System.out.println("static box"+a);
//     }
//     {
//         System.out.println("non static."+a);
//     }
// }
    

 class Student{

    private String name;
    private int age;
    private double percentage;

    public void setName(String name)
    {
        this.name=name;
    }
    public void setAge(int age)
    {
        if(age>=0 && age <= 100)
        {
           this.age=age;
        }
        else
        {
            System.out.println("Inavalid Age.");
        }
    }
    public void setPercentage(double percentage)
    {
        if(percentage >= 0 && percentage <= 100)
        {
           this.percentage=percentage;
        }
        else
        {
            System.out.println("Inavalid Percentage.");
        }

    }

    public String getName()
        {
        return this.name;
        }
    public int getAge()
    {
       return this.age;
    }
    public double getPercentage(){
        return this.percentage;
    }
}
//e
 public class encaps1603{
    public  static void main(String[] args){
        Student s1 = new Student();
        s1.setName("uday kumar");
        s1.setAge(44);
        s1.setPercentage(180.22);
        System.out.println(s1.getName()+" "+s1.getAge()+" "+s1.getPercentage());

    }
 }
 