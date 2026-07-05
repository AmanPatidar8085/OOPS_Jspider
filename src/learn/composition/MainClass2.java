package learn.composition;

public class MainClass2 {
    public static void main(String[] args) {

        Passenger p = new Passenger("aman", 23, "male", new Ticket_No(123345,"delhi", "mumbai", "21-3-2026"));
        System.out.println(p.getTk().getTicketno());
        System.out.println(p.getName());
        System.out.println(p.getAge());
        System.out.println(p.getGender());
        System.out.println(p.getTk().getSource());
        System.out.println(p.getTk().getDestination());
        System.out.println(p.getTk().getDate());
    }
}