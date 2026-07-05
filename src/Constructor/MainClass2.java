package Constructor;
record Students(int id,String name){

}
public class MainClass2 {
    public static void main(String[] args) {
       Students s1=new Students(1,"aman");
        System.out.println(s1.id());
        System.out.println(s1.name());
    }

}
