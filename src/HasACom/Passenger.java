package HasACom;

public class Passenger {
    private  int age;
    private String name;
    private String gender;
    private Ticket_no tk;

    public Passenger(Ticket_no tk, String gender, String name, int age) {
        this.tk = tk;
        this.gender = gender;
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Ticket_no getTk() {
        return tk;
    }

    public void setTk(Ticket_no tk) {
        this.tk = tk;
    }
}
