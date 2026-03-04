class blocks{
    int id;
    String name;
    double salary;

    {
        id=1;
        name="uday";
        salary=12312;
    }
}

public class date_03_03 {
    public static void main (String[] args){
        blocks b1= new blocks();
        System.out.println(b1.id);
        System.out.println(b1.name);
        System.out.println(b1.salary);
    }
    
}
