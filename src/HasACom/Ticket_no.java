package HasACom;

public class Ticket_no {
    private int ticket_no;
    private String source;
    private String Destination;
    private String Date;

    public Ticket_no(int ticket_no, String source, String destination, String date) {
        this.ticket_no = ticket_no;
        this.source = source;
        Destination = destination;
        Date = date;
    }

    public int getTicket_no() {
        return ticket_no;
    }

    public void setTicket_no(int ticket_no) {
        this.ticket_no = ticket_no;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return Destination;
    }

    public void setDestination(String destination) {
        Destination = destination;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }
}
