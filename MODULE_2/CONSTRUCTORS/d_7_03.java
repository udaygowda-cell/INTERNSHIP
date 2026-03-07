class circle{
    double radius;
    final static double pi =3.14;

    circle(double rad){
        System.out.println("constructor");
        radius = rad;

    }
    void diameter(){
        double dia =2*radius;
        System.out.println("diameter is"+dia);
    }
     void area(){
        double ar =pi*radius*radius;
        System.out.println("diameter is"+ar);
    }
     void cercum(){
        double cer =2*pi*radius;
        System.out.println("diameter is"+cer);
    }
}

public class d_7_03 {
    public static void main(String[] args){
        System.out.println("main");
        circle c1=new circle(1.4);
        c1.diameter();
        c1.area();
        c1.cercum();
        System.out.println("end");

    }
    
}
