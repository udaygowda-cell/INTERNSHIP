class Pizza{

    final String type = "regular";
    int price =150;
    boolean cheese;
    String toping;
    int ch=30;

    Pizza(boolean c){
        cheese=c;
        System.out.println("pizza price  : "+price);
        if(cheese == true){
            price =price+ch;
            System.out.println("cheese price : "+ch);
        }
    }
    Pizza(boolean c, String t){
        toping=t;
        cheese=c;
        int tp=40;
        System.out.println("Toping : "+t);
        System.out.println("Toping price is : "+tp);
        price=price+50;
        if(cheese==true)
        {
         System.out.println("cheese price : "+ch);
          price = price + ch;
        }

    }
}

public class pizzamain{
    public static void main(String[] args){
        Pizza p1=new Pizza(false);
        System.out.println("Total price of your order is : "+p1.price);
        
        Pizza p2=new Pizza(false,"Mashrom");
        System.out.println("Total price of your order is : "+p2.price);
    }
}