package mk.iwec.practice;

public class SwapFields {

    private int x;
    private  int y;

    public SwapFields(int x, int y) {
        this.x = x;
        this.y = y;
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

    public void swap(){
        int temp = x;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("Swapping values....");
        x = y;
        y = temp;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}
