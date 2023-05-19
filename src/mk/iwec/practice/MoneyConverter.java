package mk.iwec.practice;

public class MoneyConverter {

    private float rate = 61.6f;

    public double getRate() {
        return rate;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }

    public float inEur (int amount) {
        System.out.println("Exchanging amount in EUR");
        return amount / rate;
    }

    public float inMkd (float amount) {
        System.out.println("Exchanging amount in MKD");
        return amount * rate;
    }

}
