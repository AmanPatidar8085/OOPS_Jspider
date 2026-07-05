package learn.composition;

public class Engine {
    private int hp;
    private String enginetype;

    public  Engine(int hp,String enginetype){
        this.hp=hp;
        this.enginetype=enginetype;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getEnginetype() {
        return enginetype;
    }

    public void setEnginetype(String enginetype) {
        this.enginetype = enginetype;
    }
}
