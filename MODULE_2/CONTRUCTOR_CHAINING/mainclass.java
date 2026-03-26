//package MODULE_2.CONTRUCTOR_CHAINING;

class Constuctor {

    String userName;
    String pwd;
    long cno;
    String email;
    2345678
    public Constuctor(String userName, String pwd) {
        this.userName = userName;
        this.pwd = pwd;
    }

    public Constuctor(String userName, String pwd, String email) {
        this(userName, pwd);
        this.email = email;
    }
 

    public Constuctor(String userName, String pwd, long cno, String email) {
        this(userName, pwd, email);
        this.cno = cno; 
    }
    public void display(){
        System.out.println(userName);
        System.out.println(pwd);
        System.out.println(cno);
        System.out.println(email);
    }
    }
    
public class mainclass{
        public static void main(String[] args){
            Constuctor c1 = new Constuctor("uaddg","1212q",1272837822L,"wewd");
             c1.display();

}
}
