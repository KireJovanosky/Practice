package mk.iwec.practice;

import java.util.Random;

public class ArithmeticMiddle {

    private int x;
    private int y;
    private int z;

    public static final int LIMIT = 100;

    public ArithmeticMiddle() {
        Random random = new Random();
        x = random.nextInt(LIMIT);
        y = random.nextInt(LIMIT);
        z = random.nextInt(LIMIT);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public float calculate(){
        return  (float) (x + y + z) / 3;
    }

}
