package mk.iwec.practice;

public class AirConditionerOOP {

    private int temp;
    private int humidity;

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public void run(){
        System.out.println("Air conditioner now running..");
        System.out.println("Parameters: \n" +
                            "Temperature: " + temp + "C\n" +
                            "Humidity: " + humidity + "%");

    }
}
