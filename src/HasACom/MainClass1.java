package HasACom;

public class MainClass1 {
    public static void main(String[] args) {
        Passenger p=new Passenger(new Ticket_no(1,"beng","bho","22-05-2026"),"male","aman",23);
        System.out.println(p.getName());
        System.out.println(p.getAge());
        System.out.println(p.getGender());
        System.out.println(p.getTk().getSource());
        System.out.println(p.getTk().getDestination());
    }
}
