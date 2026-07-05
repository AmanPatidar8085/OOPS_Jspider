package HasACom;

public class Engine {
    private  int horsepower;
    private  String  engineType;

    public Engine(int horsepower, String engineType) {
        this.horsepower = horsepower;
        this.engineType = engineType;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }
}
