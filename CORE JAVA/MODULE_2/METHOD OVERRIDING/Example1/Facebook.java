//package java.CORE JAVA.MODULE_2.METHOD OVERRIDING.Example1;
class FacebookOld{

    void reaction()
    {
        System.out.println("Like");
    }
}

class FacebookNew extends FacebookOld{

    @Override
    void reaction()
    {
        System.out.println("like,comment,angry");
    }
}

class React{
    void disp(FacebookOld fp)
    {
        if(fp!=null)
        {
            fp.reaction();
        }
    }
}

public class Facebook {
    public static void main (String[] args){

        React r = new React();
        // FacebookOld fo = new FacebookOld();
        // fo.reaction();
        FacebookNew fn = new FacebookNew();
        r.disp(fn);
       
    }
}


