package Constructor;
class Bank{
     final int accnum;
     double accbal;
     String cutname;

    public Bank( String cutname,double accbal, int accnum) {

        this.cutname = cutname;
        this.accbal = accbal;
        this.accnum = accnum;
    }

    void details(){
        System.out.println("name:-->"+cutname+"accbalance :-->"+accbal+"accnumber:-->"+accnum);
    }
}
public class MainClass1 {
    public static void main(String[] args) {
        Bank b=new Bank("aman",789,12345566);

        b.details();

    }
}
