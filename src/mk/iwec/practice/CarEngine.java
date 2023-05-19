package mk.iwec.practice;

public class CarEngine {

    private EngineType engineType;
    private int capacity;
    private int power;

    public CarEngine(EngineType engineType, int capacity, int power) {
        this.engineType = engineType;
        this.capacity = capacity;
        this.power = power;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public void setEngineType(EngineType engineType) {
        this.engineType = engineType;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
