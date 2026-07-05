package learn.composition;

public class Ticket_No {
    private int ticketno;
    private  String source;
    private  String destination;
    private String date;

    public Ticket_No(int ticketno,String source, String destination, String date) {
        this.ticketno=ticketno;
        this.source = source;
        this.destination = destination;
        this.date = date;
    }

    public int getTicketno() {
        return ticketno;
    }

    public void setTicketno(int ticketno) {
        this.ticketno = ticketno;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
