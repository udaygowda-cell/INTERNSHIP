public class Mainclass {
    public static void main(String[] args){
        Customer c = new Customer();
        Bank icic = new Bank(c);
        Bank idb = new Bank(c);
        idb.cc.acc.deposit();

    }
}
