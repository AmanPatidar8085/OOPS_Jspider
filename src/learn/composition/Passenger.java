package learn.composition;

public class Passenger {
    private  String name;
    private  int age;
    private  String gender;
    private  Ticket_No tk;

    public Passenger(String name, int age, String gender, Ticket_No tk) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.tk = tk;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Ticket_No getTk() {
        return tk;
    }

    public void setTk(Ticket_No tk) {
        this.tk = tk;
    }
}
