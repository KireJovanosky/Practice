package mk.iwec.practice;

public class Car {

    private String manufacturer;
    private String model;
    private String color;
    private boolean registered;
    private int mileage;
    private int numberOfDoors;
    private CarEngine engine;

    public Car(String manufacturer, String model, String color, boolean registered, int mileage, int numberOfDoors, CarEngine engine) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.color = color;
        this.registered = registered;
        this.mileage = mileage;
        this.numberOfDoors = numberOfDoors;
        this.engine = engine;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isRegistered() {
        return registered;
    }

    public void setRegistered(boolean registered) {
        this.registered = registered;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public CarEngine getEngine() {
        return engine;
    }

    public void setEngine(CarEngine engine) {
        this.engine = engine;
    }

    public void accelerate(){
        System.out.println("Your " + manufacturer + " " + model + " is now accelerating to 100 mph");
    }

    public void slowDown(){
        System.out.println("Your " + manufacturer + " " + model + " is now slowing down..");
    }

    public void brake(){
        System.out.println("Your " + manufacturer + " " + model + " is braking");
    }
}
